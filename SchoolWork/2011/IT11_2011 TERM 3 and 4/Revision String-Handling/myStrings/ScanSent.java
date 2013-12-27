package myStrings;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScanSent {
	/**
	 * Use the scanner class to input a sentence from the keyboard
	 * from the console (Just other way to ask you to use "System.in").
	 * Display the words of the sentence below each other in the console
	 * (Just other way to ask you to use "System.out")
	 * Count the number of words and display that with a
	 * suitable heading.
	 *
	 *
*/
	public static void main (String[] args)
	{

		String message = "";
		int count = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		Scanner sc = new Scanner(sentence);
		while (input.hasNext())
		{
			String word = sc.next();
			message+=word+"\n";
			count++;
		}
		JOptionPane.showMessageDialog(null, message+"\nThere are "+count+" words."

		);



		input.close();
	}



}
