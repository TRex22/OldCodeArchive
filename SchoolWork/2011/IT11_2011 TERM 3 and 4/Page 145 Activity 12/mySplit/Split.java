package mySplit;

import javax.swing.JOptionPane;

public class Split {

	/**
	 * Enter a sentence
	 * Display the word below each other
	 */
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("ENTER:");
		//split words and save it into an array
		String[] arrWords = sentence.split("//s+");

		for (int i =0 ; i<arrWords.length;i++)
		{
			System.out.println(arrWords[i]);
		}
	}

}
