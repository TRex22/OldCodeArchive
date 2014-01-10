package myLearner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnerArray {
	private Learner[] lArr = new Learner[10];
	private int size;
	//private int term1;
	//private int term2;
	//private int term3;
	public LearnerArray()
	{
		size = 0;
		try {
			Scanner scFile = new Scanner (new File("Learner.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				String fullName = scLine.next();
				int term1 = Integer.parseInt(scLine.next());
				int term2 = Integer.parseInt(scLine.next());
				int term3 = Integer.parseInt(scLine.next());
				
				
				scLine.close();
				lArr[size] = new Learner(fullName,term1,term2,term3);
				size++;
			}
			
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public String displayAve()
	{
		String out = "";
		for (int i =0; i<size; i++)
		{
			//double Ave = (term1+term2+term3)/3; 
			out += "Learner: "+lArr[i].getFirstName()+" "+lArr[i].getSurname()+" Average Mark: "+lArr[i].getAverage()+"\n";
		}
		
		return out;
	}
	
	public String displayHighest()
	{
		String out = "";
		for (int i = 0; i<size; i++)
		{
			out += ""+lArr[i].getFullName()+": "+lArr[i].getHighestTerm()+": "+lArr[i].getHighestMark()+"\n";
		}
		
		
		return out;
	}
	
	public void sortName()
	{
		for (int i =0 ; i<size-1;i++)
			for (int j = i+1; j<size;j++)
			{
				if (lArr[i].getSurname().compareToIgnoreCase(lArr[j].getSurname())>0)
				{
					Learner temp = lArr[i];
					lArr[i]=lArr[j];
					lArr[j]=temp;
				}
				
				
			}
	}
	
	public void sortAve()
	{
		for (int i =0 ; i<size-1;i++)
			for (int j = i+1; j<size;j++)
			{
				if (lArr[i].getAverage()>lArr[j].getAverage())
				{
					Learner temp = lArr[i];
					lArr[i]=lArr[j];
					lArr[j]=temp;
				}
				
				
			}
	}
	
	public String search(String FirstName)
	{
		String message = "";
		for (int i = 0; i<size;i++)
		{
			if (lArr[i].getFirstName().contains(FirstName))
			message +=lArr[i].getFirstName()+" found at: "+i+"\n";
		}
		if (message.equals(""))
		{
			message=FirstName + " not found";
		}
		return message;
		
	}
	
	public String displayAll()
	{
		String out = "";
		for (int i =0; i<size; i++)
		{
			out += ""+lArr[i].getFullName()+" Term1: "+lArr[i].getTerm1()+" Term2: "+lArr[i].getTerm2()+" Term 3: "+lArr[i].getTerm3()+" Highest term is: "+lArr[i].getHighestTerm()+" H mark: "+lArr[i].getHighestMark()+"\n";
		}
		return out;
	}
	
	
	
}