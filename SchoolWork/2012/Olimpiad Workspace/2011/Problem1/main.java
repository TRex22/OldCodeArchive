package Problem1;

import javax.swing.JOptionPane;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//square or rectangle
		//calc area
		String out = "";
		
		String dimensions = JOptionPane.showInputDialog("Enter length and breadth");
		
		String length = "";//+dimensions.charAt(0);
		String breadth = "";//+dimensions.substring(3,4);
		char toc = ' ';
		int pos = 0;
		while (toc != ',')
		{
			
		}
		
		//System.out.println("hello "+breadth);
		//a square has the same length and breadth while a rectangle does not
		
		if (length.equals(breadth))
		{
			out += "Square ";
		}
		else
		{
			out += "Rectangle ";
		}
		
		int area = (Integer.parseInt(length))*(Integer.parseInt(breadth));
		
		out += ""+area;
		
		JOptionPane.showMessageDialog(null, out);
		
	}

}
