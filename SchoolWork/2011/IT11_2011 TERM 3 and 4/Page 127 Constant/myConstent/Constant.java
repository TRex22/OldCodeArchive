package myConstent;

import javax.swing.JOptionPane;

public class Constant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//make array of constant values
		//No input = fixed values
		int [] array = {2,4,6,8,10,12,14};
		//Display
		String message = "";
		for (int i =0 ; i<array.length;i++)
		{
			message+=array[i]+" ";
		}
		JOptionPane.showMessageDialog(null, message);


	}

}
