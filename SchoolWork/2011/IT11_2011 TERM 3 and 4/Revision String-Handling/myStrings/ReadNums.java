package myStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadNums {

	/**
	 * Type 10 ints into txt file
	 * use scanner class
	 * determine and display
	 * 	sum
	 * 	avg
	 * 	highest number
	 * 	lowest number
	 */
	public static void main(String[] args) {

		Scanner scFile;
		try {
			scFile = new Scanner(new File("numbers.txt"));


		int sum =0 ;
		int highest = 0;
		int lowest = 9999;
		double avg = 0;

		while (scFile.hasNext())
		{
			int number = scFile.nextInt();
			sum +=number;
			if (number > highest)
			{
				highest = number;
			}
			if (number < lowest)
			{
				lowest = number;
			}



		}
		avg = sum/10;
		JOptionPane.showMessageDialog(null, "Sum: "+sum+"\nHighest Number: "+highest+"\nLowest Number: "+lowest+"\nAverage: "+avg);

		scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
