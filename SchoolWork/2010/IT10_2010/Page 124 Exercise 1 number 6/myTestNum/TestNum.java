package myTestNum;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestNum {

	/**
	 * Input Integer Number
	 * if Number greater than 5
	 * 	display message
	 * if equal to 5
	 * 	display message
	 * if divisiable by 5
	 * 	display message
	 */
	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(JOptionPane.showInputDialog("Input An Integer"));
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

			txt.setTabSize(20);

			if (num > 5 )
			{
				txt.setText("The Number Is: "+num);
				txt.append("\nIt Is Greater Than The Integer 5");
			}
			else if (num == 5)
			{
				txt.setText("The Number Is: "+num);
				txt.append("\nWhich Is Equal To The Integer 5");
			}
			else 		{
				txt.setText("The Number Is: "+num);
				txt.append("\nIt Is Less Than The Intger 5");
			}
			if (num%5==0 )
			{
				txt.append("\nThe Number Is: "+num);
				txt.append("\nIt Is Divisiable by The Integer 5");
			}
			else
			{
				txt.append("\nThe Number Is: "+num);
				txt.append("\nIt Is Not Divisiable by The Integer 5");
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "What ever The Problem Is,\nI dont Know What It Is.");
		}

	}

}
