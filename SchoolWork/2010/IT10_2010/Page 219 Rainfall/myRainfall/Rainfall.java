package myRainfall;

import javax.swing.JOptionPane;

public class Rainfall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int totalrainfall = 0;
		int rainfall =  0;
		int noDays =0 ;
		int highestR = 0;
		int highestD = 0 ;
		rainfall = Integer.parseInt(JOptionPane.showInputDialog("ENTER RAINFALL MM OR NEGATIVE RAINFALL TO EXIT"));

		while(rainfall>=0)
		{
			noDays++;
			totalrainfall += rainfall;
			rainfall = Integer.parseInt(JOptionPane.showInputDialog("ENTER RAINFALL MM OR NEGATIVE RAINFALL TO EXIT"));
			if (rainfall > highestR)
			{
				highestR=rainfall;
				highestD=noDays;
			}


		}
		double average = (int)Math.round(totalrainfall/noDays);
		JOptionPane.showMessageDialog(null, "Number of days: "+noDays+"\nTotal Rainfall: "+totalrainfall+"mm" +
				"\nAverage Daily Rainfall: "+average+"mm"+"\nDay With Highest Rainfall: "+highestD+"" +
						"\nHighest Rainfall: "+highestR+"mm");




	}

}
