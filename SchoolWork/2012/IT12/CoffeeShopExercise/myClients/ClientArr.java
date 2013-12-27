package myClients;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ClientArr {
	private Client arrClient[] = new Client[50];
	private int size;
	
	public ClientArr()
	{
		try {
			Scanner scFile = new Scanner (new File("Clients.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				arrClient[size]= new Client ();
				arrClient[size].setClientID(scLine.nextInt());
				arrClient[size].setName(scLine.next()); 
				arrClient[size].setHoursUsed(scLine.nextDouble());
				size++;
				scLine.close();
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public String toString()
	{
		String out = "";
		
		for (int i = 0; i<size;i++)
		{
			out += arrClient[i].toString();
		}
		
		return out;
	}
	
	public double totalIncome ()
	{
		double total = 0.00;
		for (int i = 0; i<size;i++)
		{
			total += arrClient[i].calcCost();
		}
		return total;
	}
	public String searchClient (String name)
	{
		String out = "Client was not found.";
		for (int i = 0; i<size;i++)
		{
			if (arrClient[i].getName().contains(name))
			{
				out = arrClient[i].toString()+" Was found at pos: "+i;
			}
		}
		
		return out;
		
	}
}
