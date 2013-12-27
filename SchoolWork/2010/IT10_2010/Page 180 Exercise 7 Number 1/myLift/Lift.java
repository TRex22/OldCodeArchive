package myLift;

import javax.swing.JOptionPane;

public class Lift {

	/**
	 * Declare int and intitilise
	 * Declare int mass
	 * 	loop 16 times
	 * 	Ask
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
		int mass = 0;
		for (int people = 1;people<=16;people++)
		
		{
			int massPP = Integer.parseInt(JOptionPane.showInputDialog("Enter mass of person "+people));
			mass += massPP;
			
			
		}
		if (mass > 1200)
		{
			JOptionPane.showMessageDialog(null, "Warning lift to heavy Can not  go up");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Going Up!");
		}
		
	}

}
