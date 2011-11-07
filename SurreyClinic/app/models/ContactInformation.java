package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class ContactInformation extends Model
{
	@Lob
	@Required
	@MaxSize(10000)
	private String address;
	@Required
	private String phone;
	@Lob
	@MaxSize(10000)
	private String summary;

	public ContactInformation(String address, String phone, String summary)
	{
		super();
		this.address = address;
		this.phone = phone;
		this.summary = summary;
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

	public String getSummary()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	public String getAddressAsHTML()
	{
		if (address != null)
		{
			return address.replaceAll("\n", "<br/>");
		}
		return address;
	}
	
	public String getSummaryAsHTML()
	{
		if (summary != null)
		{
			return summary.replaceAll("\n", "<br/>");
		}
		return summary;
	}

	@Override
	public String toString()
	{
		return "Contact Information";
	}

}
