import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ClientsInfo {
	public static void main (String [] args){
		try {
			String message = "Client name      Meals      Paid/account\n";
			Scanner scFile = new Scanner (new File("ClientsInfo.txt"));

			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				message += ""+scLine.next()+"      "+scLine.next()+"      "+scLine.next()+"\n";



			}

			JOptionPane.showMessageDialog(null, message);
			scFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
