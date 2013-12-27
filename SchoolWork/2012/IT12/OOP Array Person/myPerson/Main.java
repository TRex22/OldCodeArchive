package myPerson;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Interface with the user
		//It calls the array class
		
		ManyPersons obj = new ManyPersons();
		System.out.println(obj.toString());
		obj.sortName();
		System.out.println("SORTED LIST:\n"+obj.toString());
		String name = JOptionPane.showInputDialog("enter a name to search");
		JOptionPane.showMessageDialog(null, obj.search(name));
				

	}

}
