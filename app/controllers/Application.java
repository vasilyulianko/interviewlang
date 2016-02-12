package controllers;

import model.UserEvent;
import play.mvc.*;

import service.EventService;
import service.EventServiceImpl;

import javax.inject.Inject;

public class Application extends Controller {


    @Inject
    EventService eventService;

    public Result index() {
        return ok("Your new application is ready.");
    }

    //@BodyParser.Of(BodyParser.Json.class)
    public Result sendUserEvent() {

        UserEvent userEvent = new UserEvent();
        userEvent.setSchool("school");
        eventService.saveUserEvent(userEvent);

        return ok("TEST");

    }

}
