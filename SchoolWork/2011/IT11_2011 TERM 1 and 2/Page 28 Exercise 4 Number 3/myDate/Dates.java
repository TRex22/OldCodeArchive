package myDate;

public class Dates {

	//private String date;
	private String date[]= new String[3];
	public String date1;
	public Dates()
	{
		//date = "000000";
		date[0] = "00";
		date[1] = "00";
		date[2] = "00";

	}
	public void setDate(String date) {
		try{
		this.date[0] = date.substring(0,2);
		}catch (Exception e) {

		}
		this.date[1] = date.substring(2,4);
		try{
		this.date[2] = date.substring(4);
		}catch (Exception e) {
			// TODO: handle exception
		}
		}

	public String getDate() {
		String date1 = date[0]+date[1]+date[2];
		return date1;
	}

	public String validateDate()
	{
		String message="";
		//remove all non-digits
		for (int i =0; i<date.length ;i++)
		{
			String temp = "";
			String arraypt = date[i];
			char letter = ' ';
			for (int j = 0; j<arraypt.length();j++)
			{
				letter = arraypt.charAt(j);
				if (Character.isDigit(letter))
				{
					temp+=letter;
				}

			}
		date1 = temp;
		}
		//check wheather it is 6 dgits
		//if it is 5 digits add a zero in front
		if (date[0].length()+date[1].length()+date[2].length()==5)
		{
			date1="0"+date;
		}
		else if (date[0].length()+date[1].length()+date[2].length()==6)
		{
			message= "Date is correct";
		}
		else
		{
			message = "Date Enetred incrrectly";
		}

		return message;
	}

	public String changeDate()
	{
		String temp="";
		if ((date[0].length()+date[1].length()+date[2].length())==6)
		{
			temp = date[2]+"/"+date[1]+"/"+date[0];
		}
	return temp;
	}



}