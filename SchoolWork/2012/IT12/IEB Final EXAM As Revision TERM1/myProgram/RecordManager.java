package myProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RecordManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RaceResult raceResult;
		try {
			Scanner scFile = new Scanner (new File("ResultData.txt"));
			String out = "";
			int amountOR = 0;
			int amountWR = 0;
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				
				String athlete = scLine.next();
				String country = scLine.next();
				int position = Integer.parseInt(scLine.next());
				String record = scLine.next();
				String raceTime = scLine.next();
				
							
				
				if (record.equals("OLR"))
				{
					amountOR ++;
					raceResult = new OlympicRecord (athlete,country, position, raceTime);
					out += ""+raceResult.toString()+"\n";
				}
				else if (record.equals("WRC"))
				{
					amountWR ++;
					raceResult = new WorldRecord (athlete,country, position, raceTime);
					out += ""+raceResult.toString()+"\n";
				}
				else if (record.equals("---"))
				{
					raceResult = new RaceResult (athlete,country, position, raceTime);
					out += ""+raceResult.toString()+"\n";
				}
				else
				{
					out += "INVALID ENTRY\n";
				}
				
				
			}
			System.out.println(out);
			JOptionPane.showMessageDialog(null, "Number of World Records: "+amountWR+"\nNumber of Olympic Records: "+amountOR);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
