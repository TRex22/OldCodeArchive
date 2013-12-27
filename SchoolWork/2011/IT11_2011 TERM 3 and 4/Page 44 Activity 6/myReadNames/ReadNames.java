package myReadNames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadNames {

	/**
	 *
	 */
	public static void main(String[] args) {

		try {
			//scan the file
			//import java.io
			//import java.util
			//catch or throw the FileNotFoundeXCEPTION
			Scanner scFile = new Scanner (new File("Textfile.txt"));
			//disp string
			String message = "";
			//LOOP THROUGH THE TEXT FILE
			while (scFile.hasNext())
			{
				//read the line - in this case it is the name
				String name = scFile.nextLine();
				//add name to disp string
				message+=name+"\n";
			}
			//display all the names
			JOptionPane.showMessageDialog(null, message);
			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There was a problem.");
		}

	}

}
