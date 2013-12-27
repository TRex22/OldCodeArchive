package myInputFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputFromFile {

	/**
	 * Read Names from a text file called Names.txt into an array
	 * Display the array in a seperate loop
	 */
	public static void main(String[] args) {

		String[] arNames = new String[50];
		int size = 0;
		try{
			Scanner scFile = new Scanner(new File("Names.txt"));
			while (scFile.hasNext())
			{
				arNames[size]=scFile.nextLine();
				size++;
			}
			scFile.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		String message = "";
		for (int i=0;i<size;i++)
		{
			message+=arNames[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, message);


	}

}
