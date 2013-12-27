import javax.swing.JOptionPane;


public class Patterns {

	/**
	 * enter strings until the user types xxx
	 * For each string we are going to display the string
	 * and how many vowels it has
	 * and display the string with vowels removed
	 */
	public static void main(String[] args) {
		final String vowels = "AaEeIiOoUu";
		//input
		String sentence = JOptionPane.showInputDialog("Enter a sentence");
		String message;

		//Processing
		//Constant to keep all vowels

		while (!sentence.equalsIgnoreCase("XXX"))
				{
			message = sentence + "\n";
			int count = 0;
			String temp = "";
			for (int i = 0; i < sentence.length(); i++) {
				char letter = sentence.charAt(i);
				//if (letter == a | letter ==A ECT...
				//if (vowels.contains(""+letter))
				//returns actual position
				if (vowels.indexOf(letter) >= 0) {
					count++;
				}
				else
				{
					temp += letter;
				}

			}
			message += "Contain " + count + " vowels\n"
					+ "Sentence with vowels removed: "+temp;
			JOptionPane.showMessageDialog(null, message, "OutPut Title", JOptionPane.OK_OPTION);
			sentence = JOptionPane.showInputDialog("Enter a sentence");
				}//end of while
		//output






	}

}
