package myQ1;

import javax.swing.JOptionPane;

public class TeleDirect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// remove vowels from second character onwards
		//need a for loop
		// need input dialogue
		// need output USE: SYSTEM
		
		//IPO
		//fields
		String vowels = "AEIOUaeiou";
		//Input
		String input = JOptionPane.showInputDialog("Enter the name of the street and suburb");
		String out = ""+input.charAt(0);
		for (int i = 1; i<input.length(); i++)
		{
			
			//String temp = ""+input.charAt(i);
			//(""+input.charAt(i)))
			String tester = ""+input.charAt(i);
			
			if (!vowels.contains(tester))
			{
				out += input.charAt(i);
			}
		}
		
		System.out.println("Input: "+input+"\nOutput: "+out);
		//System.out.println(""+out);

	}

}
