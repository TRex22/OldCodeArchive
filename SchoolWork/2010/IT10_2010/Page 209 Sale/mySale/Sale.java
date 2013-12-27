package mySale;

import javax.swing.JOptionPane;

public class Sale {

	/**
	 * Starts at R200
	 * Every day goes down by R8
	 * Until R100
	 * Determine no of days 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int price = 200;
		int i = 0;
		while (price >= 100)
		{
			price = price - 8;
			i = i+1;
		}
		JOptionPane.showMessageDialog(null, "Price :"+price+" NO of DAYS "+i);
		
		
		
		
	}

}
