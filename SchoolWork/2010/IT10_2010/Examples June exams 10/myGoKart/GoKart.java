package myGoKart;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class GoKart {

	/**
	 *Enter number of people 
	 *determine if enough	4-10
	 *enter type of race 10 lap at R25.00 or 5 lap at R15.00 per person
	 *disp
	 *	type of race selected
	 *	number of competitors
	 *	total cost
	 */
	public static void main(String[] args) {
		DecimalFormat rand = new DecimalFormat("R#00.00");
		int people = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Competitors"));
		
		if (people <4)
		{
			JOptionPane.showMessageDialog(null, "Sorry, Not Enough People" );
			System.exit(1);
		}
		else if (people >=11)
		{
			JOptionPane.showMessageDialog(null, "Too Many People; Sorry");
			System.exit(1);
		}
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(20,20);
		JTextArea txt = new JTextArea();
		frame.setTitle( "Go Kart Prices" );
		frame.add(txt);
		Boolean raceType = Boolean.parseBoolean(JOptionPane.showInputDialog("Do You Wnat a 5 Lap Race for R15.00 per person<true>\n" +
				"OR\n" +
				"A 10 Lap Race R25.00 Per person <false>"));
		double cost;
		if (raceType == true )
		{
			cost = people*15.00;
			txt.setText("You have selected a 5 Lap Race, R15 PP\n" +
					"There are "+people+" competitors\n" +
							"The total cost is "+rand.format(cost));
		}
		else
		{
			cost = people*25.00;
			txt.setText("You have selected a 10 Lap Race R25 PP\n" +
					"There are "+people+" competitors\n" +
							"The total cost is "+rand.format(cost));
		}
		
		
		
	}

}
