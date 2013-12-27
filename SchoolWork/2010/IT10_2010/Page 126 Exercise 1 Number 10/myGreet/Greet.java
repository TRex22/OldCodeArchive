package myGreet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Greet {

	/**
	 * No Try Catch Block
	 * Display a Menu
	 * User Select Language
	 * display Greeting in That Language
	 */
	public static void main(String[] args) {
		
		char language = JOptionPane.showInputDialog
		("Choose Your Language (enter the letter only\n" +
				"A. Afrikaans\n" +
				"E. English\n" +
				"Z. ZULU")
		.toUpperCase().charAt(0);
		//Import a frame
		JFrame nameofframe = new JFrame();

		//make visible
		nameofframe.setVisible(true);
		nameofframe.setLocation(40,20);
		nameofframe.setSize(150,50);
		nameofframe.setTitle( "Languge Chosser For Somethingn Stupid" );

		//import text area

		JTextArea txt = new JTextArea();
		nameofframe.add(txt);

		//display in text area
		//fist set text then append after

		txt.setTabSize(20);
		if (language == 'A')
		{
			txt.setText("Goeie dag");
		}
		else if (language == 'E')
		{
			txt.setText("Good Day");
			
		}
		else if (language == 'Z')
		{
			txt.append("Sawubona");
		}
		else
		{
			txt.append("HUH? Wrong Language I Dont speak Retard!");
			nameofframe.setSize(300,50);
		}
	}
	

}
