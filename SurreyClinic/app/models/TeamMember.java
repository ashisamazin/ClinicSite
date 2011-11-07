package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class TeamMember extends Model
{

	private String name;
	private String jobTitle;
	private String summary;
	private String imageLocation;

	public TeamMember(String name, String jobTitle, String summary, String imageLocation)
	{
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.summary = summary;
		this.imageLocation = imageLocation;
	}

	public String getName()
	{
		return name;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public String getSummary()
	{
		return summary;
	}

	public String getImageLocation()
	{
		return imageLocation;
	}

}
