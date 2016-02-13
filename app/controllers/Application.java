package controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.UserEvent;
import play.libs.Json;
import play.mvc.*;

import service.EventService;

import javax.inject.Inject;
import java.io.IOException;

public class Application extends Controller {


    @Inject
    EventService eventService;

    public Result index() {
        return ok("Your new application is ready.");
    }

    public Result sendUserEvent() {
        JsonNode jsonNode = request().body().asJson();
        UserEvent userEvent = Json.fromJson(jsonNode, UserEvent.class);
        eventService.save(userEvent);

        return ok("OK");

    }

}
