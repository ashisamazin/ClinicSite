package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Paragraph extends Model {
 
	private String paragraph;

	public Paragraph(String paragraph)
	{
		super();
		this.paragraph = paragraph;
	}

	public String getParagraph()
	{
		return paragraph;
	}

	public void setParagraph(String paragraph)
	{
		this.paragraph = paragraph;
	}
	
}
