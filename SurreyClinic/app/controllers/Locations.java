package controllers;

import java.util.List;

import models.Clinic;
import play.mvc.Controller;

public class Locations extends Controller {

    public static void index() {
    	List<Clinic> clinicLocations = Clinic.findAll();
    	render(clinicLocations);
    }

}
