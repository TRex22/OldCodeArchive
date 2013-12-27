package myClientsInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClientsInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Message = "Client Name             Meals              paid/account\n";
		try {
			Scanner scFile = new Scanner(new File("ClientsInfo.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				Message += scLine.next()+"         "+scLine.next()+"        "+scLine.next()+"\n";
				scLine.close();
			}

			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error with Scanner class for file");
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, Message);

	}

}
