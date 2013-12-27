package myPrintStars;

import javax.swing.JOptionPane;

public class PrintStars {

	/**
	 * 
	 */
	public static void main(String[] args) {
		String out = "";
		String symbol = JOptionPane.showInputDialog("ENTER SYMBOL");
		int no = Integer.parseInt(JOptionPane.showInputDialog("ENTER no of symbols"));
		for (int i = 1; i<=no;i++)
		{
			out = out+symbol+"\n";
			
		}
		JOptionPane.showMessageDialog(null, out);
		
		
		
	}

}
