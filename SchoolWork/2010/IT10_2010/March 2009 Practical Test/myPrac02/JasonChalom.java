package myPrac02;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JasonChalom {

	/**
	 *enter name
	 *enter surname
	 *enter number 1
	 *enter number 2
	 *Calc How Many Digits in name
	 *Calc How Many Digits in Surname
	 *Display num 1 and num 2
	 *	num 1 + num 2
	 *	
	 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your Name");
		String surname = JOptionPane.showInputDialog("Enter Your Surname");
		int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Integer 1"));
		int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Integer 2"));
		char initial = name.charAt(0);
		double dNum1 = iNum1;
		double dNum2 = iNum2;
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Welcome "+initial+". "+name);
		frame.setSize(500,300);
		JTextArea txt = new JTextArea();
		frame.add(txt);
		txt.setText("Did You Know There is "+name.length()+" letters in your name and "+surname.length()+" letters in your surname");
		txt.append("\n\nYou entered "+iNum1+" and "+iNum2 );
		txt.append("\n"+iNum1+"+"+iNum2+"="+iNum1+iNum2+" AND "+iNum2+"+"+iNum1+"="+iNum2+iNum1);
		txt.append("\n"+iNum1+"-"+iNum2+"="+(iNum1-iNum2)+" AND "+iNum2+"-"+iNum1+"="+(iNum2-iNum1));
		txt.append("\n"+iNum1+"x"+iNum2+"="+(iNum1*iNum2)+" AND "+iNum2+"x"+iNum1+"="+(iNum2*iNum1));
		txt.append("\n"+iNum1+"/"+iNum2+"="+(iNum1/iNum2)+" and "+(iNum1%iNum2)+" remaining = "+(dNum1/dNum2)+" AND "
				+iNum2+"/"+iNum1+"="+(iNum2/iNum1)+" and "+(iNum2%iNum1)+" remaining = "+(dNum2/dNum1));
		
		
	}

}
