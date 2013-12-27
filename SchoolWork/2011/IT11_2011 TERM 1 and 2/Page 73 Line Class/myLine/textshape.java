package myLine;

import javax.swing.JOptionPane;

public class textshape {

	/**
	 *
	 */
	public static void main(String[] args) {
		// redone
		//instanciate an object of the line class
		//Line shape = new Line (5, '&');
		//JOptionPane.showMessageDialog(null, shape.makeLine());

		//new code
		//Instanciate an object of the Line Class
		//1 - declare the variable objLine that is of type Line
		//2 - call the constructor
		Line objLine = new Line();
		//input
		int size = Integer.parseInt(
				JOptionPane.showInputDialog( "Enter The Size of the line" ));
		//send the size to line class
		objLine.setSize(size);
		//input the pattern
		char pattern = JOptionPane.showInputDialog(
		"Enter the Pattern of the line").charAt(0);
		//send the pattern to the Line Class
		objLine.setpattern(pattern);
		int option = 0;
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog(
					"Choose from the Following: \n" +
					"1: Draw a single line\n" +
			"2: Draw a double line\n" +
			"3: Draw a square\n" +
			"4: Draw A Rectangle"));
			switch(option)
			{
			case 1: JOptionPane.showMessageDialog(null, objLine.makeLine());
			break;
			case 2: JOptionPane.showMessageDialog(null, objLine.doubleLine());
			break;
			case 3: JOptionPane.showMessageDialog(null, objLine.square());
			break;
			case 4:
				int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the Height"));
				JOptionPane.showMessageDialog(null, objLine.rectangle(height));
			case 0:
			break;
			default : JOptionPane.showMessageDialog(null, "Invalid Choice IDIOT");
			}
		}
		while(option !=0);






	}

}
