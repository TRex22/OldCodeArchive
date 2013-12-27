package myPerson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManyPersons {

	//array class that reads the text file or input from user
	//into an array of the super/sub class
	//it contains all the people. If we want to access 1 person
	//we use a loop, ie call the class Person in a loop
	
	//fields
	//1 array field = array of obj 
	// = instanciate an array pf the super class
	// in [] place the max amounts of elements
	
	private Person[] arr = new Person[100];
	//filed to keep the quantity of elments in the array
	private int size;
	
	//No setters and getters
	//Default constructor = read the text file into the array
	////and count the elements in the array
	
	public ManyPersons ()
	{
		size = 0;
		try {
			Scanner scFile = new Scanner (new File("person.txt"));
			while (scFile.hasNext())
			{
				//String line = scFile.nextLine();
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				String name = scLine.next();
				String telnum = scLine.next();
				//instaciate obj
				arr[size] = new Person (name, telnum);
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
		String out = "NAME\tTelnum\n--------------------------------\n";
		//loop to get content array
		for (int i = 0; i<size;i++)
		{
			out+=arr[i].toString()+"\n";
		}
		//return the string
		return out;
		
	}
	//sort method to sort the array based on the name
	public void sortName()
	{
		//loop  1 going from first to second last
		//loop 2 from the position after loop1 until the last
		//check if the name loop 1 points at is after the name loop2 points at
		for (int loop1=0;loop1<size-1;loop1++)
		//dont need brackets if one line
			for (int loop2=loop1+1;loop2<size;loop2++)
			
				if (arr[loop1].getName().compareToIgnoreCase(arr[loop2].getName())>0)
				{
					Person temp;
					temp = arr[loop1];
					arr[loop1]=arr[loop2];
					arr[loop2]=temp;
				}
			
		
	}
	public String search (String name)
	{
		String out ="is not in the list";
		for (int i =1;i<size;i++)
		{
			if (name.equalsIgnoreCase(arr[i].getName()))
			{
				out=name+" is in the lst";
			}
		}
		return out;
	}
}
