package myDrawTraingle;

import javax.swing.JOptionPane;

public class DrawTriagngle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ManyStars = Integer.parseInt(JOptionPane.showInputDialog("How High U WANT"));
		char chara = JOptionPane.showInputDialog("CHARACHTER").charAt(0);
		String output = "";
		int spacesize =0;
		for (int loop1=ManyStars;loop1>=1;loop1--)
		{
			for (int spaces=1;spaces<=spacesize;spaces++)
			{
				output+="  ";
			}
			spacesize++;
			for (int loop2=1;loop2<=loop1;loop2++)
			{
				output+=chara;
			}
			output+="\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
		
		
		
		

	}

}
