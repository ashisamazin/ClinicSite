package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Clinic extends Model
{
	private String name;
	private String clinicHours;
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

	public String getImageLocation()
	{
		return imageLocation;
	}

}
