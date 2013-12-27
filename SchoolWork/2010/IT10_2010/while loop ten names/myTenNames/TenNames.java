package myTenNames;

import javax.swing.JOptionPane;

public class TenNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare and initilize
		//counter starts at one
		int i=1;
		char answer = 'y';
		//Test - loop repeats
		//while the counter is yes
		//i.e goes up to ten
		while (answer=='Y')
		{
			// ask names
			String name = JOptionPane.showInputDialog("NAME: "+i);
			//Change - go up by one
			System.out.println(name);
			i++;
			//change = ask the user
			answer = JOptionPane.showInputDialog("Continue? y/n").toUpperCase().charAt(0);
		}
		
		
		
		
		
		
		

	}

}
