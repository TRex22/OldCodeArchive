package myCharPlay;

import javax.swing.JOptionPane;

public class CharPlay {

	/**
	 * 
	 */
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog( "Enter a Sentence" );
		//get first char
		char letter1 = input.charAt(0);
		JOptionPane.showMessageDialog(null,"letter 1 is: "+ letter1 );
		char letter2 = input.charAt(1);
		JOptionPane.showMessageDialog(null,"letter 2 is: "+ letter2 );
		//ask which one to show
		int position = Integer.parseInt(JOptionPane.showInputDialog( "Which Letter Do You Want To Show?" ));
		char letterX = input.charAt(position-1);
		JOptionPane.showMessageDialog(null, "Letter "+position+" is: "+letterX);

	

	
	
	
	
	
	
	
	
	}

}
