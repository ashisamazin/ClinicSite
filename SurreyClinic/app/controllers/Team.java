package controllers;

import java.util.List;

import models.TeamMember;
import play.mvc.Controller;

public class Team extends Controller {

    public static void index() {
    	List<TeamMember> teamMembers = TeamMember.findAll();
        render(teamMembers);
    }

}
