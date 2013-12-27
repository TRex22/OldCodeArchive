package mySplitSentence;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SplitSentence {

	/**
	 * Get a sentence from console
	 * Split the sentence into seperate words and display it downwards
	 */
	public static void main(String[] args) {
		//input from keyb
		Scanner scPool = new Scanner(System.in);
		System.out.println("TYPE WORDS");
		String sentence = scPool.nextLine();

		scPool.close();
		System.out.println();
		System.out.println("OUTR:");
		System.out.println("-------------");
		Scanner scLine = new Scanner (sentence).useDelimiter(",");
		//LOOOOOOp through words in sentence
		String message ="";
		while (scLine.hasNext())
		{
			String word = scLine.next();
			message +=word+"\n";
			System.out.println(word);
		}
		JOptionPane.showMessageDialog(null, message);

		scLine.close();



	}

}
