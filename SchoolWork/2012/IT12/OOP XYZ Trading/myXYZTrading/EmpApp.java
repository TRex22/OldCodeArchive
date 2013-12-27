package myXYZTrading;

import javax.swing.JOptionPane;

public class EmpApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstname = JOptionPane.showInputDialog("Enter f name");
		String surname = JOptionPane.showInputDialog("Enter s name");
		String dob = JOptionPane.showInputDialog("Enter date of birth");
		int dependant = Integer.parseInt(JOptionPane.showInputDialog("Enater amount dependents"));
		char meAid = JOptionPane.showInputDialog("Are u a member of medaid <Y/N>").toUpperCase().charAt(0);
		Employee emp = new Employee(firstname, surname, dob, 100000, dependant, meAid);
		int choice = 0;
		do{
			choice = Integer.parseInt(JOptionPane.showInputDialog("Choose from the following:"+
		"\n1. disp the pay slip"+"\n2. change the annual salary"+"\n3. change the number of dependents"+"\n4. Disp name and annual salary\n"+"\n0. STOP"));
			
		switch (choice)
		{
		case 1:
			JOptionPane.showMessageDialog(null, emp.displayPaySlip());
			break;
		case 2: 
			double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter annual salary"));
			emp.setSalary(salary);
			break;
		case 3:
			dependant = Integer.parseInt("enter no dep");
			emp.setDependent(dependant);
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "DISPLY");
			break;
		case 0: break;
		default: break;
		
		}while (choice!=0);
		}
		
		

	}

}
