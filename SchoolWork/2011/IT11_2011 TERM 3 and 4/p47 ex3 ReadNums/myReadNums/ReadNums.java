package myReadNums;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNums {

	/**
	 * Read integers from text file and display
	 * determine and display the sum, average, highest and lowest
	 */
	public static void main(String[] args) {
		//declare and initialize your summary variables
		int sum=0;
		int count=0;
		int highest=0;//make too low
		int lowest=1000;//make too high
		//read the numbers from the text file
		try {
			Scanner scFile = new Scanner(new File("numbers.txt"));
			//loop through text file
			while (scFile.hasNext())
			{
				//read the number
				int number = scFile.nextInt();
				System.out.println(number);
				//count the number
				count++;
				//add the number to sum
				sum+=number;
				//determine if it is the highest
				if (number>highest)
					highest = number;
				//determine if it the lowest
				if (number<lowest)
					lowest = number;
			}//end while
			//display out summary
			System.out.println();
			System.out.println("Sum: "+sum);
			System.out.println("Average: "+sum/count);
			System.out.println("Highest: "+highest);
			System.out.println("Lowest: "+lowest);
			//close the text file
			scFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
