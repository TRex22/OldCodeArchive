package myVideoTime;

import javax.swing.JOptionPane;

public class VideoTime {

	/**
	 * Code a program to input the running time of a video in minutes 
	 * and output the time in hours and minutes. For example a movie 
	 * that has a running time of 143 minutes will be 2 hours and
	 * 23 minutes long.
	 * and extras
	 */
	public static void main(String[] args) {
		try{	
			//IPO
			//Input
			int iNminutes = Integer.parseInt(JOptionPane.showInputDialog( "Please Enter the Time OF Your Video in Minutes" ));
			//process
			int ihours = iNminutes / 60;
			int imins	=	iNminutes % 60;

			//Output
			JOptionPane.showMessageDialog(null, "The Movie with the Running time Of: "+iNminutes+"Minutes"
					+"\nwill be: "+ihours+" Hours and "+imins+" Minutes long");
			if (iNminutes == 297){JOptionPane.showMessageDialog(null, "Why 297???" );} 
		}catch (NumberFormatException x){System.err.println("Please only Enter in Integer Times of your movie in minutes \nError 1");}

		{JOptionPane.showMessageDialog(null, "Thank You For Using my Program" +
				"\nIf You have any Suggestions Please go" +
		"\nTo your nearest Physcologist since this is all in your head!!!!!" );
		JOptionPane.showMessageDialog(null, "HA HA HA HA HA HA HA HA HA" );
		}


	}

}
