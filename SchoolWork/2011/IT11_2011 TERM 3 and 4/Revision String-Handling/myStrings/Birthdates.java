package myStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Birthdates {

	/**
	 * Use the scanner class to read the first names,
	 * surnames and birthdates (in format yymmdd) from txt file
	 * Display initials, surname and complete birthdate for each person in format:
	 * F. P. Jackson born 20 May 1989
	 */
	public static void main(String[] args) {

		Scanner scFile;
		try {
			scFile = new Scanner(new File("Birthdates.txt"));
			String message = "";
			while (scFile.hasNext())
			{
				String line = scFile.nextLine();
				Scanner scLine = new Scanner(line).useDelimiter("#");
				String name = scLine.next();
				String sur = scLine.next();
				String birth = scLine.next();

				String BYY = birth.substring(0,2);
				String BMM = birth.substring(2,4);
				String BDD = birth.substring(4,6);
				Scanner iniN = new Scanner(name);
				String initials = "";//+name.charAt(0)+". ";

				while (iniN.hasNext())
				{
					initials += iniN.next().charAt(0)+". ";
				}

				int month = Integer.parseInt(BMM);
				String date = "";
				switch (month)
				{
				case 1: date = "January"; break;
				case 2: date = "February"; break;
				case 3: date = "March"; break;
				case 4: date = "April"; break;
				case 5: date = "May"; break;
				case 6: date = "June"; break;
				case 7: date = "July"; break;
				case 8: date = "August"; break;
				case 9: date = "September"; break;
				case 10: date = "October"; break;
				case 11: date = "November"; break;
				case 12: date = "December"; break;
				default: message = "Date Error"; break;
				}

				message += ""+initials+sur+" Born "+BDD+" "+date+" 19"+BYY+"\n";

				scLine.close();



			}

			JOptionPane.showMessageDialog(null, message);


			scFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}

}
