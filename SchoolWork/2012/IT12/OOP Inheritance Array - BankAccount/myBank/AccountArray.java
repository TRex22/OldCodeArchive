package myBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountArray {
	//array is of super
	private BankAccount [] accArr = new BankAccount[100];
	private int size;
	
	public AccountArray ()
	{
		size = 0;
		try {
			Scanner scFile = new Scanner (new File("Account.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				String owner = scLine.next();
				String accCode =  scLine.next();
				String IDNo =  scLine.next();
				double balance =  scLine.nextDouble();
				if (validAcc(accCode, IDNo, owner)==true)
				{
				if (scLine.hasNext())
				{
					double interestRate = scLine.nextDouble();
					accArr[size] = new SavingsAccount (owner, accCode, IDNo, balance, interestRate);
				}
				else
				{
					accArr[size] = new BankAccount (owner, accCode, IDNo, balance);
				}
				
				size++;
				scLine.close();
				}
				
				
			}
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public boolean validAcc (String accCode, String IDNo, String owner)
	{
		boolean out = true;
		if (accCode.length()==9)
		{
			
			int ID = Integer.parseInt(accCode.substring(0,3));
			int first = Integer.parseInt(accCode.substring(3,6));
			int third = Integer.parseInt(accCode.substring(6));
			int sum = 0;
			for (int i=0; i<IDNo.length();i++)
			{
				char digit = IDNo.charAt(i);
				
				if (Character.isDigit(digit))
				{
					sum += Integer.parseInt(""+digit);
				}
				else
				{
					out=false;
				}
			}
			if (sum != ID)
			{
				out = true;
			}
			
			//check somthjing ascii
			int value1 = (int)owner.charAt(0);
			if (first!=value1)
			{
				out = false;
			}
			
			int value3 = (int)owner.charAt(0);
			if (third!=value3)
			{
				out = false;
			}
		}
		
		else
		{
			out = false;
		}
		return out;
	}
	
	
	public String toString()
	{
		String out = "";
		for (int i=0; i<size;i++)
		{
			if(accArr[i] instanceof BankAccount)
			{
				out+=accArr[i].toString()+"\n";
			}
			else
			{
				SavingsAccount temp = (SavingsAccount) accArr[i];
				out+=temp.toString()+"\n";
			}
			
		}
		
		return out;
	}
	
	public int search (String accountNo)
	{
		int position = -1;
		for (int i=0; i <size;i++)
		{
			if (accArr[i].getAccCode().equals(accountNo))
			{
				position = i+1;
			}
		}
		
	return position;
	}
	public void deposit (int position, double amount)
	{
		accArr[position].setBalance(accArr[position].getBalance()+amount);
	}
}
