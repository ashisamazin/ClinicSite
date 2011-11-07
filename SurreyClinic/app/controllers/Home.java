package controllers;

import java.util.List;

import models.HomeModel;
import play.mvc.Controller;

public class Home extends Controller {

    public static void index() {
    	List<HomeModel>  homeModel= HomeModel.findAll();
        render(homeModel);
    }

}
