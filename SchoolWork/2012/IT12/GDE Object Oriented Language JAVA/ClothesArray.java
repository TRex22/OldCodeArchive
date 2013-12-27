import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClothesArray {
	
	private  Clothes arr[]=new Clothes[20];
	private int size =0 ;
	
	public ClothesArray ()
	{
		Scanner scFile;
		try {
			scFile = new Scanner(new File ("Clothes.txt"));
			//int counter = 0;
			while(scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				String colour = scLine.next();
				String descr = scLine.next();
				int rating = scLine.nextInt();
				arr[size]= new Clothes (colour, descr, rating);
				size ++;
				scLine.close();
			}
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
