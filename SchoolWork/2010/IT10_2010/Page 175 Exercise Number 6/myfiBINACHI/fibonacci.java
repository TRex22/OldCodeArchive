package myfiBINACHI;

import javax.swing.JOptionPane;

public class fibonacci {

	/**
	 * the following sequence of numbers
	 * is known as the fibonacci sequence:
	 * 011235813...
	 * (after the first two numbers,
	 * each number is the sum of the previous two numbers).
	 */
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int term;
		String output=number1+", "+number2;
		for (int loop=1;loop<=10;loop++)
		{
			term = number1+number2;
			output+=", "+term;
			number1=number2;
			number2=term;
		}
		output+="...";
		JOptionPane.showMessageDialog(null, output);
		
		
		
		
		
		

	}

}
