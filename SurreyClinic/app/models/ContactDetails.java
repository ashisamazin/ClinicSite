package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class ContactDetails extends Model
{

	private String address;
	private String phone;

	public ContactDetails(String address, String phone)
	{
		super();
		this.address = address;
		this.phone = phone;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}

}
