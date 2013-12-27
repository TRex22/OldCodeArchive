package myHeights;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Heights {

	/**
	 *
	 */
	public static void main(String[] args) {
		DecimalFormat deci = new DecimalFormat("00.00#M");
		double height = 0.0;
		double highestH = 0.0;
		String highestName="";
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height and Input Negative Height to exit"));
		while(height>0)
		{

			String name = JOptionPane.showInputDialog("Enter Name");
			if (height>highestH)
			{
				highestName = name;
				highestH = height;
			}

			height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height and Input Negative Height to exit"));


		}

		JOptionPane.showMessageDialog(null, "Highest Person Is: "+highestName+"\nIts height is: "+deci.format(highestH));



	}

}
