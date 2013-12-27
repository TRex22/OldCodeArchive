package myGUIProject;
import java.sql.*;

import javax.swing.JOptionPane;


public class DBCode {
	Connection conn;
	public DBCode()
	{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch (ClassNotFoundException e)
		{
			System.err.println ("Sun Databse Driver Error | Code 1");
			JOptionPane.showMessageDialog(null, "Sun Databse Driver Error | Code 1","Error", JOptionPane.ERROR_MESSAGE);
		}
		try {
			conn = DriverManager.getConnection("jdbc:odbc:DRIVER="+"{Microsoft Access Driver (*.mdb)};DBQ= DatabaseProject.mdb");
			System.out.println("The Database is now working | Code 0");
			JOptionPane.showMessageDialog(null,"The Database is now working | Code 0");
		} catch (SQLException e) {
			System.err.println("Database Connection Failed | Code 2 ");
			JOptionPane.showMessageDialog(null, "Database Connection Failed | Code 2 ","Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	public String Display(String QueryCode)
	{
		String output = "";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QueryCode);
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
			output = "SQL Exception, There is an error in the SQL Statement | Code 3 \n"+e;
			JOptionPane.showMessageDialog(null, "SQL Exception, There is an error in the SQL Statement | Code 3\n"+e,"Error", JOptionPane.ERROR_MESSAGE);
		}



		return output;
	}
}
