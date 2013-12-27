package myIntArray;

import javax.swing.JOptionPane;

public class IntArray {

	/**
	 * Generate 8 random ints (between 20 and 50)
	 * and svae it into an array
	 * Display tyhe ints on one line with spaces between.
	 * square each numeber and diapsly the results
	 * Diaplsy the array in reverse order
	 * Calc AND disp the avg, highest and lowest num
	 */
	public static void main(String[] args) {
		int[] intArray = new int [8];
		for (int i = 0;i<8;i++)
		{
			intArray[i]=(int) (Math.random()*30+20);
		}
		String message = "";
		for (int i =0;i<8;i++)
		{
			message += intArray[i]+" ";
		}

		//JOptionPane.showMessageDialog(null, message);

		message += "\n\nNumbers squared:\n";
		for (int i = 0 ; i<8; i++)
		{
			message += Math.pow(intArray[i],2)+" ";
		}
		message += "n\nRevers order:\n";
		for (int i =7;i>=0;i--)
		{
			message +=""+ intArray[i]+" ";
		}
		message +="\n";
		int sum = 0;
		int high =0;
		int low = 55;
		for (int i =0;i<8;i++)
		{
			sum+=intArray[i];
			if (intArray[i]>high)
			{
				high = intArray[i];
			}
			if (intArray[i]<low)
			{
				low=intArray[i];
			}
		}
		message+= "Average: "+(sum/8);
		message += "Highest: "+high+"\nlowest: "+low;
		JOptionPane.showMessageDialog(null, message);
	}

}
