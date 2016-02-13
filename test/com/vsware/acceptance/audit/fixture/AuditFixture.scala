package com.vsware.acceptance.audit.fixture

import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.Date

import model.UserEvent

/**
 * Created by noelking on 12/02/2016.
 */
object AuditFixture {

  def createEventDTO() : UserEvent  = {
    val event = new UserEvent()
    event.setEventTime(new Date())
    event.setSchool("11")
    event.setUser(21l)
    event.setUserRole("PRINCIPAL")
    event.setAffectedUser(2l)
    event.setComponent("SMS")
    event.setFeature("Parent SMS")
    event.setSubfeature("Subfeature")
    event.setAction("SEND SMS")
    event.setQuantity(BigDecimal.ONE)
    event.setPayload("{}")
    return event;
  }

}
