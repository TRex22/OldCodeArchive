package mySwapLetters;

import java.lang.Character.Subset;

import javax.swing.JOptionPane;

public class SwapLetters {

	/**
	 * code a program to enter two words
	 * and then print word1 with the first letter of word2
	 * and vice versa, e.g.
	 * train and box becomes brain and tox
	 */
	public static void main(String[] args) {
		String word1 = JOptionPane.showInputDialog("ENter WORd 1");
		String word2 = JOptionPane.showInputDialog("ENter WORd 2");
		String newWord1 = word2.substring(0,0)+word1.substring(1);
		String newWord2 = word1.substring(0,0)+word2.substring(1);
		JOptionPane.showMessageDialog(null, ""+word1+" and "+word2+" becomes "+newWord1+" and "+newWord2);

	}

}
