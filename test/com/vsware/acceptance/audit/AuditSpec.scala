package com.vsware.acceptance.audit

import com.fasterxml.jackson.databind.ObjectMapper
import com.vsware.acceptance.audit.fixture.AuditFixture
import org.scalatestplus.play.{PlaySpec, OneServerPerSuite}
import org.scalatest._
import play.libs.Json
import play.api.libs.ws.WS
import play.api.test._
import play.api.test.Helpers._
import org.scalatestplus.play._
import play.Logger

/**
 * Created by noelking on 12/02/2016.
 */
class AuditSpec  extends PlaySpec with OneServerPerSuite {

  val myPublicAddress = s"localhost:$port"
  val testPaymentGatewayURL = s"http://$myPublicAddress"
  var mapper: ObjectMapper = new ObjectMapper

  "test server logic" in {
    // The test payment gateway requires a callback to this server before it returns a result...
    val callbackURL = s"http://$myPublicAddress/callback"
    // await is from play.api.test.FutureAwaits
    val response = await(WS.url(testPaymentGatewayURL).withQueryString("callbackURL" -> callbackURL).get())

    response.status mustBe (OK)
  }


  "test saving event" in {
    val myPublicAddress =  s"localhost:$port"
    val saveUrl = s"http://$myPublicAddress/user"
    val auditEvent = AuditFixture.createEventDTO();
    val auditJson = play.api.libs.json.Json.parse(Json.stringify(Json.toJson(auditEvent)))

    // The test payment gateway requires a callback to this server before it returns a result...
    val callbackURL = s"http://$myPublicAddress/callback"
    // await is from play.api.test.FutureAwaits
    val response = await(WS.url(saveUrl).post(auditJson))
    Logger.info(response.body)
    response.status mustBe (OK)
  }

}


