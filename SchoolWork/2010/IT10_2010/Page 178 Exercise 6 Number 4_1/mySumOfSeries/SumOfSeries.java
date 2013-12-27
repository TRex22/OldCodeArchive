package mySumOfSeries;

import java.text.DecimalFormat;

import javax.swing.*;

public class SumOfSeries {

	/**
	 *Before loop:
	 *	numerator = 1
	 *	denominator = 2 
	 * 	initialise and declare sum
	 * 	initialise and declare output string
	 * loop 15 times
	 * 	term = numerator/denominator
	 * 	add term to sum
	 * 	add variables to output string
	 * 	Increase denominator and numerator
	 * after loop
	 *	display sum
	 **/
	 
	 
	public static void main(String[] args) {
		
		int numerator = 1;
		int denominator = 2;
		String output = "";
		double term = 0, sum = 0;
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setSize(500,200);
		for (int loop=1;loop<=15;loop++)
		
		{
			term = 1.0*numerator / denominator;
			sum += term;
			output += numerator+"/"+denominator+"+";
			numerator ++;
			denominator ++;
		
		
		
		}
		int last = output.length()-1;
		DecimalFormat deci = new DecimalFormat("#00.00");
		output = output.substring(0,last)+"\n=\n";
		//add deci
		txt.setText(output+sum);
		frame.setVisible(true);
	
	
	
	
	}

}
;