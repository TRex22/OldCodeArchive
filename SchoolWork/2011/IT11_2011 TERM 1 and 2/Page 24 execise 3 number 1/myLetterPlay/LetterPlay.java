package myLetterPlay;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class LetterPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setSize(300,300);
		frame.setTitle("Sentences");
		frame.setVisible(true);
		String sentence = new String (JOptionPane.showInputDialog(""));
		txt.setText(sentence+"\n");
		int length = (sentence.length());
		//display first and last letter
		char first = sentence.charAt(0);
		char last = sentence.charAt(sentence.length()-1);
		txt.append( "first Letter: "+first+"\nLast Letter: "+last);
		//display sentence backwards
		String out="";
		for (int i =sentence.length()-1;i>=0;i--)
		{
			out+=sentence.charAt(i);
		}
		txt.append("\nBackwards: "+out);
		//display sentence diagonally
		out="";
		for (int i =0 ; i<sentence.length();i++)
		{

			for (int space = 1; space<=i;space++)
			{
				out+=" ";
			}
			out+=sentence.charAt(i)+"\n";

		}
		txt.append("\nDiagonally:\n"+out);
		//display the middle letter
		int middle = sentence.length()/2;
		if (sentence.length() % 2==0)
		{//even amount of letters
			txt.append("\nMiddle letters are: "+sentence.charAt(middle-1)+
					sentence.charAt(middle));
		}
		else
		{//odd amount of letters
			txt.append("\nThe Odd letter is "+sentence.charAt(middle));
		}
		//display all vowels
		out ="";
		for (int i=0;i<sentence.length();i++)
		{
			char letter=sentence.toUpperCase().charAt(i);
			if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
			{
				out+=letter+" ";
			}
			if(letter=='Y')
			{
				out+=letter+" (might be a vowel) ";
			}
		}
		txt.append("The Voels in the sentece are: ");
		//count the spaces
		int space = 0;
		for(int i = 0; i<sentence.length();i++)
		{
			char letter = sentence.charAt(i);
			if (Character.isWhitespace(letter))
			{
				space++;
			}
		}
	txt.append("There is "+space+" Spaces");
	}

}
