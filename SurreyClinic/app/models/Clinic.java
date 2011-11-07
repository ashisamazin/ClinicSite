package models;

import javax.persistence.Entity;

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
	@Required
	@MaxSize(10000)
	private String address;

	private String imageLocation;

	public Clinic(String name, String clinicHours, String address, String imageLocation)
	{
		super();
		this.name = name;
		this.clinicHours = clinicHours;
		this.address = address;
		this.imageLocation = imageLocation;
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

	public String getImageLocation()
	{
		return imageLocation;
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

	public void setImageLocation(String imageLocation)
	{
		this.imageLocation = imageLocation;
	}

	@Override
	public String toString()
	{
		return name;
	}

}
