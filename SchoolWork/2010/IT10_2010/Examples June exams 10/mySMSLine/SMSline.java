package mySMSLine;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SMSline {

	/**
	 * enter message of hope
	 * the cost of sms is 0.55
	 * JFormat
	 * even = 2X
	 * odd = 3X
	 */
	public static void main(String[] args) {
		DecimalFormat rand = new DecimalFormat("R#00.00");
		double smscost = 0.55;
		String sms = JOptionPane.showInputDialog("Enter a message of hope: ");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(20,20);
		JTextArea txt = new JTextArea();
		frame.setTitle( "OutReach Committee Raising Money For Street Children" );
		frame.add(txt);
		int StringL = sms.length();
		if (StringL/2 < 0)
		{
			int oddX = 3;
			double donation = (oddX*smscost);
			txt.setText("The Message has an odd number of charachters");
			txt.append("\nThe cost of the SMS is: "+rand.format(smscost)+"\n" +
					"The Company's donation is: "+rand.format(donation)+"\n" +
							"The total donation is: "+rand.format(donation+smscost));
		}
		else
		{
			int evenX = 2;
			double donation = (evenX*smscost);
			txt.setText("The Message has an even number of charachters");
			txt.append("\nThe cost of the SMS is: "+rand.format(smscost)+"\n" +
					"The Company's donation is: "+rand.format(donation)+"\n" +
							"The total donation is: "+rand.format(donation+smscost));
		
		}

	}

}
