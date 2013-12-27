package myAnalyseInt;

import javax.swing.JOptionPane;

public class AnalyseInt {

	/**
	 * Enter a number of integers (user must say how many).
	 * Determine:
	 * 	The sum of the integers
	 * 	the number of + integrs
	 * 	The number of - integrs
	 * 	the number of integers greater than 10
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int count = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want to enter"));
		int sum = 0;
		int positive = 0;
		int negative=0, greaterThan10 = 0;
		for(int loop=1;loop<=count;loop++)
		{
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number "+loop));
			sum+=number;
			if (number>=0)
			{
				positive++;
			}
			else
			{
				negative++;
			}
			if (number>10)
			{
				greaterThan10++;
			}
			
		}
		JOptionPane.showMessageDialog(null, "The Sum of the numbers is: "+sum+
				"\nThere are "+positive+" positive numbers"+
				"\nThere are "+negative+" negative numbers"+
				"\nThere are "+greaterThan10+" numbers greater than 10");
		
		
		

	}

}
