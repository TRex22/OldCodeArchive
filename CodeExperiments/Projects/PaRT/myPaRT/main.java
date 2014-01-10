package myPaRT;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

import java.util.Random;
import java.util.TimerTask;

public class main {//extends TimerTask {
	private JFrame frame = new JFrame("Points");
	public void action(){
	frame.addKeyListener((new java.awt.event.KeyAdapter()
	{

		public void keyPressed (java.awt.event.KeyEvent keyboard)
		{

			int key = keyboard.getKeyCode();
			//if-statements to determine x and y co-ordinates of move
			System.out.println("Key: "+key);
		}}));	
	}

	public static void main(String[] args) {

		
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.add(new main());
		//Action animation = new AbstractAction()
		//{
			//private static final long serialVersionUID = 1L;
			//public void actionPerformed(ActionEvent e)
			//{
				//frame.remove();
				//frame.add(new main());
			//}
		//};
		// panel.add(paintComponent);
		//private Timer times = new Timer(200,animation);
		Timer times = new Timer(200, (ActionListener) new main());
		//frame.add(panel);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

