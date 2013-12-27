package myUsingMathMethods;

import javax.swing.JOptionPane;

public class UsingMathMethods {

	/**
	 * 
	 */
	public static void main(String[] args) {
		try {
		JOptionPane.showMessageDialog(null, 
				"10 to the power 5 ="
				+ Math.pow(10,5));
		int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer"));
		iNum1 = Math.abs(iNum1);
		double rNum1 = Math.sqrt(iNum1);
		int iAns = (int) Math.round(rNum1);
		JOptionPane.showMessageDialog(null,
				"The squareroot of "+iNum1+" = "
				+iAns);
		//display random number
		//truncate = (int)
		//generate random number between 0 and 1
		//times by your maximum 
		//add where you start from
		// (int) (Math.random()*difference)+start
		iAns = (int) (Math.random()*6)+1;
	
		JOptionPane.showMessageDialog(null, "The random number is "+iAns );
		
		
		
		
	
	
		}catch(Exception x){JOptionPane.showMessageDialog(null,"Unknown Error" );}
	
	}

}
