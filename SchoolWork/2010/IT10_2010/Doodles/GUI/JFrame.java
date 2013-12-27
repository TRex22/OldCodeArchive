package GUI;

import javax.swing.*;

public class JFrame {

	/**
	 * USING JFRAME FOR GUI 
	 * on proj page 73 exercise 9 number 3
	 */
	public static void main(String[] args) {
		
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
		
		
		
		
	
	
	
	
	
	
	
	}

}
