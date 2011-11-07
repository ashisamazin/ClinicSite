package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class HomeModel extends Model
{

	private String title;
	private String titleType;
	@OneToMany
	private List<Paragraph> paragraphs;

	public HomeModel(String title, String titleType, List<Paragraph> paragraphs)
	{
		super();
		this.title = title;
		this.titleType = titleType;
		this.paragraphs = paragraphs;
	}

	public String getTitle()
	{
		return title;
	}

	public String getTitleType()
	{
		return titleType;
	}

	public List<Paragraph> getParagraphs()
	{
		return paragraphs;
	}
	
	

}
