package controllers;

import model.UserEvent;
import play.*;
import play.db.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application extends Controller {



    public Result index() {
        return ok("Your new application is ready.");
    }


    public Result sendUserEvent() {

    }

}
