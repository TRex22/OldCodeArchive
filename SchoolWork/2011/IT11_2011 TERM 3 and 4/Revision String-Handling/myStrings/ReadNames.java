package myStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadNames {

	/**
	 * Create text file with names
	 * Use the Scanner class to read the names from text file
	 * Remove all vowels from the names (Ignore the first letter)
	 *
	 * Disp the changed name with message
	 *
	 *
	 */
	public static void main(String[] args) {
		try {
			Scanner scInput = new Scanner (new File("Names.txt"));

			String message = "";
			while (scInput.hasNext())
			{
			String name = scInput.nextLine();
			String EdtName = ""+name.charAt(0);
			String vowels = "AEIOUaeiouYy";
			for (int i =1; i<name.length();i++)
			{
				char letter = name.charAt(i);
				if (vowels.indexOf(letter)<0)
				{
					EdtName += letter;
				}

			}
			message += EdtName+" ";

			}
			scInput.close();
			JOptionPane.showMessageDialog(null,message);

		} catch (FileNotFoundException e) {
			System.err.println("Error opening text file");
		}

	}

}
