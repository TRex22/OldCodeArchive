package myLine;

import javax.swing.JOptionPane;

public class UseLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//exec class
		//extaciate

		//Object 1 eat
		//Instaciate an object of a class
		//ClassName ObjectName = new ClassName();
		Line eat = new Line();
		eat.pattern = '-';
		JOptionPane.showMessageDialog(null,
				"eat has a size of "+eat.size +
				" and has a pattern of: "+
				eat.pattern);

		//call drawLine method
		//void method ---- the call statement must be one a line of its own
		eat.drawLine();
		//call the makeLine method
		//typed method ---- the call statement must be be inside a statement that uses it
		JOptionPane.showMessageDialog(null, eat.makeLine());
		//Object 2 bug
		Line bug = new Line();
		bug.size = Integer.parseInt(JOptionPane.showInputDialog(
				"Enter the size of bug"));

		bug.pattern = JOptionPane.showInputDialog(
		"Enter the pattern of bug").charAt(0);
		JOptionPane.showMessageDialog(null,
				"bug has a size of "+bug.size +
				" and has a pattern of: "+
				bug.pattern);
		eat.framese = false;
		bug.framese = false;
		bug.framese = true ;
		bug.makeLine();



	}

}