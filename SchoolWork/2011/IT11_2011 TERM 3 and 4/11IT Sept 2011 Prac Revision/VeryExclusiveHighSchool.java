import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class VeryExclusiveHighSchool {

	/**
	 * @throws FileNotFoundException
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scFile = new Scanner(new File("VeryExclusive.txt"));
		System.out.println("Student Number \t Surname \t Initial \t Class \t Average Mark(%)");
		String message = "";

		while (scFile.hasNext())
		{
			Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
			try{
			int studentNO = scLine.nextInt();
			String Surname = scLine.next();
			String name = scLine.next();
			char initial = name.toUpperCase().charAt(0);
			String strClass = scLine.next();
			double avgMark = ((scLine.nextInt())+(scLine.nextInt())+(scLine.nextInt())+(scLine.nextInt())+(scLine.nextInt())+(scLine.nextInt()))/(6);
			System.out.println(""+studentNO+" \t\t "+Surname+" \t\t "+initial+" \t\t "+strClass+" \t\t "+avgMark);

			}catch (Exception e) {
				System.err.println("There is an error in the text file student no is no integer");
			}

			scLine.close();
		}


	scFile.close();
	}

}
