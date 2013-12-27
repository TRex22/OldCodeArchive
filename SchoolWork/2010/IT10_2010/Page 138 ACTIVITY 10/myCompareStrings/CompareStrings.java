package myCompareStrings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CompareStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	JFrame frame = new JFrame();
	JTextArea txt = new JTextArea();
	frame.setSize(200,200);
	frame.add(txt);
		
	String WTF1 = JOptionPane.showInputDialog( "ENTER " );
	String WTF2 = JOptionPane.showInputDialog( "ENTER ");;
	
	
	if (WTF1.equalsIgnoreCase (WTF2))
	{
		frame.setVisible(true);
		txt.setText("The Strings are equal");
	}
	else
	{
		txt.setText("The Strings are not equal");
		frame.setVisible(true);
	}
	// alphabetical comparison
	if (WTF1.compareToIgnoreCase(WTF2)<0)
	{
		frame.setVisible(true);
		txt.append("\n"+WTF1+" is before "+WTF2);
		
	}
	else if (WTF1.compareToIgnoreCase(WTF2)>0)
	{
		frame.setVisible(true);
		txt.append("\n"+WTF1+" is after "+WTF2);
	}
	else
	{
		frame.setVisible(true);
		txt.append("\n"+WTF1+" is the same as "+WTF2);
	}
		
	}

}
