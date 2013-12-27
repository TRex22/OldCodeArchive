package Ques3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryArray {

	String[] libArr = new String[100];
	int size = 0;
	
	public LibraryArray ()
	{
		try {
			Scanner scFile = new Scanner(new File("LibraryBooks.txt"));
			int counter = 0;
			while (scFile.hasNext())
			{
				libArr[counter]=scFile.nextLine();
				size++;
			}
			
			
			
			
		scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String displayBooks ()
	{
		String message = "";
		
		return message;
	}
	
	
	
	
	
	
}
