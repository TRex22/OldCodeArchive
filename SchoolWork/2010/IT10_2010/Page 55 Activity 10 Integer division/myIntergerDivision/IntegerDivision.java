package myIntergerDivision;

import javax.swing.JOptionPane;

public class IntegerDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//String sNum1 = JOptionPane.showInputDialog( "Enter Number 1" );
		//String sNum2 = JOptionPane.showInputDialog( "Enter Number 2" );
		int iNum1 = Integer.parseInt (JOptionPane.showInputDialog( "Enter Number 1" ));
		int iNum2 = Integer.parseInt (JOptionPane.showInputDialog( "Enter Number 2" ));
		//Divide the 2 numbers
		int answer = iNum1 / iNum2;
		//get the remainder
		int iRemainder = iNum1 % iNum2;
		if (iRemainder == 0){
			JOptionPane.showMessageDialog(null,iNum1 +" / "+iNum2+ " = "+answer );
		}
		else 
		{
			JOptionPane.showMessageDialog(null, iNum1+" / "+iNum2 +" = "+answer+"r"+iRemainder );

		}




	}

}
