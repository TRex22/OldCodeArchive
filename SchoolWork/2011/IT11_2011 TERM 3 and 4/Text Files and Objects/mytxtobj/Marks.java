package mytxtobj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			//heading
			System.out.println("Name\tSurname\tEng\tAfri\tMath\tAverage\n");
			//scan text file

			Scanner scFile = new Scanner(new File("Marks.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
				String name = scLine.next();
				String surname = scLine.next();
				int eng = scLine.nextInt();
				int afri = scLine.nextInt();
				int math = scLine.nextInt();
			//	Pupil objPupil = new Pupil();
			//	objPupil.setAfri(afri);
			//	objPupil.setEng(eng);
			//	objPupil.setMath(math);
			//	objPupil.setName(name);
			//	objPupil.setSurname(surname);
				Pupil objPupil = new Pupil (name, surname, eng, afri, math);




				scLine.close();
			}



			scFile.close();
		}catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "HAHAHAHAHAHAHA NO TXT FILE");

		}



	}

}
