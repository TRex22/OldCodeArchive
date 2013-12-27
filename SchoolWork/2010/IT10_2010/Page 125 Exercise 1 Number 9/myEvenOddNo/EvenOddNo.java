package myEvenOddNo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EvenOddNo {

	/**
	 * 
	 */
	public static void main(String[] args) {
		try {

			//enter any Integer
			int AnyInt1 = Integer.parseInt(JOptionPane.showInputDialog
					("Error 1 Now Enter Any Integer"));



			//Import a frame
			JFrame nameofframe = new JFrame();

			//make visible
			nameofframe.setVisible(true);
			nameofframe.setLocation(40,20);
			nameofframe.setSize(350,100);
			nameofframe.setTitle( "Number Shit" );

			//import text area

			JTextArea txt = new JTextArea();
			nameofframe.add(txt);

			//display in text area
			//fist set text then append after

			txt.setTabSize(20);

			//if even
			if (AnyInt1 % 2 == 0)
			{
				//display Insult
				txt.setText("Asshole The Number "+AnyInt1+" Is An Even Number!");
			}
			//if not

			else
			{
				txt.setText("The Number "+AnyInt1+" Is An Odd Number");
				//display Message
			}
			// if divisiable by 5
			if (AnyInt1 % 5 == 0)
			{
				//Disp a super Insult
				txt.append("\nASSSSHOOOLE The Number "+AnyInt1+" Is Also Divisiable By 5");
			}
			// enter number 2
			int AnyInt2 = Integer.parseInt(JOptionPane.showInputDialog
					("Error 2 Now Enter Any Integer"));
			//if divisiable by num 2
			if (AnyInt1 % AnyInt2 == 0)
			{
				txt.append("\n"+AnyInt1+" Is divisiable By "+AnyInt2);
				
			}
			else
			{
				txt.append("\n"+AnyInt1+" Is Not divisiable By "+AnyInt2);
			}
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error Eroor Error Errroror Die....");
		}

	}

}
