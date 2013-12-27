package myEss;

import javax.swing.JOptionPane;

public class Ess {

	/**
	 * Allow user to type in words until they type in "last"
	 * Display each word
	 * and state wheather it conatains an "s"
	 * and state in which position the "s" is in the word
	 */
	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog("Enter a word");
		while (!word.equalsIgnoreCase("last"))//T
		{
			String message = word+"\n";
			int pos = word.toLowerCase().indexOf('s')+1;
			if(pos >=0)
			{
				message+=" Contains 'S' at position: "+(pos+1);
			}
			else
			{
				message+=" Does not containing of any 's";
			}
			JOptionPane.showMessageDialog(null, message);


			//C
			word= JOptionPane.showInputDialog("Enter Word Homie");
		}





	}

}
