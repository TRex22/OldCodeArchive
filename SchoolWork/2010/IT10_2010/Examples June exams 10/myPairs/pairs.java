package myPairs;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class pairs {

	/**
	 * generate two integers between 1 and 15
	 * If add up to 2 disp snake eyes
	 * or add up to 7 disp lucky seven
	 * or adds up to 9 disp unlucky nine
	 * else any other disp another sum
	 */
	public static void main(String[] args) {
		int Num1, Num2;
		Num1 = (int)((Math.random()*15)+1);
		Num2 = (int)((Math.random()*15)+1);
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setLocation(20,20);
		frame.setSize(200,200);
		txt.setText( "Num 1 IS "+Num1+"Num2 IS "+Num2 );
		if (Num1 + Num2 == 2)
		{
			txt.append("\nSnake Eyes!");
		}
		else if (Num1 + Num2 == 7)
		{
			txt.append("\nLucky Seven");
		}
		else if (Num1 + Num2 == 9)
		{
			txt.append("\nUnlucky Nine");
		}
		else
		{
			txt.append("\nAnother Sum");
		}
	}

}
