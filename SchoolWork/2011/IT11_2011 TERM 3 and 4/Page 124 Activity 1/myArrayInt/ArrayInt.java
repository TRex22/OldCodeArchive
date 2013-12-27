package myArrayInt;

import javax.swing.JOptionPane;

public class ArrayInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num = new int [10]; //counts pos 0 but do not waste pos 0 by placing 11
		for (int i =0;i<10;i++)
		{
			num[i]=Integer.parseInt(JOptionPane.showInputDialog("eNTER NO "+(i+1)));
		}

		//processing of array happens in between
		//can edit and change array and even delete a index position
		//then re-return the array to display

		//e.g. duoble nos
		for(int i = 0 ; i<10;i++){
		num[i]=num[i]*2;
		}
		//Display
		String message = "";
		for (int i=0;i<10;i++)
		{
			message+=num[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,message);







	}

}
