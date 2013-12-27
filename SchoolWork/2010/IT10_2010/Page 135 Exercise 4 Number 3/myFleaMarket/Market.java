package myFleaMarket;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Market {

	/**
	 * When you book a stall at a flea market
	 * you get a discount for four consecutive Saturdays
	 * or more. Normal cost = R20 per day
	 * If you book four consectutive Saturdays the first four
	 * Saturdays cost R18 per day and R16 afterwards.
	 * Input: number of consecutive Saturdays and
	 * the amount to be paid.
	 */
	public static void main(String[] args) {
		DecimalFormat rand = new DecimalFormat("R#00.00"); 
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea ();
		frame.add(txt);
		frame.setSize(500,500);
		int noDay = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of days booked at Plea Market"));
		frame.setVisible(true);
		frame.setTitle("FLEA MARKET STALL HIRE");
		txt.setText("Normal Cost is R20 per Day");
		int price;
		if (noDay == 4)
		{
			price = noDay*18;
			txt.append("\nYou Have Hired "+noDay+" Saturdays Therefore \n" +
					"You do not get a discount and will pay R18 for each "+noDay+" Saturdays you have hired\n" +
							"The Total Price is: "+rand.format(price));
			
			
			
		}
		else if (noDay < 4)
		{
			price = noDay*20;
			txt.append("\nYou Have Hired "+noDay+" Saturdays Therefore \n" +
					"You Pay R20 Per Saturday"+
							"\nThe Total Price is: "+rand.format(price));
		}
		else if (noDay > 4)
		{
			price = (4*18)+((noDay-4)*16);
			txt.append("\nYou Have Hired "+noDay+" Saturdays Therefore \n" +
					"You get a discount and pay R18 for The First 4 saturdays you have hired\n" +
							"and will then pay R16 per day after that" +
							"\nThe Total Price is: "+rand.format(price));
		}
	}

}
