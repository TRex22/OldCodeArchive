package myXYZTrading;

import javax.swing.JOptionPane;

public class EmpAPP {
	private static EmpArray objEmp = new EmpArray();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char choice = ' ';
		
		while (choice != 'X')
		{
			choice = JOptionPane.showInputDialog("" +
					"1: Option 1 display payslips of all emplotess\n" +
					"2: Option 2 List on med aid\n" +
					"3: sort alphabetically\n" +
					"4: Display names acc month of birthday\n" +
					"X: Exit").toUpperCase().charAt(0);
			switch (choice)
			{
			case '1': System.out.println(objEmp.option1());
				break;
			case '2': System.out.println(objEmp.option2());
				break;
			case '3': System.out.println(objEmp.option3());
				break;
			case '4': System.out.println(objEmp.option4());
				break;
			case 'X': 
				break;
			default: System.err.println("INVALID");
				break;
			}
		}

	}

}
