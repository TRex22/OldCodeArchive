package myTestAnotherNumber;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestanotherNumber {

	/**
	 * Number 2 of exercise
	 * Input an integer
	 * if it is positive 
	 * 	display integer and message that it is positive
	 * or negative
	 * 	display integer and a message that says it it is negative
	 * if it is	even 
	 * 	display integer and a message that says it is even
	 * or odd 
	 * 	display integer and a message that say it is odd
	 * if it is	a multiple of 7 
	 * 	display integer and a message that says it is a multiple of 7
	 * or not
	 * 	display integer and a message that says it is not a multiple of 7
	 */
	public static void main(String[] args) {
		int iNumber = Integer.parseInt(JOptionPane.showInputDialog
				("Insert An Integer or Get Your Head Full Of Lead!"));
		
		//Import a frame
		JFrame nameofframe = new JFrame();

		//make visible
		nameofframe.setVisible(true);
		nameofframe.setLocation(40,20);
		nameofframe.setSize(250,200);
		nameofframe.setTitle( "Languge Chosser For Somethingn Stupid" );

		//import text area

		JTextArea txt = new JTextArea();
		nameofframe.add(txt);

		//display in text area
		//fist set text then append after

		txt.setTabSize(20);
		String text = "";
		if (iNumber >=0 )
		{
			text += ""+iNumber+" is a positive number ";
		}
		else
		{
			text += ""+iNumber+" is a negative number, ";
		}
		if (iNumber % 2 == 0)
		{
			text += "\nan even number and ";
		}
		else 
		{
			text += "\nan odd number and ";
		}
		if (iNumber % 7 == 0)
		{
			text += "\nis a multiple of 7";
		}
		else
		{
			text += "\nis not a multiple of 7";
		}
		txt.setText(text);
	}

}
