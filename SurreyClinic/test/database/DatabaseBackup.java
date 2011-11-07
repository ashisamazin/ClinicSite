package database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Clinic;
import models.ContactInformation;
import models.HomeModel;
import models.TeamMember;

import com.google.gson.Gson;

public class DatabaseBackup
{

	private static final String DB_URL = "jdbc:h2:file:C:/git-repo/SurreyClinic/SurreyClinic/db/h2/play";
	private static Connection conn;
	private static final Gson gson = new Gson();

	private static void setup() throws SQLException
	{
		conn = DriverManager.getConnection(DB_URL, "sa", "");

	}

	private static void backupHomePage() throws SQLException, IOException
	{
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM HOMEMODEL";
		// Execute the query
		ResultSet results = statement.executeQuery(query);
		List<HomeModel> homeData = new ArrayList<HomeModel>();
		while (results.next())
		{
			homeData.add(new HomeModel(results.getString(3), results.getString(4), results
					.getString(2)));
		}
		File f = new File("test/database/homePageBackup.txt");
		if (f.exists())
		{
			f.delete();
		}
		FileWriter writer = new FileWriter(f);
		writer.write(gson.toJson(homeData));
		writer.close();
	}

	private static void backupClinics() throws SQLException, IOException
	{
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM CLINIC";
		// Execute the query
		ResultSet results = statement.executeQuery(query);
		List<Clinic> clinicData = new ArrayList<Clinic>();
		while (results.next())
		{
			clinicData.add(new Clinic(results.getString(3), results.getString(4), results
					.getString(2), results.getString(2)));
		}
		File f = new File("test/database/clinicsBackup.txt");
		if (f.exists())
		{
			f.delete();
		}
		FileWriter writer = new FileWriter(f);
		writer.write(gson.toJson(clinicData));
		writer.close();
	}

	private static void backupContact() throws SQLException, IOException
	{
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM CONTACTINFORMATION";
		// Execute the query
		ResultSet results = statement.executeQuery(query);
		ContactInformation contactInformation = null;
		if (results.next())
		{
			contactInformation = new ContactInformation(results.getString(3), results.getString(4),
					results.getString(2));
		}
		File f = new File("test/database/contactBackup.txt");
		if (f.exists())
		{
			f.delete();
		}
		FileWriter writer = new FileWriter(f);
		writer.write(gson.toJson(contactInformation));
		writer.close();
	}

	private static void backupTeamMembers() throws SQLException, IOException
	{
		Statement statement = conn.createStatement();
		String query = "SELECT * FROM TEAMMEMBER";
		// Execute the query
		ResultSet results = statement.executeQuery(query);
		List<TeamMember> teamData = new ArrayList<TeamMember>();
		while (results.next())
		{
			teamData.add(new TeamMember(results.getString(3), results.getString(4), results
					.getString(2), results.getString(2)));
		}
		File f = new File("test/database/teamMemberBackup.txt");
		if (f.exists())
		{
			f.delete();
		}
		FileWriter writer = new FileWriter(f);
		writer.write(gson.toJson(teamData));
		writer.close();
	}

	/**
	 * @param args
	 * @throws SQLException
	 * @throws IOException
	 */
	public static void main(String[] args) throws SQLException, IOException
	{
		setup();
		backupHomePage();
		backupClinics();
		backupContact();
		backupTeamMembers();
	}
}
