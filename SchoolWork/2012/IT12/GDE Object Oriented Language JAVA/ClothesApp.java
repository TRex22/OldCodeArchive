import javax.swing.JOptionPane;

public class ClothesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char choice = ' ';
		
		while (choice != 'Q')
		{
			choice = JOptionPane.showInputDialog("Enter The following:\n" +
					"A. Display Wardrobe\n" +
					"B. Sort according to rating\n" +
					"C. Search for a garment\n" +
					"D. Encode colours" +
					"Q. Quit").toUpperCase().charAt(0);
			
			
			switch (choice)
			{
				case 'A':
					break;
				case 'B':
					break;
				case 'C':
					break;
				case 'D':
					break;
				case 'Q':
					break;
				default: JOptionPane.showMessageDialog(null, "Enter a valid entry");
					break;
			}
		}

	}

}
