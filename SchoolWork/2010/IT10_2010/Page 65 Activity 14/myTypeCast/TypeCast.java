package myTypeCast;

import javax.swing.JOptionPane;

public class TypeCast {

	public static void main(String[] args){

		//get double from user
		double rNum = Double.parseDouble(JOptionPane.showInputDialog( "Enter a Real Number" )); 
		int iNum = (int)rNum;
		char letter = (char) iNum;
		JOptionPane.showMessageDialog(null, "Your stupid number you requested is "+letter+" in the ASCII table. So piss off" );
		
		letter = 'I';
		iNum = (int) letter;
		










	}
}
