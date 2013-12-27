package myArethmatic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Arethmatic {

	/**
	 * Input two numbers
	 * show a menu
	 * program based on menu
	 */
	public static void main(String[] args) {
	
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER 2"));
		
		char choice = JOptionPane.showInputDialog("Choose from the following: \n"+
				"A: Add numbes\n" +
				"S: Subtract Numbers\n" +
				"M: Multiply Numbers\n" +
				"D: Divide Numbers\n" +
				"Enter the Charactor only").toUpperCase().charAt(0);
		
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.setSize(200,200);
		frame.add(txt);
		frame.setVisible(true);
		//program based on menu
		switch (choice)
		{
		case 'A':txt.setText(""+(num1+num2));
		break;
		case 'S':txt.setText(""+(num1-num2));
		break;
		case 'M':txt.setText(""+(num1*num2));
		break;
		case 'D':txt.setText(""+(num1/num2+" with a remainder of "+(num1%num2)));
		break;
		default	:txt.setText("Incorrect Choice!!!");
		}
		
		
		
	}

}
