package myStringArray;

import javax.swing.JOptionPane;

public class StringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//store 12 names in a string array
		String [] nameArray = new String [12];
		for (int i =0 ; i<12;i++)
		{
			nameArray [i]=JOptionPane.showInputDialog("Enter name "+(i+1) );
		}
		//Disp names longer than 6 letters
		String NameOut = "";
		String LongestName = "";
		for (int i = 0; i<12;i++)
		{
			if (nameArray[i].length() >6)
			{
				NameOut +=""+nameArray [i]+"\n";

			}
		}
		for (int i = 0 ; i<12 ; i++)
		{
			if (LongestName.length()<nameArray[i].length())
			{
				LongestName = nameArray[i];
			}
			
		}
		//Determine and disp longest name
		JOptionPane.showMessageDialog(null, NameOut+"\nLongest Name: "+LongestName);

	}

}
