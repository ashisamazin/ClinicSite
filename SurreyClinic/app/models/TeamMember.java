package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class TeamMember extends Model
{

	@Required
	private String name;
	@Required
	private String jobTitle;
	@Lob
	@Required
	@MaxSize(10000)
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

	public void setName(String name)
	{
		this.name = name;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
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
