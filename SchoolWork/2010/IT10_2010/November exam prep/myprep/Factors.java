package myprep;

import javax.swing.JOptionPane;

public class Factors {

	/**
	 * Print menu
	 * 			MENU
	 * 	1.	print factors
	 * 	2. 	print pattern
	 * 	3. 	exit
	 * Menu is a loop and after each option it must repeat until 3 is pressed
	 * if 1 is selected
	 * 	ask user for a number
	 * 	determine its factors
	 * 	print factors "The factors of variable are:..."
	 * 
	 * if option 2 
	 * 	print pattern with nested loops
	 * 1
	 * 22
	 * 333
	 * 22
	 * 1
	 */
	public static void main(String[] args) {

		int menu = 0;

		do
		{
			menu = Integer.parseInt(JOptionPane.showInputDialog( "			Menu			"+"\n" +
					"1. 	Print Factors\n" +
					"2.		Print Pattern\n" +
					"3.		Exit" ));

		if (menu == 1)
		{
			String output = "";
			int fact = Integer.parseInt(JOptionPane.showInputDialog( "Enter An integer" ));
			int count=0;
			for (int i=0; i<= fact;i++)
			{
				count++;
				if ((fact%count)==0)
				{
					output+=" "+count;
				}
			}
		JOptionPane.showMessageDialog(null, "The Factors Of "+fact+" are: "+output );
		}

		if (menu == 2)
		{
			String output = "";
			int number = 1;
			int i = 0;
			int h =0;
			for (int j =0; j<2;j++)
			{
				number = 1;
				output+=number+"\n";
				while (i<2)
				{
					i++;
					number =2;
					output+=number+""+number+"\n";
					while (h<1)
					{
						h++;
						number =3;
						output+=number+""+number+""+number+"\n";
					}
				}
			}
			JOptionPane.showMessageDialog(null, output );
		}
		
		}
		while (menu != 3);

	}

}
