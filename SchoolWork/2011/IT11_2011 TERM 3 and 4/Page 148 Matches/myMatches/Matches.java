package myMatches;

import javax.swing.JOptionPane;

public class Matches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Enter Sentence");
		int count = 0;
		for (int i=0;i<sentence.length();i++)
		{
			String letter = ""+sentence.charAt(i);
			//if("AEIOUaeiou".indexOf(letter)>=0)
			if (letter.matches("^[AEIOUaeiou]\\w*"))
			{

				count++;
			}
		}
	}

}
