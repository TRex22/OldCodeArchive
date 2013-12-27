package myDate100;

import javax.swing.JOptionPane;

public class Date100 {

	/**
	 * A year is entered in the form yyyy eg. 1977. Use the / and % 
	 * operators to separate the first 2 digits (19) from the last 2(77).
	 * Store these two numbers in intermediate variables. Add 1 onto the first 
	 * (so that 19 becomes 20), and then display the result together with
	 * the second, to give the date in 100 years' time (2077)
	 * and errors
	 */
	public static void main(String[] args) {
	try{	
		//IPO
		//Input
		int iyear = Integer.parseInt(JOptionPane.showInputDialog( "Please Enter in a Year" ) ); 
		//Process
		int ifirst = iyear / 100;
		int ilast = iyear % 100;
		int iyear100 = iyear + 100;
		ifirst++;
		//Output
		JOptionPane.showMessageDialog(null, "The Year Entered is: "+iyear+
											"\nThe Year number in a Hundred years Calculated " +
											"\nin the easy way is: "
												//+ifirst+""+ilast	
													+iyear100
													+"\nThe Year number in a Hundred Years Calaculated " +
															"\nin the hard way is: "+ifirst+""+ilast);

	}catch (NumberFormatException x){System.err.println("Please only Enter in Integer Year Numbers Error 1");}
		
		
		
		
		
	}

}
