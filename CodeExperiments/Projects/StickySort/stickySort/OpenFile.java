package stickySort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *This code is made by Jason Chalom 12S
 *I am using programming techniques which I learned in class
 *
 *Edited 2013
 *Need to make buffered reader
 */
public class OpenFile {
	//This first method opens data
	//There is no need for arrays since the 
	//data may not have any logical and uniform 
	//structure so it must just check if the file
	//is correct, e.g. data validation
	//It must then make the survey file if it is valid
	//into a String variable 
	
	//OpenFile method
	//input the file path from the importjfilechooser in the gui main method
	//determine if the file is valid
	//return the file as a String
	public String OpenFile(File file)
	{
		String FileData = "";
		String FileLocation = ""+file;
		boolean FileISValid = true;
		//A rule for a valid survey is that it must be a .txt extension
		//determine if it is a txt file
		if (FileLocation.contains(".txt"))
		{
			//if it is a txt file then 
			//the second rule must be determined
			//this rule makes any survey file which is blank invalid
			//this is also where the survey data will also be read if
			//the file has data in it
			
			//Scanner to scan the file
			try {
				Scanner scFile = new Scanner (file);
				//this determines if there is data in the file
				//or it is not valid
				if (scFile.hasNext())
				{
					//loop to run through every line in the file
					//and add it to the return string
					while (scFile.hasNext())
					{
						//Scanner for the line
						//the String must have \n to denote next lines
						FileData += scFile.nextLine()+"\n";
						//close the stream
						//scLine.close();
					}
				}
				else
				{
					//if there is no data in the file it is invalid
					FileISValid=false;
				}
				//close the stream
				scFile.close();
			} catch (FileNotFoundException e) {
				// if the scanner fails then the file is also invalid 
				//rule 3
				e.printStackTrace();
				FileISValid = false;
			}
		}
		else
		{
			FileISValid = false;
		}
		
		if (FileISValid == true)
		{
			return FileData;
		}
		else
		{
			return "Error. File was not valid.";
		}
		
		
	}
	
	
	
	
}
