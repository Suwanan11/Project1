package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    public static Result Goal() {
        return ok(Goal.render());
    }
    public static Result Intarest() {
        return ok(Intarest.render());
    }
    public static Result Local() {
        return ok(Local.render());
    }
    public static Result Profiles() {
        return ok(Profile.render());
    }
    public static Result project1() {
        return ok(project1.render());
    }

}


