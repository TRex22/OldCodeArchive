package myMaxMinNum;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CopyOfMaxMinNum {

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

			//If using JOptionPane use strings if u want one dialog
			//(If .... {message1="message"} )for example
			//String message1 = "", Message2 = "", Message3 = "";

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
			if (num>0)
			{

				txt.setText(num+" is a positive number");
			}
			else if (num<0)
			{

				txt.setText(num+" is a negative number");
			}
			else
			{

				txt.setText(num+" is zero");
			}
			if (num>max)
			{

				txt.append("\n"+num+" is Greater than "+max);
			}
			else if (num<max)
			{
				txt.append("\n"+num+" is Smaller Than "+max);
			}
			if (num<min)
			{

				txt.append("\n"+num+" is less than "+min);
			}
			else if (num>min)
			{
				txt.append("\n"+num+" is more than "+min);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "WTF, U A RETARD? ENTER NUMBER ONLY");
		}
	}

}
