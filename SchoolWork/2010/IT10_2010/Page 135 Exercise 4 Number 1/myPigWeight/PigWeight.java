package myPigWeight;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PigWeight {

	/**
	 * Pigs sell at high prices if the weight are
	 * between 160 and 185 kg
	 * Input pig's weight
	 * Display the weight and the word
	 * 	PREMIUM if the weight is in the desired range
	 * 	TOO LOW if it is below 160kg
	 * 	TOO HIGH if it is above 185 kg.
	 */
	public static void main(String[] args) {
		int weight = Integer.parseInt(JOptionPane.showInputDialog( "Enter pIgS wEiGhT:" ));
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200,200);
		JTextArea txt = new JTextArea();
		frame.add(txt);
		JButton button = new JButton();
		
		if (weight >= 160 & weight <= 185)
		{
			txt.setText("PREMIUM");
		}
		else if (weight < 160)
		{
			txt.setText("TOO LOW");
		}
		else if (weight > 185)
		{
			txt.setText("TOO HIGH");
		}
		
		
		
		
	}

}
