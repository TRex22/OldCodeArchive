package myAddOn;

import javax.swing.JOptionPane;

public class AddOn {

	/**
	 * Add together the first 250 positive odd numbers.
	 * starting from 1.
	 */
	public static void main(String[] args) {
		String output = "";
		int count = 0,sum = 0;
		for(int odd=1;odd<=500;odd=odd+2)
		{
			count++;
			output+=count+": "+odd+"\n";
			sum+=odd;
			
		}
		System.out.println(output+"\n\nSum: "+sum);
		
		
		

	}

}
