package myReadNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadNumbers {

	/**
	 *
	 */
	public static void main(String[] args) {

		try {
			Scanner scFile = new Scanner(new File("Numbers.tpx"));
			String message = "";
			while (scFile.hasNext())
			{
				try{
				int number = scFile.nextInt();
				message+=number+"\n";
				}catch(InputMismatchException d)
				{
					message+="invalid bastered";
				}
			}
			JOptionPane.showMessageDialog(null, message);
			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("WHY :(");
		}

	}

}
