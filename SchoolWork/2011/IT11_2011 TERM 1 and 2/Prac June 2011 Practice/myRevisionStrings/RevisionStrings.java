package myRevisionStrings;

import javax.swing.JOptionPane;

public class RevisionStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Enetr a darn sentence");
		char menu = ' ';


		do{
			menu = JOptionPane.showInputDialog( "1)First Letter capital letter \n2) First letter capital letters, other small letters\n3)Count the words\4)Count letters\n5)Count digits\n6)remove Digits\n7) Count a letter\n8)Backwards\n0) exit").toUpperCase().charAt(0);
			if (menu == '1')
		{
			String temp = "";
			char caps = sentence.toUpperCase().charAt(0);
			temp = caps+sentence.substring(1);
			JOptionPane.showMessageDialog(null, temp);



		}
		else if (menu == '2')
		{
			String temp = "";
			char caps = sentence.toUpperCase().charAt(0);
			temp = caps+sentence.toLowerCase().substring(1);
			JOptionPane.showMessageDialog(null, temp);

		}
		else if (menu == '3')
		{
			int noWords = 1;
			for (int i =0 ;i<sentence.length();i++)
			{
				char temp = sentence.charAt(i);
				if (Character.isWhitespace(temp))
				{
					noWords += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "There is "+noWords+" words");
		}
		else if (menu == '4')
		{
			int noLetters = 0;
			for (int i =0 ;i<sentence.length();i++)
			{
				char temp = sentence.charAt(i);
				if (Character.isLetter(temp))
				{
					noLetters += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "There is "+noLetters+" letters");

		}
		else if (menu == '5')
		{
			int noDigits = 0;
			for (int i =0 ;i<sentence.length();i++)
			{
				char temp = sentence.charAt(i);
				if (Character.isDigit(temp))
				{
					noDigits += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "There is "+noDigits+" letters");


		}
		else if (menu == '6')
		{
			String temp = "";
			for (int i =0 ;i<sentence.length();i++)
			{
				char temp1 = sentence.charAt(i);
				if (!Character.isDigit(temp1))
				{
					temp += temp1;
				}
			}
			JOptionPane.showMessageDialog(null, temp);

		}
		else if (menu == '7')
		{
			char letter = JOptionPane.showInputDialog("Enter letter").toUpperCase().charAt(0);
			int noLetter = 0;
			for (int i =0 ;i<sentence.length();i++)
			{
				char temp = sentence.toUpperCase().charAt(i);
				if (temp == letter)
				{
					noLetter += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "There is "+noLetter+" letters");


		}
		else if (menu == '8')
		{
			String backwards = "";
			for (int i = 0; i<sentence.length();i++ )
			{
				char temp = sentence.charAt((sentence.length()-1)-i);
				backwards += temp;
			}
			JOptionPane.showMessageDialog(null, "The sentence backwards is: "+backwards);
		}


		}while(menu != '0');




	}

}
