package myEmployee;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee PayCalc = new Employee();
		String name = JOptionPane.showInputDialog("Enter Name");
		PayCalc.sethWork(Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of hours worked")));
		PayCalc.sethSalary(Integer.parseInt(JOptionPane.showInputDialog("Enter the hourly salary")));
		double month =PayCalc.calcPay( Integer.parseInt(JOptionPane.showInputDialog("Enter the expected number of hours worked")));
		JOptionPane.showMessageDialog(null, ""+name+" is to be paid R"+month);



	}

}