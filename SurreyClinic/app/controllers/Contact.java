package controllers;

import java.util.List;

import models.ContactInformation;
import play.mvc.Controller;

public class Contact extends Controller
{

	public static void index()
	{
		List<ContactInformation> contactDetails = ContactInformation.findAll();
		if (contactDetails != null && contactDetails.size() > 0)
		{
			ContactInformation contact = contactDetails.get(0);
			render(contact);
		}
		render();
	}

}
