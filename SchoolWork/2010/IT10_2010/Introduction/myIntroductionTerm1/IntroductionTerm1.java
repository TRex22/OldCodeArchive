package myIntroductionTerm1;

import javax.swing.JOptionPane;

public class IntroductionTerm1 {
// curly begin and end of class
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// makes class or unit run by itself
		// curly begin and end of procedure
		// Display the message hello
		// Display in console use word system
		// like VB . shows ownership out is for output
		// println just like VB or writeln in pascal
		// brackets to place text into
		// any program statement must end with semicolon like pascal
		// NB plain message is " "
		//System.out.println( "hello" );
		//numbers don't need apostrophe
		//System.out.println( 5 );
		//in apostrophe it will show 5+6 
		//System.out.println( "5+6" );
		//But like this it will concatenate
		//System.out.println ("5"+"6"); 
		//but if it must be worked out
		//System.out.println( 5+6 );
		//	another print
		//	use windows for output we use JOptionPane
		//JOptionPane.showMessageDialog(null,"hello" );
		//JOptionPane.showMessageDialog(null, 5 + 6);
		//if we want to store data and then display it
		//DataType VariableName = "content or value";  
		String surname = "Eric" ;
		String name = "Cartman" ;
		JOptionPane.showMessageDialog(null,name+" "+ surname);
		int num1 = 5;
		int num2 = 6;
		JOptionPane.showMessageDialog(null,"5+6="+ num1 + num2);
		
	}
	

}
