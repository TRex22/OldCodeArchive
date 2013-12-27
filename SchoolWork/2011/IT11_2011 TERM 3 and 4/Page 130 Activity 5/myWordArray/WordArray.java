package myWordArray;

import javax.swing.JOptionPane;

public class WordArray {

	/**
	 * Enter an unknown number of words into an array
	 * Display the words in a seperate loop.
	 */
	public static void main(String[] args) {
		String[] strArray = new String[50];
		//String input = "";
		int size = 0;
		strArray[size]=JOptionPane.showInputDialog("Enter word");
		while (!strArray[size].equalsIgnoreCase("stop"))
		{

			//input = JOptionPane.showInputDialog("enter word");
			size++;

			strArray [size] = JOptionPane.showInputDialog("Entre word");


		}
		String message = "";for (int i =0;i<size;i++)
		{
			message += strArray[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, message);

	}

}
