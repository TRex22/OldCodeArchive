package myBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	try {
		Scanner scFile = new Scanner(new File("Savings.txt"));
		
		while(scFile.hasNext())
		{
			Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
			String owner = scLine.next();
			int accCode = Integer.parseInt(scLine.next());
			String IDNo = scLine.next();
			double balance = Double.parseDouble(scLine.next());
			BankAccount BA;
			String output ="";
			if (scLine.hasNext())
			{
				double interestRate;
				interestRate = Double.parseDouble(scLine.next());
				BA = new SavingsAccount (owner, accCode, IDNo, balance, interestRate);
				
				
			}
			else
			{
				BA = new BankAccount (owner, accCode, IDNo, balance);
			}
		
			System.out.println(BA.toString());
			char choice = JOptionPane.showInputDialog( "Do You Want to change the balance <Y/N>").toUpperCase().charAt(0);
			if (choice == 'Y')
			{
				double balanceNew = Double.parseDouble(JOptionPane.showInputDialog("Enter new balance"));
				BA.setBalance(balanceNew);
			}
		}
		
		scFile.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
