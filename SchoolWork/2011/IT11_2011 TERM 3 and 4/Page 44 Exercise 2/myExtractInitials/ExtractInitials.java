package myExtractInitials;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExtractInitials {

	/**
	 * Enter name and surname (In one line seperated by &)
	 * Display the initials (Capitol letters) and the surname
	 * Loop until the surname is XXX.
	 *
	 */
	public static void main(String[] args) {
		//declare and inistialise the surrname
		//get object from console
		//object of scanner class to scan the console for input
		String Line = "";
		do{
		//cosole
		Scanner scInput = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "ENTER:v NAME SURNAME SEPERATED BY &");
		String strInput = scInput.nextLine(); //next goes until white space
		scInput.close();

		//scan the line to get the seperate elements of the line
		//obj sc to sc line
		//use & as seperator / delimiter between the elements
		Scanner scLine = new Scanner(strInput).useDelimiter("&");
		//declare and initialise vars
		String name ="";
		String sur = "";
		//Test if they entered a name
		if (scLine.hasNext())
		{
			name=scLine.next();
		}
		if (scLine.hasNext())
		{
			sur = scLine.next();
		}
		//OP - getting the initials
		String initials = "";
		Scanner scName = new Scanner(name);
		while (scName.hasNext())
		{
			initials+=scName.next().charAt(0)+". ";
		}


		scName.close();
		//Output - disp initials and surname
		System.out.println("A MR "+initials+sur+" Has been charged and fined.");
		scLine.close();
	}while (!Line.equalsIgnoreCase("EXIT"));

	}

}
