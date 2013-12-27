package myletters;

import javax.swing.*;


public class letters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String sentence = JOptionPane.showInputDialog("ENTER");
		
		int max = sentence.length();
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setSize(500,500);
		String output = "";
		for (int i = 0;i<max;i++)
		{
			char letter = sentence.charAt(i);
			letter++;
			output+=letter;//+"\n";
		}
		
		frame.setVisible(true);
		txt.setText(output);
		
		
		
		
		
		

	}

}
