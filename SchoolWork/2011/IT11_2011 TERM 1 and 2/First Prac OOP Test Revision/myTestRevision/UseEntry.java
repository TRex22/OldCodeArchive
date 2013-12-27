package myTestRevision;

import javax.swing.JOptionPane;

public class UseEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entry objE = new Entry ();
		objE.setName(JOptionPane.showInputDialog("Enter Name"));
		objE.setAge(JOptionPane.showInputDialog("Enter Age"));
		objE.setAccount(JOptionPane.showInputDialog("Enter Account type"));
		double price =objE.calcCost(Double.parseDouble(JOptionPane.showInputDialog("Enter Price")));
		System.out.println("Name: "+objE.getName()+"\nAge: "+objE.getAge()+"\nNew Price: R"+price);
	}

}
