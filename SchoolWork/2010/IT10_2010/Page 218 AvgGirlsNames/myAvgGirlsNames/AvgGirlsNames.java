package myAvgGirlsNames;

import javax.swing.JOptionPane;

public class AvgGirlsNames {

	/**
	 *
	 */
	public static void main(String[] args) {
		int length = 0;
		int no = 0;
		String input = "";
		char end;

		do
		{
			input = JOptionPane.showInputDialog("Enter girls names or * to exit");
			end = input.charAt(0);
			no++;
			length += input.length();
		}
		while(end != '*');

		double average = (int)Math.round(length/no);
		JOptionPane.showMessageDialog(null, "The average length of these so called girls is: "+average);




	}

}
