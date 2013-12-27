package mySportingEvents;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class sportingEvents {

	/**
	 * Enter Year
	 * leap year if /400 else if /4 and not 100
	 */
	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog
				("<Enter> Year"));
		
		
		
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
		if (year % 400 == 0 & year % 4 == 0)
		{
			
			int CWorld = year+2;
			int RWorld = year+3;
			txt.setText("NO EVENT");
			
			
		}
		else if (year % 100 == 0)
		{
			
		}
	}

}
