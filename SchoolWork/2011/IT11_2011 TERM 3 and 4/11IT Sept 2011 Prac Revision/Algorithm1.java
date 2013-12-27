import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Algorithm1 {

	/**
	 *
	 */
	public static void main(String[] args) {

		//loop
		//String endloop = "";
		double hrRate = 0.00;
		int NoHrs = 0;
		int amountAbsent = 0;
		String name = JOptionPane.showInputDialog("Enter the name of the worker <Type QQQ to exit>");
		double salary = 0.00;
		DecimalFormat rand = new DecimalFormat("R#.00");

		while (!name.equalsIgnoreCase("qqq"))
		{

			hrRate = 0.00;
			NoHrs = 0;
			amountAbsent = 0;
			salary = 0.00;


			//Get hourly rate

			hrRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the hourly rate in Rands"));
			//get number of hrs worked

			NoHrs = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hours worked"));
			//get amount of days absent

			amountAbsent = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of days absent"));

			if (NoHrs > 40)
			{
				hrRate = (double)(1.5)*(hrRate);
				salary = (hrRate)*(NoHrs);
			}
			else
			{
			salary = (NoHrs)*(hrRate);
			}
			if (amountAbsent == 0)
			{
			salary += 25.00;
			}


			System.out.println(name+" is payed "+rand.format(hrRate)+" per hour, he/she has worked "+NoHrs+" no of hours and was absent "+amountAbsent+" hrs and will be payed "+rand.format(salary));
			name = JOptionPane.showInputDialog("Enter the name of the worker <Type QQQ to exit>");
		}




	}

}
