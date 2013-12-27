package myEggs;

import javax.swing.JOptionPane;

public class Eggs {

	/**
	 * A farmer supplies the local shop with a quantity
	 * of eggs in a large cardboard box. The shop pays the farmer by the 
	 * dozen. Write a program to display how many full dozen eggs are in the
	 * box and how many are left over. The farmer must type in the number of 
	 * eggs in the box.
	 * Write down the answer if there are 376 eggs in the box .....full dozen
	 * 														  .....left over
	 * and errors
	 */
	public static void main(String[] args) {
	try{
		//IPO
		//Input number of eggs in box
		String sNum = JOptionPane.showInputDialog( "Enter Number of eggs in the box" );
		int iNumEggs = Integer.parseInt(sNum);
		//Process
		int iAnswer = iNumEggs / 12;
		int iRem = iNumEggs % iAnswer;
		//Output
		System.out.println(iAnswer+" full dozen"
				+"\n"+iRem+" left over");


	}catch (NumberFormatException x){System.err.println("Please only Enter in Integer number of eggs only Error 1");}
	
	}

}
