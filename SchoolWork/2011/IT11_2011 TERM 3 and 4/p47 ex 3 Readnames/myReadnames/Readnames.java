package myReadnames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readnames {

	/**
	 * Read names from a text file
	 * Remove all vowels from the names (ignore the first letter)
	 * Display the changed names
	 */
	public static void main(String[] args) {
		//scan text file and then
		//import util to use Scanner
		//import io to use File
		//surround with try..catch
		try {
			Scanner scFile = new Scanner(new File("names.txt"));
			//loop through the file
			while(scFile.hasNext())
			{
				//read line
				String name = scFile.nextLine();
				//make new string that has first letter
				String newName=""+name.charAt(0);
				String vowels = "AEIOUaeiou";
				//loop through the letters in the name from letter 2
				for (int i=1;i<name.length();i++)
				{
					//get the letter
					char letter = name.charAt(i);
					//determine if it is NOT a vowel
					//if it is not: we can keep it
					if(vowels.indexOf(letter)<0)
					{
						newName+=letter;
					}
				}//end for
				//display the new name
				System.out.println(newName);
			}//end while
			//close the file
			scFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
