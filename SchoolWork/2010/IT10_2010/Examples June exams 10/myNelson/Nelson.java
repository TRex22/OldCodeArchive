package myNelson;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Nelson {

	/**
	 * enter no of hours worked wage = R12.50 per h
	 * enter live or not
	 * enter no of credits 0-10 
	 * disp owing in rands
	 */
	public static void main(String[] args) {
		DecimalFormat rand = new DecimalFormat("R#00.00");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(20,20);
		JTextArea txt = new JTextArea();
		frame.setTitle( "PAYDAY!!!!" );
		frame.add(txt);
		double wagePH = 12.50;
		int HoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours Worked in the Week for Worker"));
		Boolean live = Boolean.parseBoolean(JOptionPane.showInputDialog("Does worker live on farm or get travel money, R70 <true or false"));
		int NoCredits = Integer.parseInt(JOptionPane.showInputDialog("Enter Numebr of credits earned <0-10>"));
		double check = wagePH * HoursWorked;
		if (live == false)
		{
			check = check+70;
		}
		else if (live == true)
		{
			check = check+0;
		}
		if (NoCredits/5 == 1)
		{
			check = check+100;
		}
		else if (NoCredits/5 == 2)
		{
			check = check+200;
		}
		else if (NoCredits/5 > 2)
		{
			txt.setText("ONLY A MAXIMUM OF 10 CREDITS");
		}
		txt.setText("Worker worked for: "+HoursWorked+"\n" +
				"Worker Lives on Farm = "+live+"\n" +
						"Number of credits recieved by worker: "+NoCredits);
		txt.append("\nYou OWE WORKER:"+rand.format(check));
	
	
	
	}

}
