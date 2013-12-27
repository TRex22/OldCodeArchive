package myMultiplication;

import javax.swing.JOptionPane;

public class Multiplication {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Which number do you want to show multiplication of?"));
		int start = Integer.parseInt(JOptionPane.showInputDialog("Where you want to start"));
		int finish = Integer.parseInt(JOptionPane.showInputDialog("Where you want to end"));
		String output = "";
		for (int i=start;i<=finish;i=i+number)
		{
			output +=i+"\n";
		}
		JOptionPane.showMessageDialog(null, output);
		
		
		

	}

}
