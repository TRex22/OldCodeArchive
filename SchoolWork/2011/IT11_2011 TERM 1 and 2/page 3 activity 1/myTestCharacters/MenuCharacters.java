package myTestCharacters;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MenuCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setTitle ("CHARACTERS!!!!");
		frame.setSize(500,500);
		frame.setLocation(400, 200);
		//insanciate an oject

		TestCharacters objChar = new TestCharacters();
		//show a menu repeatedly until the user
		//chooses to exit
		char choice = ' ';//declare and give initial value

		do
		{
			choice = JOptionPane.showInputDialog("Choose from the following:\n" +
					"A: Enter two sentences\n" +
					"B: Display both sentences\n" +
					"C: Analyse the charcacters\n"+
					"D: Encode sentence 2\n"+
					"E: Calculate the numerical value of sentence 1\n"+
					"F: Compare the sentences\n"+
			"X: Exit").toUpperCase().charAt(0);



			//menu options
			switch (choice)
			{
			case 'A' :
				String temp;
				temp = JOptionPane.showInputDialog
				("Enter first sentence");
				objChar.setSentence1(temp);
				temp = JOptionPane.showInputDialog
				("Enter second sentence");
				objChar.setSentence2(temp);

				break;
			case 'B' :
				JOptionPane.showMessageDialog(null, "Sentence 1: "+objChar.getSentence1()+"\n" +
						"Sentence 2: "+objChar.getSentence2());
				break;
			case 'C' :

				frame.setVisible(true);
				txt.setText(objChar.analyseSentence1());
				break;
			case 'D' :
				frame.setVisible(false);
				txt.setText("");
				frame.setVisible(true);
				txt.setText(objChar.encodeSentence2());
				break;
			case 'E' :
				frame.setVisible(false);
				txt.setText("");
				frame.setVisible(true);
				txt.setText(objChar.valueSentence1());
				break;
			case 'F' :
				frame.setVisible(false);
				txt.setText("");
				frame.setVisible(true);
				txt.setText(objChar.compareSentences());
				break;
			case 'X' :
				JOptionPane.showMessageDialog(null, "Goodbye");
				frame.setVisible(false);
				System.exit(1);

				break;
			default : 	JOptionPane.showMessageDialog(null, "Invalid Choice");
			}

		}
		while (choice != 'X');





	}

}
