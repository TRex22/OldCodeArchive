package myWhileEx;

import javax.swing.JOptionPane;

public class WhileEx {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int start = Integer.parseInt(JOptionPane.showInputDialog("Start Value"));
		int end = Integer.parseInt(JOptionPane.showInputDialog("End Value"));
		int i = start;
		
		while (i <= end)
		{
			
			System.out.print("  "+i+"  ");
			i++;
		}
		
		
		
		
		
	}

}
