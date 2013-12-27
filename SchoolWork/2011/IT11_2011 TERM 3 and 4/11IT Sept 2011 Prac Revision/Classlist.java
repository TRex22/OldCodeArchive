import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Classlist {

	/**
	 * @throws FileNotFoundException
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scFile = new Scanner (new File("Classlist.txt"));
		String out = "";
		int count = 0;
		DecimalFormat deci = new DecimalFormat("R#.00");
		while (scFile.hasNext()){
			String message = "";
		Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

		String name = scLine.next();
		String surname = scLine.next();
		String grade = scLine.next();
		String ExtraSubject = scLine.next();

		String admissionNO = "";
		for (int i =0 ; i<=2; i++)
		{
			admissionNO += surname.charAt(i);
		}
		admissionNO += grade;
		for (int j =0; j <=1;j++)
		{
			admissionNO += name.charAt((name.length()-j)-1);
		}

		//message += "Admission: "+admissionNO;
		//Grade
		double fees = 0.00;
		if (grade.equals("8") || grade.equals("9"))
		{
			fees = 2500;
			if(ExtraSubject.equalsIgnoreCase("MUSIC"))
			{
				fees += 250;
			}
		}
		else if (grade.equals("10") || grade.equals("11"))
		{
			fees = 3000;
			if(ExtraSubject.equalsIgnoreCase("MUSIC"))
			{
				fees += 300;
			}
		}
		else if (grade.equals("12"))
		{
			fees = 4000;

			if(ExtraSubject.equalsIgnoreCase("MUSIC"))
			{
				fees += 500;
			}
		}
		else
		{
			message += "\nERROR\n";
			fees = 0;
		}
		Scanner scInitials = new Scanner(name).useDelimiter(" ");
		String initials = "";

		while (scInitials.hasNext())
		{
			initials += ""+scInitials.next().charAt(0)+". ";
		}
		message = "Entry: "+count+" "+admissionNO+" "+surname+", "+initials+" "+deci.format(fees)+"\n";
		out+= message;
		count ++;
		scInitials.close();
		scLine.close();

		}
//System.out.println(message);
		JOptionPane.showMessageDialog(null, out);
scFile.close();



	}

}
