package mySong;

import javax.swing.JOptionPane;

public class Song {

	/**
	 * 
	 * String 1
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String song = "";
		for(int i = 1;i<=3;i++)
		{
			song += "The wheels on the bus go ";
			
			
			for(int j = 1;j<=3;j++)
			{
				song += "round and round,";
			}
			
			song += "\n";
		}
		
		JOptionPane.showMessageDialog(null, song+"\nAll over Town!");
		
		
	}

}
