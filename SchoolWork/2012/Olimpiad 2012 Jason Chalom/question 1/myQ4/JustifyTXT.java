package myQ4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JustifyTXT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//input
		
		int width = Integer.parseInt(JOptionPane.showInputDialog("Width?"));
		String text = "A great discovery solves a great problem but there is a grain of discovery in the solution of any problem";
		
		//Take pos of text to be width for first line
		//count white space
		//each word must have a space on both sides except the first word ie from wht spc 1
		//at end of line remove white space start new line and continue to the end of the text
		
		//convert text to array?
		//perhaps, and then take each line as a part in the array
		//there are 20 words in the text and so an array of 50 will make sure nothing goes wrong
		
		String arrTxt[] = new String [50];
		Scanner scText = new Scanner (text).useDelimiter(" ");;
		
		arrTxt[0] = ""+text.charAt(0);
		int count = 0;
		while (scText.hasNext())
		{
			Scanner scLine = new Scanner (scText.next());
			//String temp = scText.next();
			
			//while (count <= 20)
			//{
				String temp = scLine.next();
				if (arrTxt[count].length()<20)
				{
					arrTxt[count]+=temp;
				}
				else
				{
					count ++;
					arrTxt[count]+=temp;
				}
			//}
				scLine.close();
		}
		
		scText.close();
		
		for (int i = 0; i<=count; i++)
		{
			System.out.println(""+arrTxt[i]+"\n");
		}
		
		
		
		

	}

}
