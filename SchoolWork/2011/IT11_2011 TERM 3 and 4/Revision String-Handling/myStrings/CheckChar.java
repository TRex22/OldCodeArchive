package myStrings;

import javax.swing.JOptionPane;

public class CheckChar {

	/**
	 * Ask the user to enter a character
	 * ask the user to enter names repetitively until they answer
	 * "no" to the question "Do you want to enter another name? (Y/N)"
	 * Disp each name and indicate if the character appears in the name.
	 * If it does indicate the position of the character in the name.
	 * If the char appears more than once, only the first position needs to be shown
	 * Display a summary to indicate:
	 * How many names started with the character the user entered?
	 * How many names ended with the charcter the user entered?
	 * Your program must ignore the case of the character.
	 */
	public static void main(String[] args) {

		//I
		char answer = 'Y';
		char search = JOptionPane.showInputDialog("Enter a character").toLowerCase().charAt(0);
		String message ="";
		int countStart=0,countEnd=0;

		//T
		while (answer == 'Y')

		{
			String name = JOptionPane.showInputDialog("Enter name You MUTTT");
			int pos = name.toLowerCase().indexOf(search);
			//C
			answer = JOptionPane.showInputDialog("Do u want to enter another name (Y/N)?").toUpperCase().charAt(0);
			message+=name;
			if (pos>=0)
			{
				message += " does contain "+search+ " at position "+(pos+1)+"\n";

			}
			else
			{
				message += " does not contain "+search;
			}
			if (name.startsWith(""+search))
			{
				countStart++;
			}
			if (name.endsWith(""+search))
			{
				countEnd++;
			}

		}//end while

		JOptionPane.showMessageDialog(null, message+" \nThe count start is: "+countStart+"\nThe count end is: "+countEnd);
		//C

	}

}
