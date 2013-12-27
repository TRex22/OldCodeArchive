package myArithmetic;

import javax.swing.JOptionPane;

public class UseArithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ClassName ObjectName = new Constructor
		Arithmetic calc = new Arithmetic();
		// input
		int num1 = Integer.parseInt
		(JOptionPane.showInputDialog
				("Enter the first number"));
		double num2 = Double.parseDouble
		(JOptionPane.showInputDialog
				("Enter the second number"));
		//send the numbers into arithmatic class
		//use the setters
		//the methods are void statements are called as a line on its own
		calc.setNum1(num1);
		calc.setNum2(num2);
		//OUTPUT


		JOptionPane.showMessageDialog(null, calc );

		//second object

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number for object 2: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number for object 2: "));

		Arithmetic calc2 = new Arithmetic(n1,n2);
		JOptionPane.showMessageDialog(null, calc2);



	}

}
