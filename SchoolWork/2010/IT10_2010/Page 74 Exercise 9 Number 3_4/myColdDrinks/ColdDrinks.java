package myColdDrinks;


import java.text.DecimalFormat;

import javax.swing.*;

public class ColdDrinks {

	/**
	 * You are selling cold drinks at R3.89 each.
	 *Ask a customer how many s/he wants to buy, input
	 *this amount, then display the number wanted, as well 
	 *as the amount to be paid
	 *
	 *Enter the amount given by the customer, and then
	 *determine and display the change
	 */
	public static void main(String[] args) {
		try {
			//IPO
			//input how many
			DecimalFormat deci = new DecimalFormat("R#00.00");
			JOptionPane.showMessageDialog(null, "                  WELCOME"
					+"\n  We are Selling Cold Drinks at R3.89" );
			int howMuch = Integer.parseInt(JOptionPane.showInputDialog( "\n  How Many Cold Drinks Do you Want?" ));
			double money = Double.parseDouble(JOptionPane.showInputDialog("How Much Money Do you Have?"));
			//double of price
			double price = 3.89;
			//total price
			double total = price*howMuch;
			double change = money - total;
			if (change <= -1)
			{JOptionPane.showMessageDialog(null,
			"You Do Not Have Enough Money To Buy What You Want Please Come Back Again"+
			"\n                                    AND have a nice day" );}
			else{
				//Display the amount wanted and how much is needed to be paid


				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(500,500);
				nameofframe.setTitle( "CHEAP COLD DRINKS GET THEM WHILE THEY LAST" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText( "You Want To Buy: "+howMuch+" Cold Drinks" );
				txt.append("\nThe Total Price of What You Want To Buy Is: "+deci.format(total) );
				txt.append("\nThe Amount of Money You Have IS: "+deci.format(money));
				txt.append("\nThe Amount of Change You Will Recieve is: "+deci.format(change));
				//extra


			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Unknown Error 1");

		}}}


