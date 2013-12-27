package myTriangle;

import javax.swing.JOptionPane;

public class UseTriangle {

	/**
	 * @param args
	 */
	private static int height;
	public static void main(String[] args) {

		//no instaciating of an object

		Triangle.message();
		Triangle.setHeight(5);
		JOptionPane.showMessageDialog(null, Triangle.Area());
		halveHeight();
	}
	private static void halveHeight()
	{
		height = height/2;
	}











}
