package myMakeLabels;

import javax.swing.JOptionPane;

public class MakeLabels {

	/**
	 * IT10 2010 21 Jan 2010 Jason Chalom Page 33 Activity 1
	 */
	public static void main(String[] args) {
		//System.out.println( "***********************" );
		//System.out.println( "*    Jason Chalom     *" );
		//System.out.println( "*         IT          *" );
		//System.out.println( "***********************" );
			//OR
		//declare a string
		String subject;
		//input = asked user for subject name
		//the question we ask is called a prompt message
		//input appears in JOptionPane
		subject = JOptionPane.showInputDialog( "Enter Subject Name Below:" );  
		//declare a variable to store persons name
		//output show subject and other in console
		System.out.println( "*********************  "+
							"\n    Jason Chalom     "+
							"\n        "  	+ subject+
							"\n     Grade 10S	    "+
							"\n*********************");
		
	
	
	
	
	
	}

}
