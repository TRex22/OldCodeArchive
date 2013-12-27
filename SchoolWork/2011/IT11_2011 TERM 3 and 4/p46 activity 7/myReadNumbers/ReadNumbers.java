package myReadNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadNumbers {

	public static void main(String[] args) {
		try {
			Scanner scFile = new Scanner(new File("Numbers.txt"));
			while(scFile.hasNext())
			{
				int number = scFile.nextInt();
				System.out.println(number);
			}
			scFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}


	}

}
