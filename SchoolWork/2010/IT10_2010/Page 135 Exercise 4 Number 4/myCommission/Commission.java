package myCommission;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Commission {

	/**
	 * Salesman is paid commission as follows:
	 * 	sales(R)		Commission
	 * 	0-500			2% of sales
	 * 	501-5000		5% of sales
	 * 	5001+			8% of sales
	 * Input sales
	 * Calculate commission
	 * display Sales and commision
	 * 
	 */
	public static void main(String[] args) {
		double sales = Double.parseDouble(JOptionPane.showInputDialog("Input The amount of sales you have tried to do in Rands"));
		DecimalFormat rand = new DecimalFormat("R#00.00");
		String message = "";
		double comm;
		if (sales >0 && sales <=500)
		{
			comm = 
			message = "";
		}
		else if (sales >= 501 && sales <= 5000)
		{
			
		}
		else if (sales >= 50001)
		{
			
		}
		
		
	}

}
