package mySquare;

import javax.swing.JOptionPane;

public class MainSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width = (int) (Math.random()*80+1);
		//instanciate an object
		//Square square = new Square (width);
		//disp
		
		//add more
		char ans = JOptionPane.showInputDialog("Is it a S=Square or a R+rectangle").toUpperCase().charAt(0);
		//inst and object based on weather it is a square or rectprisim
		//1) declare object
		//no instanciate
		Square square;
		if (ans =='S')
		{
			//inst it using the square constructor
			square = new Square (width);
			//disp
			JOptionPane.showMessageDialog(null, square);
			
		}
		else if (ans=='R')
		{
			//get depth
			int depth = (int)(Math.random()*80+1);
			//inst
			square = new Cube(width,depth);
			JOptionPane.showMessageDialog(null, square);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "ERORORORORRORORORORORORO");
		}
		//System.out.println(square);
		
	

	}

}
