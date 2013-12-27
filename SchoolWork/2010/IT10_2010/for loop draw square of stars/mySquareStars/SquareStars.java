package mySquareStars;

import javax.swing.JOptionPane;

public class SquareStars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String output = "";
		int row = Integer.parseInt(JOptionPane.showInputDialog("How many rows"));
		int column = Integer.parseInt(JOptionPane.showInputDialog("How Many columns"));
		char star = JOptionPane.showInputDialog("ENTER CHARACHTER").charAt(0);
		
		for (int i =1;i<=row;i++)
		{
			
			
			
			for (int j = 1; j<=column;j++)
			{
				
			output+="   "+star+"   ";	
				
				
				
				
				
			}
		output+="\n";
		
		
		
		
		}
		JOptionPane.showMessageDialog(null, output);
		
		
		
		
		
		
		

	}

}
