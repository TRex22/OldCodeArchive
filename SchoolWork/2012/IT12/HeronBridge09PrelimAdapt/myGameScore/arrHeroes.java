package myGameScore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arrHeroes {
	private Hero arrHeroes[] = new Hero[50];
	private int counter ;
	
	public arrHeroes ()
	{
		try {
			Scanner scFile = new Scanner (new File("Hero.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				arrHeroes[counter] = new Hero (scLine.next(), scLine.nextInt(), scLine.nextInt(),scLine.next(), scLine.nextInt());
				counter ++;
				
				scLine.close();
			}
			
			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void addHero(String n, int h, int d, String t)
	{
		counter ++;
		arrHeroes[counter]= new Hero (n, h, d, t, 0);
	}
	public String toString()
	{
		String out = "Player Statistics:\n" +
				"Name\tHealth\tDamage\tType\t\tscore\n";
		
		for (int i = 0 ; i<counter;i++)
		{
			out += arrHeroes[i].toString()+"\n";
		}
		
		return out;
	}
	public String getHigherThanScore(int s)
	{
		String out = "";
		for (int i = 0; i <counter;i++)
		{
			if (s<arrHeroes[i].getScore())
			{
				out += ""+arrHeroes[i].getName()+" "+arrHeroes[i].getScore()+"\n";
			}
		}
		return out;
	}
	public String getTotalHeroes()
	{
		String out = "";
		for (int i = 0; i<counter; i++)
		{
			if (arrHeroes[i].getDamage()>0)
			{
				out += ""+arrHeroes[i].getName()+" "+arrHeroes[i].getType()+"\n";
			}
		}
		
		return out;
	}
	public int getTotalDamage ()
	{
		int totd = 0;
		
		for (int i = 0 ; i<counter;i++)
		{
			totd += arrHeroes[i].getDamage();
		}
		
		return totd;
	}
	public int getTotalHealth ()
	{
		int toth = 0;
		for (int i = 0 ; i<counter;i++)
		{
			toth += arrHeroes[i].getHealth();
		}
		
		return toth;
	}
	public String getAllPartyNames ()
	{
		String out = "";
		for (int i = 0 ; i<counter;i++)
		{
			out += arrHeroes[i].getPartyName()+"\n";
		}
		return out;
	}
	public String changeScore(String n, int cscore)
	{
		String out = "Player "+n+" was not found.";
		for (int i = 0; i<counter;i++)
		{
			if (arrHeroes[i].getName().equalsIgnoreCase(n))
			{
				arrHeroes[i].setScore(cscore);
				out = "Found "+n+" and changed score";
			}
			
		}
		
		
		return out;
	}
	
	
}
