package myloopletters;

import javax.swing.JOptionPane;

public class loopletters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char choice = JOptionPane.showInputDialog("A or D").toUpperCase().charAt(0);
		String output ="";
		if (choice=='A')
		{
			for (char letter = 'A';letter <='Z';letter++)
			{
				output +=letter+"\n";
			}
		}
		else if (choice == 'D')
		{
			for (char letter = 'Z';letter >='A';letter--)
			{
				output +=letter+"\n";
			}
		}
		else
		{
			System.out.println("SCREW U");
		}
		
		JOptionPane.showMessageDialog(null, output);
	}

}
