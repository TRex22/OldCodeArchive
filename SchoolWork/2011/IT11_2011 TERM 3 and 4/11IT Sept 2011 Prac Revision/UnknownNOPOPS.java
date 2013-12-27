import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UnknownNOPOPS {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scFile = new Scanner (new File("unknown.txt"));

		while(scFile.hasNext())
		{
			Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
			String name = scLine.next();
			String date = scLine.next();
			String surname = name.substring(name.indexOf(" ")+1,name.length());
			char initial = name.charAt(0);
			String DOB = "";
			String memNO = surname.substring(0,3)+date.substring(2,4)+date.charAt(5);
			DOB += ""+date.substring(date.length()-2, date.length());
			String temp = date.substring(date.length()-4,date.length()-2);
			int month = Integer.parseInt(temp);
			switch (month)
			{
			case 1: DOB += " January ";
			break;
			case 2: DOB += " February ";
			break;
			case 3: DOB += " March ";
			break;
			case 4: DOB += " April ";
			break;
			case 5: DOB += " May ";
			break;
			case 6: DOB += " June ";
			break;
			case 7: DOB += " July ";
			break;
			case 8: DOB += " August ";
			break;
			case 9: DOB += " September ";
			break;
			case 10: DOB += " October ";
			break;
			case 11: DOB += " November ";
			break;
			case 12: DOB += " December ";
			break;
			default: System.err.println("ERROR NO MONTH DONE PROPERLY IN CHINESE ENGLISH");
			break;
			}
			DOB += date.substring(0,4);
			System.out.println(""+surname+" "+initial+"\t"+memNO+"\t"+DOB);
		}





	}

}
