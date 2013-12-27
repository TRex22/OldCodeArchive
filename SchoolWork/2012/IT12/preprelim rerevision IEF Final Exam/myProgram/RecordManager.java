package myProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecordManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RaceResult Result;
		try {
			Scanner scFile = new Scanner (new File("ResultData.txt"));
			int NoOLC = 0;
			int NoWRC = 0;
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				String athlete = scLine.next();
				String country = scLine.next();
				int position = Integer.parseInt(scLine.next());
				String rec = scLine.next();
				String raceTime = scLine.next();
				
				if (rec.equals("OLC"))
				{
					Result = new OlympicRecord (athlete, country, position, raceTime);
					System.out.println(Result.toString());
				}
				else if (rec.equals("WRC"))
				{
					Result = new WorldRecord (athlete, country, position, raceTime);
					System.out.println(Result.toString());
				}
				else if (rec.equals("---"))
				{
					Result = new RaceResult (athlete, country, position, raceTime);
					System.out.println(Result.toString());
				}
				else
				{
					System.out.println("INVALID RECORD");
				}
				
				
				scLine.close();
			}
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
