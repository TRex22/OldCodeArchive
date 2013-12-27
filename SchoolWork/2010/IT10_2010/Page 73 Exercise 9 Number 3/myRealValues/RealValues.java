package myRealValues;

import javax.swing.*;

public class RealValues {

	/**
	 * 
	 */
	public static void main(String[] args) {
		try {
			//3.1 Convert2DecPlaces
			//get real
			double getARealNumber = Double.parseDouble(JOptionPane.showInputDialog( "Enter a Real Number with more than two decimal places" ));
			double ori = getARealNumber;
			getARealNumber = getARealNumber*100;
			//if (getARealNumber >= 1){JOptionPane.showMessageDialog(null, "Error 2 Please Enter a Real Number with more than two decimal places");}
			//else{
			
				//with more than 2 dec places
			
			//convert to a real rounded to 2 decimal places
			//number x100
			
			//round number
			getARealNumber = Math.round(getARealNumber);
			//number / 100
			getARealNumber = getARealNumber/100;
			//dsp
			JOptionPane.showMessageDialog(null, "The Real Number "+ori+" rounded off to two decimal places is:"+getARealNumber );
			
			
			//}
			//3.2 numresult1
			//get int and double
			int iNum = Integer.parseInt(JOptionPane.showInputDialog( "Enter a Integer" ));
			double rNum = Double.parseDouble(JOptionPane.showInputDialog("Enter a Real Number"));
			//sqrt
			
			//out
			//JOptionPane.showMessageDialog(null, "REAL NUMBER   SQUARE ROOT    RAISED TO POWER "+iNum+
				//								"\n   "+rNum+"       "+(Math.sqrt(rNum))+"  "+(Math.pow(rNum, iNum)) );
			//Import a frame
			JFrame nameofframe = new JFrame();
			//make visiable
			nameofframe.setVisible(true);
			nameofframe.setSize(600,500);
			nameofframe.setLocation(20,20);
			nameofframe.setTitle( "HELLO AND GOODBYE" );
			//import text area
			JTextArea txt = new JTextArea();
			nameofframe.add(txt);
			//display in text area
			//fist set text then append after
			txt.setTabSize(20);
			txt.setText( "REAL NUMBER \tSQUAREROOT \tRAISED TO POWER" +iNum);
			txt.append("\n"+rNum+"\t"+(Math.sqrt(rNum))+"\t"+(Math.pow(rNum, iNum)) );
			
			
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Unknown Error 1");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
