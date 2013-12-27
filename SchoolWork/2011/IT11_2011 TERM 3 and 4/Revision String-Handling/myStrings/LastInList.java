package myStrings;

import javax.swing.JOptionPane;

public class LastInList {

	/**
	 * Input an unknown quantity of first names, ending the input when the String
	 * "@@@" is typed in.
	 * Leave a blank line and then display
	 * The name which is alphabetically last (Ignore Case)
	 */
	public static void main(String[] args) {

		//counter
		int count =0;
		String last ="";
		String name = JOptionPane.showInputDialog("Enter name Type @@@ to end");

		while (!name.equalsIgnoreCase("@@@"))
		{
			count++;
			if (name.compareToIgnoreCase(last)>0)
			{
				last = name;
			}
			name = JOptionPane.showInputDialog("Enter name Type @@@ to end");
		}
		JOptionPane.showMessageDialog(null, "There were: "+count+" names and "+last+" was alphabetically last");

	}

}
