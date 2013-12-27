package myValidDate;

import javax.swing.JOptionPane;

public class ValidDate {
	public static void main(String[] args) {


		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of The Day"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of The Month"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of The Year"));
		String fullmonth="";
		boolean valid = true;
		switch (month)
		{
		case 1:
			fullmonth="January";
			if (day<0||day>31)
				valid=false;
			break;
		case 2:
			fullmonth="Febuary";
			if(year%4==0)
			{
				if (day<0||day>29)
					valid=false;
			}
			else
			{
				if (day<0||day>28)
					valid=false;
			}
			break;
		case 3:
			fullmonth="March";
			if (day<0||day>31)
				valid=false;
			break;
		case 4:
			fullmonth="April";
			if (day<0||day>30)
				valid=false;
			break;
		case 5:
			fullmonth="May";
			if (day<0||day>31)
				valid=false;
			break;
		case 6:
			fullmonth="June";
			if (day<0||day>30)
				valid=false;
			break;
		case 7:
			fullmonth="July";
			if (day<0||day>31)
				valid=false;
			break;
		case 8:
			fullmonth="August";
			if (day<0||day>31)
				valid=false;
			break;
		case 9:
			fullmonth="September";
			if (day<0||day>30)
				valid=false;
			break;
		case 10:
			fullmonth="October";
			if (day<0||day>31)
				valid=false;
			break;
		case 11:
			fullmonth="Novemeber";
			if (day<0||day>30)
				valid=false;
			break;
		case 12:
			fullmonth="December";
			if (day<0||day>31)
				valid=false;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Entry");
			valid = false;
			
		}
		if (valid==true)
		{

			JOptionPane.showMessageDialog(null, "The Date is: "
					+day+"/"+fullmonth+"/"+year+
			"\nand is valid\nDDMMYY");

		}
		
			



	}

}

