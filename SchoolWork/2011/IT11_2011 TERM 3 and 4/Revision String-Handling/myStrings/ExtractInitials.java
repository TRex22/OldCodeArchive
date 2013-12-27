package myStrings;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExtractInitials {

	/**
	 * Use the scanner class to input the full name of a person
	 * (e.g. Fred Joh Samuel) in one line and
	 * the surname (e.g. Smith) on a seperate line.
	 * Display the initials and surname in capital letters
	 * (e.g. F.J.S. Smith)
	 * Your program must ignore the case of the character
	 *
	 * //Scanner input = new Scanner(System.in);

				//System.out.println("Enter full name");
				//String name = input.nextLine();
				//System.out.println("Enter the surname");
				//String surname = input.nextLine();
	 */
	public static void main(String[] args) {
		//output string
		String message = "";
		//Declare and initialize variable used to count how many words start with the letter
		int start = 0;
		//Declare and initialize variable used to count how many words ends with the letter
		int end = 0;
		//ask user to enter char
		//Ignore case lower case
		char letter = JOptionPane.showInputDialog("Enter Character").toLowerCase().charAt(0);
		//declare and instanciate a var to keep answer
		char ans = 'Y';
		//assume loop once
		while (ans == 'Y')
		{
		//repeat loop if user said yes

			//ask user to enter name
			String name = JOptionPane.showInputDialog("Enter name");
			//disp name (add to message)
			message+= name+"\n"+letter;
			//Determine pos of letter in name
			//use lower case
			int position = name.toLowerCase().indexOf(letter);
			//determine if letter appears in name
			if (position>=0)
			{
				message+=" appears in position "+(position+1)+"\n";
			}
			else
			{
				message+=" does not appear\n";
			}
			//determine if the name starts with the letter
			if (position == 0)
			{
				start++;
			}
			//determine if the name ends with the letter
			//lastindexof
			//lowercase
			if(name.toLowerCase().lastIndexOf(letter)==name.length()-1)
			{
				//one less
				end++;
			}
			//ask question - change the answer to capital letters and get first letter only
			ans = JOptionPane.showInputDialog("Do you wnat another name (Y/N)").toUpperCase().charAt(0);
		}
		//Display start and end summary
		message +=start+" names starts with "+letter+" \nand this many names end with it: "+end+"\n";
		JOptionPane.showMessageDialog(null, message);










	}

}
