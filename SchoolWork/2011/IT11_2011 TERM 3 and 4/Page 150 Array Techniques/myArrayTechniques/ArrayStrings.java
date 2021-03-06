package myArrayTechniques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Menu with choices
		//input into array

		//declare array and counter
		String [] arr = new String [50];
		int size =0 ;
		//input text files into array
		try {
			Scanner scFile = new Scanner(new File("words.txt"));
			while (scFile.hasNext())
			{
				arr[size]=scFile.next();
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
					"B: sort words\n" +
					"C: insert a word\n" +
					"D: delete a word\n" +
					"E: Removee duplicate\n" +
					"F: search\n" +
			"X: exit").toUpperCase().charAt(0);

			switch (choice)
			{
			case 'A':
				//disp array
				String message ="Unsorted list:\n";
				for (int i =0; i<size;i++)
				{
					message+= arr[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, message);

				break;
			case 'B':
				//insert new number
			//	String word = JOptionPane.showInputDialog("What word do you want to insert");
			//	int position = Integer.parseInt(JOptionPane.showInputDialog("In which positionn do you want to insert the word"));
				//move all items in the array up
				//loop from end
			//	for( int i = size;i>=position-1;i--)
			//	{
			//		arr[i]=arr[i-1];
					//each value is one before so cant be before 0
			//	}
			//	arr[position-1]=word;
			//	size++;

				//Sort ascending order
				for (int i = 0 ; i<size;i++)
				{
					for (int j = i+1 ; j<size;j++)//starts after i
					{
						if (arr[i].compareToIgnoreCase(arr[j])>0)
						{
							//swap it
							String swap = arr[i];
							arr[i]=arr[j];
							arr[j]=swap;
						}
					}
				}

				break;
			case 'C':
				//delete a number
			//	position = Integer.parseInt(JOptionPane.showInputDialog("In which positionn do you want to insert the number"));
			//	for (int i=position-1;i<size-1;i++)
			//	{
			//		arr[i]=arr[size+1];
			//	}
			//	size--;

				//Insert
				String word = JOptionPane.showInputDialog("Enter Word you want to insert");
				int position  = Integer.parseInt(JOptionPane.showInputDialog("Enter the position"));

				for (int i = size;i>=position-1;i--)
					//start at end, stop at real position
					//move all array elements up
				{
					arr[i]=arr[i-1];
					//the minus 1 means that thbne point i-1 is m ove to i
					//the error at position 1 ie real pos 0 will give error dont need to fix for exams.
				}
				arr[position-1]=word;
				size++;
				String message1 ="Changed List:\n";
				for (int i =0; i<size;i++)
				{
					message1+= arr[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, message1);


				break;
			case 'D':
				//search for a number
			//	String search = (JOptionPane.showInputDialog("Which word are u looking for?"));
			//	int pos = -1;
			//	for (int i = 0; i<size;i++)
			//	{
			//			if (arr[i].equals(search))
			//			{
			//				pos = i+1;
			//			}
			//			if (pos == 0)
			//			{
			//				JOptionPane.showMessageDialog(null, search+" was not found");
			//			}
			//			else
			//			{
			//				JOptionPane.showMessageDialog(null, search+ "was found at position "+pos);
			//			}
			//	}

				//Delete
				position = Integer.parseInt(JOptionPane.showInputDialog("In which positionn do you want to insert the number"));
				for (int i = position-1;i<size-1;i--)//size -1 bec second last one is moved over
				{
					arr[i]=arr[i+1];
				}
				size--;

				break;
			case 'E':
				//remove duplicate
				//tempoary array and counter
				String[] arrTemp = new String[20];
				int temp = 0;
				//loop through array
				for (int i = 0; i<size;i++)
				{
					boolean duplicate = false;
					for (int j=i+1;j<size;j++)
					{
						//determine if there is a duplicate
						if (arr[i].equalsIgnoreCase

								(arr[j]))
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
			//	for (int i=0;i<size;i++)
			//	{
			//		for (int j=i+1;j<size;j++)
				//	{
				//		if (arr[i].compareTo(arr[j])>0)
				//		{
							//swap it
				//			String swap = arr[i];
				//			arr[i]=arr[j];
				//			arr[j]=swap;
				//		}
				//	}
				//}


				//search
				word = JOptionPane.showInputDialog("Enter word to find");
				String message3 = "";
				for (int i = 0; i < size; i++)
				{
					if (arr[i].equalsIgnoreCase(word))
					{
						message3 += word+" is found at position "+(i+1)+" in the array\n";
					}
				}
				JOptionPane.showMessageDialog(null, message3);
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
