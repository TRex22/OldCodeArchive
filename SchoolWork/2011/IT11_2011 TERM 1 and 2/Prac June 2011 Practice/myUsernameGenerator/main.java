package myUsernameGenerator;

import javax.swing.JOptionPane;

public class main {

	/**
	 *
	 */
	public static void main(String[] args) {


		String name = JOptionPane.showInputDialog("Enter your name");
		String surname = JOptionPane.showInputDialog("Enter your surname");
		UsernameGenerator UsrGen = new UsernameGenerator(name, surname);
		//UsrGen.UsernameGenerator(name, surname);
		JOptionPane.showMessageDialog(null, UsrGen.generateUsername());




	}

}
