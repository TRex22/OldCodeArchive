package myStarStop;

import javax.swing.JOptionPane;

public class StarStop {

	/**
	 *
	 */
	public static void main(String[] args) {
		int i = 0;
		char usrent;
		String out = "";
		do
		{
			usrent = JOptionPane.showInputDialog("Enter a charachter or enter * to exit").charAt(0);
			out += " "+usrent;
			i++;
		}
		while(usrent != '*');
		JOptionPane.showMessageDialog(null, out+"\nTotal is "+i);


	}

}
