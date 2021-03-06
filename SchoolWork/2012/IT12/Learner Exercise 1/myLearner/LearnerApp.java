package myLearner;

import javax.swing.JOptionPane;

public class LearnerApp {
	//fields
	public char choice = ' ';
	private LearnerArray objLearner = new LearnerArray();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LearnerApp();

	}
	public LearnerApp(){
		menu();
	}
	private void menu() {
		while (choice != 'X')
		{
			choice = JOptionPane.showInputDialog(
					"Enter an option to continue or X to exit\n" +
					"A: Display Average\n" +
					"B: Display Highest Term and Mark for L\n" +
					"C: Sort by Average\n" +
					"D: Sort by Surname\n"+
					"E: Search for a first name\n" +
					"F: Display All Information").toUpperCase().charAt(0);
			switch (choice)
			{
			case 'A' : System.out.println(objLearner.displayAve());
				break;
			case 'B' : System.out.println(objLearner.displayHighest());
				break;
			case 'C' : objLearner.sortAve();
						System.out.println("IT IS SORTED BY AVE");
				break;
			case 'D' : objLearner.sortName();
			System.out.println("IT IS SORTED BY Name");
				break;
			case 'E' : String name = JOptionPane.showInputDialog("Enter name to look for");
						System.out.println(objLearner.search(name));
				break;
			case 'F' : System.out.println(objLearner.displayAll());
				break;
			case 'X':
				break;
			default: JOptionPane.showMessageDialog(null, "Invalid choice. DO IT AGAIN!");
				break;
			}
					
		}
		
	}

}
