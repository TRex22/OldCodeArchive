package myDate;

import javax.swing.JOptionPane;

public class UseDate {

	/**
	 * Dates are entered as ddmmyy
	 * Validated the date\
	 * change YY/MM/DD
	 */
	public static void main(String[] args) {
		//String[] arrayS = new String[6];
		Dates objDates = new Dates();
		String date = JOptionPane.showInputDialog("Enter the date in the format DDMMYY");

		objDates.setDate(date);

		JOptionPane.showMessageDialog(null, objDates.validateDate()+"\n"+objDates.changeDate());





	}

}
