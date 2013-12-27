package myPartOfString;

import javax.swing.JOptionPane;

public class PartOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String word = JOptionPane.showInputDialog("Enter word Inebrate IDIOT");
	//display the first 4 letters
	//way I = to use seperate charAt for each
	if (word.length() >= 4)
	{

	JOptionPane.showMessageDialog(null,
			""+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3));
	//way 2 = use a loop

	String out = "";
	for (int i = 0; i<=3; i++)
	{
		out+=" "+word.charAt(i);
	}
	JOptionPane.showMessageDialog(null, out);

	//way 3 = use substring
	JOptionPane.showMessageDialog(null, word.substring(0, 4));
	}
	else
	{
		JOptionPane.showMessageDialog(null, "The Word does not have 4 letters");

	}
}
}
