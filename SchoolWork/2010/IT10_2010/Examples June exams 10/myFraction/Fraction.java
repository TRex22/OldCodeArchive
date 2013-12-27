package myFraction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Fraction {

	/**
	 * enter fraction 1 
	 * 	numerator
	 * 	denominator
	 * enter fraction 2
	 * 	numerator
	 * 	denominator
	 * enter answer
	 * determine if answer is right
	 */
	public static void main(String[] args) {
		int N1 = Integer.parseInt(JOptionPane.showInputDialog("Enter The Numerator of Fraction 1"));
		int D1 = Integer.parseInt(JOptionPane.showInputDialog("Enter The Denominator of Fraction 1"));
		int N2 = Integer.parseInt(JOptionPane.showInputDialog("Enter The Numerator of Fraction 2"));
		int D2 = Integer.parseInt(JOptionPane.showInputDialog("Enter The Denominator of Fraction 2"));
		char ans = JOptionPane.showInputDialog("Enter if the fraction is equal to, bigger than or smaller than (=><)").charAt(0);
		double F1 = N1/D1;
		double F2 = N2/D2;
		
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.setVisible(true);
		frame.setTitle("Fractions Math Blaster Unmystery");
		frame.setSize(400,200);
		frame.add(txt);
		txt.setTabSize(13);
		txt.setText("You entered the Fractions: "+N1+" <AND> "+N2
				+"\n                                             -----------------------------"
				+"\n\t "+D1+" <AND> "+D2);
		if (ans == '=' & F1 == F2 )
		{
			txt.append("\nYou Said That Fraction 1 = Fraction 2 ");
			JOptionPane.showMessageDialog(null, "And You Were Right");
			frame.setVisible(false);
			
			System.exit(1);
		}
		else if (ans =='>' & F1 > F2)
		{
			txt.append("\nYou Said That Fraction 1 > Fraction 2");
			JOptionPane.showMessageDialog(null,"And You Were Right");
			frame.setVisible(false);
			
			System.exit(1);
		}
		else if (ans == '<' & F1 < F2)
		{
			txt.append("\nYou Said That Fraction 1 < Fraction 2");
			JOptionPane.showMessageDialog(null,"And You Were Right");
			frame.setVisible(false);
			
			System.exit(1);
		}
		else 
		{
			txt.append("\nYou Said That Fraction 1 "+ans+" Fraction 2 ");
			
			JOptionPane.showMessageDialog(null,"Which IS Incorrect Sorry");
			frame.setVisible(false);
			System.exit(1);
		}
	
	
	}

}
