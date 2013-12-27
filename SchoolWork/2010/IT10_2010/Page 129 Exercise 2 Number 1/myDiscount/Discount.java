package myDiscount;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Discount {

	/**
	 * input total amount spent (in R and C)
	 * determine if purchase greater than R100
	 * 	calculate 10% discount
	 * otherwise no discount
	 * display final price 
	 **/
	public static void main(String[] args) {
		DecimalFormat rand = new DecimalFormat("R#00.00");
		//input
		double aSpent = Double.parseDouble(JOptionPane.showInputDialog("<Enter> Total Amount Spend R"));
		
		//Import a frame
		JFrame nameofframe = new JFrame();

		//make visible
		nameofframe.setVisible(true);
		nameofframe.setLocation(40,20);
		nameofframe.setSize(170,150);
		nameofframe.setTitle( "Discount of Total Spent" );

		//import text area

		JTextArea txt = new JTextArea();
		nameofframe.add(txt);

		//display in text area
		//fist set text then append after

		txt.setTabSize(5);
		if (aSpent>=100.00)
		{
			double total = aSpent-(10/aSpent*100);
			txt.setText("You Have Spent "+rand.format(aSpent));
			txt.append( "\nYou Get A Discount!!!\nAnd You Total Price Is Now:\n\t "+rand.format(total) );
		}
		else 
		{
			txt.setText("Sorry No discount\n" +
					"So You Pay : "+rand.format(aSpent));
		}



	}
}
