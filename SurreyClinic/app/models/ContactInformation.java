package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class ContactInformation extends Model
{

	private String address;
	private String phone;

	public ContactInformation(String address, String phone)
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

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@Override
	public String toString()
	{
		return "Contact Information";
	}

}
