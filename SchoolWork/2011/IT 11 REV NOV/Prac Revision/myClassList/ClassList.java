package myClassList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String message = "Admission Number|||Name||||||Monthly School Fees\n";
		try {
			Scanner scFile = new Scanner(new File("students.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				String surname = scLine.next();
				String names = scLine.next();
				int grade = Integer.parseInt(scLine.next());
				String extra = scLine.next();

				String adminNo = surname.substring(0,3)+""+grade+""+names.substring(names.length()-2);

				double schoolfees = 0.00;
				if (grade ==12)
				{

					if(extra.equals("music"))
					{
						schoolfees = 4500.00;
					}
					else
					{
						schoolfees = 4000.00;
					}
				}
				else if (grade ==10 ||grade ==11)
				{
					if(extra.equals("music"))
					{
						schoolfees = 3300.00;
					}
					else
					{
						schoolfees = 3000.00;
					}
				}
				else if (grade ==8 || grade == 9)
				{
					if(extra.equals("music"))
					{
						schoolfees = 2750.00;
					}
					else
					{
						schoolfees = 2500.00;
					}
				}
				else
				{
					System.err.println("error wrong grade");
					schoolfees = 0.00;
				}
				String initials = "";
				if (names.contains(" "))
				{
				try {
				Scanner scIni = new Scanner(names).useDelimiter(" ");
				initials = ""+scIni.next().charAt(0)+". "+scIni.next().charAt(0)+". ";
				scIni.close();
				}catch(Exception e )
				{
					System.err.println("Error");
				}
				}
				else
				{
					initials = ""+names.charAt(0)+". ";
				}
				message += adminNo+"       "+surname+", "+initials+"       "+schoolfees+"\n";
				scLine.close();
			}





			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, message);

	}

}
