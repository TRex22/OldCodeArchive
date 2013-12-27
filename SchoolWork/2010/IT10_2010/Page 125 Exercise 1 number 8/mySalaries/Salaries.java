package mySalaries;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Salaries {

	/**
	 * 
	 */
	public static void main(String[] args) {
		try {
		DecimalFormat rand = new DecimalFormat("R#00.00"); 	
		//declare a basic salary and make it equal to 3000
		double basic = 3000;	
		//enter number of sales made for that month
		int sales = Integer.parseInt(JOptionPane.showInputDialog
				("Enter The Amount Of Crap You Have Sold This Month"));
			
			
			
			
			
			//Import a frame
			JFrame nameofframe = new JFrame();

			//make visible
			nameofframe.setVisible(true);
			nameofframe.setLocation(40,20);
			nameofframe.setSize(350,100);
			nameofframe.setTitle( "Number Shit" );

			//import text area

			JTextArea txt = new JTextArea();
			nameofframe.add(txt);

			//display in text area
			//fist set text then append after

			txt.setTabSize(13);
			double salary;
			//if sales greater than 10
			if (sales >= 10)
			{
				//add sales% to the basic salary
				salary = basic+(basic*sales/100);
				//display message "well done"
				txt.setText("You Have Made: "+rand.format(salary));
				txt.append("\nYou SUCK And Make More Money for US");
				txt.append("\nGET BACK TO WORK");
				txt.append("\n\tNOW!");
			}
				
			// if not
			else
			{
				//salary is equal to the basic salary
				salary = basic;
				//display salary
				txt.setText("You Have Your Basic Salary This Month: "+rand.format(salary));
				txt.append("\nNOW ACTUALLY MAKE MONEY FOR US");
				txt.append("\nAND Have A Nice Day!");
			}
			
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null , "WTF Error, ITS Your Fault");
		}

	}

}
