package myCompareNumChars;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CompareNumChars {

	/**
	 * input any two numbers into string variables
	 * determine if the number of charachters
	 * 	if the first number is less than 
	 * 	the number of charachters in the second number
	 * 		-display first number plus "then" plus
	 * 			the second number
	 * 	if the second number is less than
	 * 	the number of charachters in the first number
	 * 		-display second number plus "then" plus
	 * 			the first number
	 * 	if the number of charachters in both is the same
	 * 		-display first number plus
	 * 			" is the same length as " plus 	
	 * 			the second number
	 * 
	 */
	public static void main(String[] args) {

		String word1 = JOptionPane.showInputDialog("1.Enter Any Number");
		String word2 = JOptionPane.showInputDialog("2.Enter Any Number");




		//Import a frame
		JFrame nameofframe = new JFrame();

		//make visible
		nameofframe.setVisible(true);
		nameofframe.setLocation(40,20);
		nameofframe.setSize(200,150);
		nameofframe.setTitle( "WTF" );

		//import text area

		JTextArea txt = new JTextArea();
		nameofframe.add(txt);

		//display in text area
		//fist set text then append after

		txt.setTabSize(20);


		if (word1.length()<word2.length())
		{
			txt.setText( word1+" then "+word2 );
		}
		else if (word2.length()<word1.length())
		{
			txt.setText(word2+" then "+word1);
		}
		else
		{
			txt.setText( word1+" is the same length as: "+word2);
		}
	}

}