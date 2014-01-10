package myPerson;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instanciate an object of the person class
		//declare object and then use the word new and the constructor
		Person person = new Person();
		//use default constructor
		Person person1 = new Person();
		
		String name = JOptionPane.showInputDialog("Enter the person's name");
		String telnum = JOptionPane.showInputDialog("Enter "+name+"'s telephone number");
		
		person1.setName(name);
		person1.setTelnum(telnum);
		//Use parametarised constructor
		//No mutoators
		String name2 = JOptionPane.showInputDialog("Enter the person's name");
		String telnum2 = JOptionPane.showInputDialog("Enter "+name+"'s telephone number");
		
		Person person2 = new Person(name2, telnum2);
		//Display both
		JOptionPane.showMessageDialog(null, "Person1:\n"+person1.toString()+"\n\nPerson 2:\n"+person2.toString());
	}

}