package myStrArray;

import javax.swing.JOptionPane;

public class StrArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare array to keep 8 words
		String[] arrayStr = new String[8];

		for (int i = 0 ; i<8;i++)
		{
			arrayStr[i]=JOptionPane.showInputDialog("Enter word "+(i+1));
		}

		//P
		for (int i =0 ; i<8;i++)
		{
			arrayStr[i]=arrayStr[i].toUpperCase().charAt(0)+arrayStr[i].toLowerCase().substring(1);
		}

		//Disp
		String message = "";
		for (int j=0;j<8;j++)
		{
			message+= (j+1)+".    "+arrayStr[j]+"\n";
		}
		JOptionPane.showMessageDialog(null, message);


	}

}
