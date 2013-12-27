package myFF;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MealArr {
	private Meal arrMeals[] = new Meal[100];
	private int size;
	
	public MealArr()
	{
		try {
			Scanner scFile = new Scanner(new File("Meals.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				arrMeals[size]= new Meal(scLine.next(), scLine.next(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt());
				size++;
				scLine.close();
			}
			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error File Not Found");
			e.printStackTrace();
		}
	}
	public String testClass ()
	{
		return ""+arrMeals[0].calculatePoints();
	}
	public String optionA (String day)
	{
		day = day.toUpperCase().charAt(0)+day.substring(1);
		//JOptionPane.showMessageDialog(null, "Day: "+day);
		String out = "Information on Meals for Sun\n\nDay\tFats\tProteins\tCarbs\tPoints\tMeal\n";
		int sum = 0;
		for (int i = 0 ; i<size; i++)
			//for (int j = i+1; j <size ; j++)
			{
				if (arrMeals[i].getDay().contains(day)) //arrMeals[i].containsIgnoreCase("fggf");
				{
					out += arrMeals[i].toString()+"\n";
					sum+=arrMeals[i].calculatePoints();
				}
			}
		out += "The total number of points is: "+sum+"\n";
		if (sum <= 50)
		{
			out += "Within Limit";
		}
		else 
		{
			out += "Limit Exceeded";
		}
		return out;
	}
	public String OptionB ()
	{
		String out = "Information on Meals with No Fats\n\nDay\tFats\tProteins\tCarbs\tPoints\tMeal\n";
		for (int i = 0 ; i<size; i++)
			//for (int j = i+1; j <size ; j++)
			{
				if (arrMeals[i].getNoFats()==0)
				{
					out += arrMeals[i].toString()+"\n";
					
				}
			}
		
		return out;
	}
	public String OptionC()
	{
		String out = "";
		int HMealp = 0;
		int HSize = 0;
		int LMealp = 0;
		int LSize =0 ;
		
		for (int i = 0 ; i<size-1; i++)
			for (int j = i+1; j<size; j++)
			//for (int j = i+1; j <size ; j++)
			{
				if (arrMeals[i].calculatePoints()>HMealp)
				{
					HMealp = arrMeals[i].calculatePoints();
					HSize = i;
				}
				if (arrMeals[i].calculatePoints()<LMealp)
				{
					LMealp = arrMeals[i].calculatePoints();
					LSize = i;
				}
			}
		out += "Information for The Meal with The Highest No Points:\n\nDay\tFats\tProteins\tCarbs\tPoints\tMeal\n"+
			""+arrMeals[HSize].toString()+"\n";
		out += "Inforamtion for The Meal With The Lowest No Points:\n\nDay\tFats\tProteins\tCarbs\tPoints\tMeal\n"+arrMeals[LSize].toString()+"\n";
		
		return out;
	}
	public String toString()
	{
		String out = "";
		for (int i =0; i<size;i++)
		{
			out += arrMeals[i].toString()+"\n";
		}
		
		return out;
	}
	
}
