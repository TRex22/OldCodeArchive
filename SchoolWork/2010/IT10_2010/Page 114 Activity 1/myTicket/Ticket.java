package myTicket;

import java.awt.HeadlessException;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ticket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			//get age
			int age = Integer.parseInt(JOptionPane.showInputDialog( "Enter Your Age" ));
			int price;
			DecimalFormat rand = new DecimalFormat("R#00.00");
			//ifs
			if (age<= 12)
			{
				price = 10;
			}
			else
			{
				price = 15;
			}
			//dsp


			//Import a frame
			JFrame nameofframe = new JFrame();

			//make visiable
			nameofframe.setVisible(true);
			nameofframe.setSize(350,75);
			nameofframe.setTitle( "Your Age is: "+age+" Years" );

			//import text area

			JTextArea txt = new JTextArea();
			nameofframe.add(txt);

			//display in text area
			//fist set text then append after

			txt.setTabSize(9);

			txt.setText( "\tYour ticket costs "+rand.format(price) );
			txt.append( "\nWhy, Since You Are "+age
					+" Years Old, " 
					+"Want To Go See Barney? " );
			//extra

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please Enter A Valid Age \nError 1" );
		}
		catch (HeadlessException e){
			{JOptionPane.showMessageDialog(null, "Error 2 Everything Else" );
			}}}}


