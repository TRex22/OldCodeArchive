package myPass;

import javax.swing.JOptionPane;

public class Pass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String sPass = JOptionPane.showInputDialog( "Enter The Password" );
	int iPass = Integer.parseInt(sPass);

	if (iPass == 12) {JOptionPane.showMessageDialog(null, "Welcome ASS" ); }
	else {JOptionPane.showMessageDialog(null,"GO TO HELL IMPOSTER" );}

	}

}
