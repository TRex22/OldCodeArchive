package myTriangle;

import javax.swing.JOptionPane;

public class Triangle {



	//can have fields
	private static int height;
	//no constructor
	//have other methods

	public static void message ()
	{
		JOptionPane.showMessageDialog(null, "LUKE, I AM YOUR...");
	}

	public static void setHeight(int h)
	{
		height = h;

	}
	public static double Area()
	{
		//equilateral
		return 1.000000000000000000/2 * height * height;
	}









}
