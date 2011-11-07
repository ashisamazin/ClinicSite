package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class HomeModel extends Model
{

	@Required
	private String title;
	@Required
	private String titleType;
	@Lob
	@Required
	@MaxSize(10000)
	private String content;

	public HomeModel(String title, String titleType, String content)
	{
		super();
		this.title = title;
		this.titleType = titleType;
		this.content = content;
	}

	public String getTitle()
	{
		return title;
	}

	public String getTitleType()
	{
		return titleType;
	}

	public String getContent()
	{
		return content;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setTitleType(String titleType)
	{
		this.titleType = titleType;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getContentAsHTML()
	{
		if (content != null)
		{
			return content.replaceAll("\n", "<br/>");
		}
		return content;
	}

	@Override
	public String toString()
	{
		return title;
	}

}
