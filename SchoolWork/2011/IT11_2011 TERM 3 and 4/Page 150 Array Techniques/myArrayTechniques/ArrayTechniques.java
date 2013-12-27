package myArrayTechniques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayTechniques {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Menu with choices
		//input into array

		//declare array and counter
		int [] arr = new int [50];
		int size =0 ;
		//input text files into array
		try {
			Scanner scFile = new Scanner(new File("numbers.txt"));
			while (scFile.hasNext())
			{
				arr[size]=scFile.nextInt();
				size++;
			}

			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//menu programming
		char choice;
		do{
			choice = JOptionPane.showInputDialog( "Choose from the following:\n" +
					"A: Display array\n" +
					"B: Insert new number\n" +
					"C: Delete a number\n" +
					"D: Search for a number\n" +
					"E: Removee duplicate\n" +
					"F: Sort array\n" +
			"X: exit").toUpperCase().charAt(0);

			switch (choice)
			{
			case 'A':
				//disp array
				String message ="";
				for (int i =0; i<size;i++)
				{
					message+= arr[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, message);

				break;
			case 'B':
				//insert new number
				int number = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to insert"));
				int position = Integer.parseInt(JOptionPane.showInputDialog("In which positionn do you want to insert the number"));
				//move all items in the array up
				//loop from end
				for( int i = size;i>=position-1;i--)
				{
					arr[i]=arr[i-1];
					//each value is one before so cant be before 0
				}
				arr[position-1]=number;
				size++;


				break;
			case 'C':
				//delete a number
				position = Integer.parseInt(JOptionPane.showInputDialog("In which positionn do you want to insert the number"));
				for (int i=position-1;i<size-1;i++)
				{
					arr[i]=arr[size+1];
				}
				size--;

				break;
			case 'D':
				//search for a number
				int search = Integer.parseInt(JOptionPane.showInputDialog("Which number are u looking for?"));
				int pos = -1;
				for (int i = 0; i<size;i++)
				{
						if (arr[i]==search)
						{
							pos = i+1;
						}
						if (pos == 0)
						{
							JOptionPane.showMessageDialog(null, search+" was not found");
						}
						else
						{
							JOptionPane.showMessageDialog(null, search+ "was found at position "+pos);
						}
				}
				break;
			case 'E':
				//remove duplicate
				//tempoary array and counter
				int[] arrTemp = new int[20];
				int temp = 0;
				//loop through array
				for (int i = 0; i<size;i++)
				{
					boolean duplicate = false;
					for (int j=i+1;j<size;j++)
					{
						//determine if there is a duplicate
						if (arr[i]==arr[j])
						{
						duplicate = true;
						}
					}
					//if there isn't a duplicate - keep the number
					if (duplicate ==false)
					{
						arrTemp[temp]=arr[i];
						temp++;
					}
				}
				//save the temporary over the original
				arr=arrTemp;
				size=temp;

				break;
			case 'F':
				//sort array ALWAYS ASKED
				for (int i=0;i<size;i++)
				{
					for (int j=i+1;j<size;j++)
					{
						if (arr[i]>arr[j])
						{
							//swap it
							int swap = arr[i];
							arr[i]=arr[j];
							arr[j]=swap;
						}
					}
				}

				break;
			case 'X':
				//exit
				JOptionPane.showMessageDialog(null, "BYE");

				break;
			default: JOptionPane.showMessageDialog(null, "Invalid");
				break;
			}}
			while (choice != 'X');

	}

}
