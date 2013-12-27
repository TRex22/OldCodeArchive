package myMyMarkSymbol;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MarkSymbol {

	/**
	 * Enter Mark Of Test recieved
	 * Enter Total Marks Of Test
	 * Find Percentage
	 * determine if percentage is greater than or equal to 80 
	 * 	-display Symbol Is A
	 * determine if % is greater than or equal to 70 and lower than 80
	 * 	-display Symbol is B
	 * determine if % is greater or equal to 60 and smaller than 70
	 * 	-dsp Symbol is C
	 * determine if % is greater or equal to 50 and smaller than 60
	 * 	-dsp Symbol is D
	 * determine if % smaller than 50
	 * 	-dsp Symbol is E
	 */
	public static void main(String[] args) {
		
		int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter Pupils Mark"));
		int total = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Mark Of Test"));
		int percent = 10*mark/total*10;
		
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

	if (percent >=80)
	{
		txt.setText("The Pupil Got "+percent+" percent\n" +
				"The Pupil Got An A");
	}
	if (percent >=70 & percent<80)
	{
		txt.setText("The Pupil Got "+percent+" percent\n" +
				"The Pupil Got An B");
	}
	if (percent >=60 & percent<70)
	{
		txt.setText("The Pupil Got "+percent+" percent\n" +
				"The Pupil Got An C");
	}
	if (percent >=50 & percent<60)
	{
		txt.setText("The Pupil Got "+percent+" percent\n" +
				"The Pupil Got An D");
	}
	if (percent < 50)
	{
		txt.setText("The Pupil Got "+percent+" percent\n" +
				"The Pupil Got An E");
	}
	}

}
