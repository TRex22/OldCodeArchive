package myStrings;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ChangeSpelling {

	/**
	 * scanner class to enter sentence
	 * Chnage the spelling of all words that end with "or" to "our"
	 * Display the new sentence
	 */
	public static void main(String[] args) {
		Scanner scInput = new Scanner (System.in);

		System.out.println("Enter a sentence");
		String Line = scInput.nextLine();
		String message ="";
		String original ="";
		Scanner sentence = new Scanner(Line);
		while (sentence.hasNext())
		{
			String word = sentence.next();
			original += word+" ";
			if (word.endsWith("or"))
			{
				word = word.replace("or", "our");

				message += word+" ";
			}
			else if (word.endsWith("OR"))
			{
				word = word.replace("OR", "OUR");
			}
			else
			{
				message += word+" ";
			}

		}
		scInput.close();
		JOptionPane.showMessageDialog(null, original+" becomes: "+message);

	}

}

