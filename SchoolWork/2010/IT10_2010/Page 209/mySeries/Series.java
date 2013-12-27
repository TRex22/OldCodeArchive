package mySeries;

import javax.swing.JOptionPane;

public class Series {

	/**
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String output ="";
		int sum = 0;
		int i = 0;
		while (sum <= 5000)
		{
			i++;
			sum += i;
			output = ""+i;
			
		}
		JOptionPane.showMessageDialog(null, "sum is: "+sum+" counter "+output);
		
		

	}

}
