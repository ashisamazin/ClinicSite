package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Clinic extends Model
{
	@Required
	private String name;
	@Required
	private String clinicHours;
	@Lob
	@Required
	@MaxSize(10000)
	private String address;
	@Required
	private String postcode;

	public Clinic(String name, String clinicHours, String address, String postcode)
	{
		super();
		this.name = name;
		this.clinicHours = clinicHours;
		this.address = address;
		this.postcode = postcode;
	}

	public String getName()
	{
		return name;
	}

	public String getClinicHours()
	{
		return clinicHours;
	}

	public String getAddress()
	{
		return address;
	}

	public String getHTMLEscapedAddress()
	{
		if (address != null)
		{
			return address.replaceAll("\n", "<br/>");
		}
		return address;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setClinicHours(String clinicHours)
	{
		this.clinicHours = clinicHours;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	public String getMapsURL()
	{
		return "http://maps.googleapis.com/maps/api/staticmap?center=" + postcode
				+ "&zoom=13&size=300x200&maptype=roadmap&sensor=false&markers=" + postcode;
	}

	@Override
	public String toString()
	{
		return name;
	}

}
