package myDoubleArray;

import javax.swing.JOptionPane;

public class DoubleArray {

	/**
	 * Code a programm to store 10 real numbers in an array
	 * Display all numbers
	 * Display the number of values that are larger than 26.5.
	 * Calc and disp the avg
	 * Determine how many nos are smaller than the avg
	 */
	public static void main(String[] args) {
		double[] poo = new double[10];
		String Message = "";
		for (int i =0 ; i<10;i++)
		{
			poo[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter real no"));


		}
		for (int i =0;i<10;i++)
		{
			Message +=""+poo[i]+"\n";

		}
		for (int i =0;i<10;i++)
		{
			if (poo[i]>26.5)
			{
				Message+="\nBigger Than 26.5:\n"+poo[i];
			}
		}
		double sum = 0;
		for (int i =0 ;i<10;i++)
		{
			sum += poo[i];
		}
		double average = sum/10;
		Message += "\n Avg: "+average;
		int count = 0;
		for (int i =0 ; i<10;i++)
		{
			if (poo[i]<average)
			{
				count ++;
			}
		}
		Message+="\n"+count+" Nos are samller than avg";

		JOptionPane.showMessageDialog(null,Message);


	}

}
