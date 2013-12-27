package myThreeLetterWords;

import javax.swing.JOptionPane;

public class ThreeLetterWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0 ;
		String word = JOptionPane.showInputDialog("Enter a Three letter word");
		String out = "";
		while (i<5)
		{
			if (word.length()==3)
			{
				i++;
				out+=i+") "+word+"\n";
			}
			word = JOptionPane.showInputDialog("Enter a Three letter word");
		}

		JOptionPane.showMessageDialog(null, out);

	}

}
