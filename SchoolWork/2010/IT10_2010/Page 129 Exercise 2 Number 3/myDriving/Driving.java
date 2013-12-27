package myDriving;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Driving {

	/**
	 * input age
	 * if they are younger than 18
	 * 	display too young to drive
	 * if they are older than 75 
	 * 	display too old to drive
	 * otherwise
	 * 	display age and age ok
	 */
	public static void main(String[] args) {
		int age = Integer.parseInt(JOptionPane.showInputDialog("<Enter> AGE:"));
		//Import a frame
		JFrame nameofframe = new JFrame();

		//make visible
		nameofframe.setVisible(true);
		nameofframe.setLocation(40,20);
		nameofframe.setSize(200,150);
		nameofframe.setTitle( "Dont Kill Anyone We Like On Our Roads" );

		//import text area

		JTextArea txt = new JTextArea();
		nameofframe.add(txt);

		//display in text area
		//fist set text then append after

		txt.setTabSize(20);
		if (age <18)
		{
			txt.setText("You Are "+age+" toooooo Young To Drive");
		}
		else if (age>75)
		{
			txt.setText("yOU ARE "+age+"tOO oLD tO dRIVE,\n AND gIVE mE aLL yOUR mONEY!");
		}
		else
		{
			txt.setText("You Are "+age+" You May Be Able To Drive,\n Do You Have A License?");
		}

	}

}
