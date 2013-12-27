package myHighest;

import javax.swing.JOptionPane;

public class Highest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String output = "";
		int high = 0;
		int total = 0;
		for (int i=1;i<=10;i++)
		{
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number "+i));
			output+=number+"\n";
			if (number > high)
			{
				high = number;
				
			}
			total += number;
		}
		//enter 10 numbers
		//which highest
		double average = total/10.0;
		JOptionPane.showMessageDialog(null, output+"\nHighest number: "+high+"\n" +
				"AVERAGE IS: "+average);
		
		
		
		
		

	}

}
