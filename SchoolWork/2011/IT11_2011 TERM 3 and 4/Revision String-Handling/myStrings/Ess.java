package myStrings;

import javax.swing.JOptionPane;

public class Ess {

	/**
	 * Enter unkown number of words until the user types in last
	 * Test if contains 's'
	 * Display word plus message
	 */
	public static void main(String[] args) {

		//I initialsie

		String input = JOptionPane.showInputDialog("eNTER WORD");
		//T=Test
		//C-Change
		while (!input.equalsIgnoreCase("LAST"))
		{
			String temp = "";

			if (input.indexOf('s')>=0||input.indexOf('S')<0)
			{
				JOptionPane.showMessageDialog(null, input+" has a Ess");
			}
			else
			{
				JOptionPane.showMessageDialog(null, input+" does not have an ess");
			}
			input = JOptionPane.showInputDialog("eNTER WORD");

		}



	}

}
