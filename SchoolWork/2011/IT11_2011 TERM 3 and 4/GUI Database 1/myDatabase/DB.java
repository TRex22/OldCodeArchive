package myDatabase;

import java.sql.*;

//import javax.swing.JOptionPane;

public class DB {
	Connection conn;
	public DB()
	{
		try {
			Class.forName("sun.jdbc.odbc.Jdbc0dbcDriverr");
		}
		catch (ClassNotFoundException e)
		{
			System.err.println ("Databse Driver...re98wyb4hjuy4gb Not Working ");
		}
		try {
			conn = DriverManager.getConnection("jdbc:odbc:DRIVER="+"{Microsoft Access Driver (*.mdb)};DBQ= dbMedia.mdb");
			System.out.println("The Database now working oi3e764785yvb");
		} catch (SQLException e) {
			System.err.println("Database working not :( | irhgf34iu324");
		}

	}
	public String display(String sqlstmt)
	{
		String output = "";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlstmt);
			ResultSetMetaData meta = rs.getMetaData();
			int size = meta.getColumnCount();

			//headings
			String underline ="";
			for (int i =1; i<= size; i++)
			{
				String heading = meta.getColumnName(i);
				output = output + heading + "\t";
				for (int j = 0; j<heading.length();j++)
				{
					underline +='-';
				}
				underline +="\t";
			}
			output = output + "\n"+underline+"\n";
			//content?
			while (rs.next())
			{
				for (int i =1; i <=size; i++)
				{
					Object value = rs.getObject(i);
					output = output + value + "\t";
				}
				output = output + "\n";
			}

		} catch (SQLException e) {
			output = "ERRRRRRR WHY? "+e;
		}



		return output;
	}









}
