package controllers;

import java.util.List;

import models.ContactDetails;
import play.mvc.Controller;

public class Contact extends Controller
{

	public static void index()
	{
		List<ContactDetails> contactDetails = ContactDetails.findAll();
		if (contactDetails != null && contactDetails.size() > 0)
		{
			ContactDetails contact = contactDetails.get(0);
			render(contact);
		}
		render();
	}

}
