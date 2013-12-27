package myAgeCheck;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.*;
public class AgeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//AgeCheck Copyright Jason Chalom
			int cost = 25;
			DecimalFormat dCost = new DecimalFormat("R#00.00");
			//IPO
			//Input Age
			int age = Integer.parseInt(JOptionPane.showInputDialog( "Age" ));
			//Determine older than 16
			//if not
			if (age <= 15)
			{
				JOptionPane.showMessageDialog(null, "Sorry You Lose" );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You Can View The Movie") ;
			}
			//sorry you lose
			//else you can see movie
			
			if (age>= 16){
			int much = Integer.parseInt(JOptionPane.showInputDialog( "How Many Tickets Do You Want?" ));
			String where = JOptionPane.showInputDialog("Where Do You Want To Sit, Back or Front of The Cinema?");	
			int total = cost*much;
			
			
			
			JFrame nameofframe = new JFrame();

			//make visiable
			nameofframe.setVisible(true);
			nameofframe.setSize(350,500);
			nameofframe.setTitle( "Ticket Purchase" );

			//import text area

			JTextArea txt = new JTextArea();
			nameofframe.add(txt);

			//display in text area
			//fist set text then append after

			txt.setTabSize(9);

			txt.setText( "Age Restriction: 16");
			txt.append("\nYou Want To Buy: "+much );
			txt.append("\nYou Want To Sit At The "+where+" Of The Cinema");
			txt.append("\nThe Tickets Cost "+dCost.format(cost)+" Each");
			txt.append("\nYou Want To Buy "+much+" Tickets");
			txt.append("\n--------------------------------------------");
			txt.append("\nYou Will Pay: "+dCost.format(total) );
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error Known" );
		}
	}

}
