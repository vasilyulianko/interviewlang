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

    public Result sendUserEvent() throws IOException {

        JsonNode jsonNode = request().body().asJson();
        String jsonString = Json.stringify(jsonNode);

        ObjectMapper mapper = new ObjectMapper()
                // enable features and customize the object mapper here ...
                .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);


        UserEvent userEvent = mapper.readValue(jsonString, UserEvent.class);




        eventService.save(userEvent);

        return ok("OK");

    }

}
