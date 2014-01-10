package myKeyEvent;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyEvent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.addKeyListener((new java.awt.event.KeyAdapter()
		{

			public void keyPressed (java.awt.event.KeyEvent keyboard)
			{

				int key = keyboard.getKeyCode();
				//if-statements to determine x and y co-ordinates of move
				System.out.println("Key: "+key);
			}}));

	}

}
