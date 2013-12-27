package myMaxMinNum;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MaxMinNum {

	/**
	 * input a number
	 * compare number to a max and a min number
	 * display if the number is larger than zero 
	 * or equal tom zero
	 * or negative
	 * Display if number number is large that the maximum number
	 * or less than the minimum number
	 */
	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(JOptionPane.showInputDialog
					("Enter A Number"));
			int max = 100;
			int min = 20;

			if (num>0)
			{
				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(350,100);
				nameofframe.setTitle( "Min Max" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText(num+" is a positive number");
			}
			else if (num<0)
			{
				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(350,100);
				nameofframe.setTitle( "Min Max" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText(num+" is a negative number");
			}
			else
			{
				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(350,100);
				nameofframe.setTitle( "Min Max" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText(num+" is zero");
			}
			if (num<max)
			{
				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(350,100);
				nameofframe.setTitle( "Min Max" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText(num+" is Greater than "+max);
			}
			if (num<min)
			{
				//Import a frame
				JFrame nameofframe = new JFrame();

				//make visiable
				nameofframe.setVisible(true);
				nameofframe.setLocation(40,20);
				nameofframe.setSize(350,100);
				nameofframe.setTitle( "Min Max" );

				//import text area

				JTextArea txt = new JTextArea();
				nameofframe.add(txt);

				//display in text area
				//fist set text then append after

				txt.setTabSize(20);
				txt.setText(num+" is less than "+min);
			}


		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "WTF, U A RETARD? ENTER NUMBER ONLY");
		}
	}

}
