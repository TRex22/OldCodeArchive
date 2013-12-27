package myAddingIntegers;

import javax.swing.JOptionPane;

public class AddingIntegers {

	/**
	 * 
	 */
	public static void main(String[] args) {
		//instantiate a sum var
		int sum = 0;
		//for (
		//declare counter e.g. i as an integer
		//instantiate the counter = give beggining no
		//semi-colon
		//condition when does the loop goes in,
		//e.g. when i is less or equal to 10
		//semi-colon
		//does it go up / down and by how much
		//e.g. i++ i=i+1 or up by one
		//close brackets
		//curley brackets
		//no semi-colon after bracket
		// curley brackets = programming inside
		//add the no to sum
		String out = "";
		for (int i = 1 ; i<=10;i++  )
		{
			int number = (int)(Math.random()*100); 
				//Integer.parseInt(JOptionPane.showInputDialog("Enter Number "+i));
		 out=out+number+"\n";
			sum = sum+number;
		}
		//calc average
		double average = sum/10.0;
		int averageround = (int)Math.round(sum/10.0);
		//after loop display sum
		JOptionPane.showMessageDialog(null, "The 10 random numbers Are: "+out+"the sum is: "+sum+"\n" +
				"The average is: "+averageround+" not rounded: "+average);
		
		
		
		
		
		
		
		

	}

}
