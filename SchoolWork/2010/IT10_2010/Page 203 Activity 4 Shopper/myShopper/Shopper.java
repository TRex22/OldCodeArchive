package myShopper;

import javax.swing.JOptionPane;

public class Shopper {

	/**
	 * counter < 0
	 * total < 0
	 * display "has a shopper left? (Y/N)
	 * input ans
	 * while the ans is y (or y)
	 * 	input enterTime, leaveTime
	 * 	counter < counter + 1
	 * 	duration < leaveTime-enterTime
	 * 	total < total + duration
	 * 	display "is there another shopper? (Y/N)"
	 * 	input ans
	 * end while
	 * Determine and display the average (total/counter)
	 */
	public static void main(String[] args) {
		try{
		int i = 0;
		int total = 0;
		char ans = JOptionPane.showInputDialog("Has A Shopper Just Left? (Y/N)").toUpperCase().charAt(0);
		while (ans == 'Y')
		{
			i++;
			int enterTime = Integer.parseInt(JOptionPane.showInputDialog("ENTER, ENTER TIME (MIN)"));
			int leaveTime = Integer.parseInt(JOptionPane.showInputDialog("ENTER, LEAVE TIME (MIN)"));
			int duration = leaveTime-enterTime;
			total += duration;
			ans = JOptionPane.showInputDialog("Is there another shopper? (Y/N)").toUpperCase().charAt(0);
			
			
		}
		int average = total/i;
		JOptionPane.showMessageDialog(null, "The Average time a shopper takes in this shithole is: "+average);
		
		
		
	}catch (Exception e)
	{
		System.exit(1);
	}
	}
}
