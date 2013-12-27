package myTestRevision;

public class Entry {

	private String Name;
	private int Age;
	private	char account;

	public Entry ()
	{
		Name = " ";
		Age = 0;
		account = ' ';
	}

	public void setName(String name) {
		String temp = "";
		for (int i = 0;i<name.length();i++)
		{
			char temps = name.charAt(i);
			if (Character.isLetter(temps))
			{
				temp += temps;
			}
			if (Character.isWhitespace(temps))
			{
				temp += temps;
			}

		}
		Name = temp;
	}

	public String getName() {
		return Name;
	}

	public void setAge(String age) {
		String temp = "";
		for (int i = 0; i<age.length();i++)
		{
			char temps = age.charAt(i);
			if (Character.isDigit(temps))
			{
				temp += temps;
			}
		}
		Age = Integer.parseInt(temp);
	}

	public int getAge() {
		return Age;
	}

	public void setAccount(String account) {
		char temp = account.toUpperCase().charAt(0);
		if (temp == 'A')
		{
			temp = 'A';
		}
		else if (temp == 'B')
		{
			temp = 'B';
		}
		else if (temp == 'C')
		{
			temp = 'C';
		}
		else
		{
			temp = 'C';

		}

		this.account = temp;

	}

	public char getAccount() {
		return account;
	}
	public double calcCost(double price)
	{

		if (account == 'A')
		{
			price = price - (20/100*price);
		}
		else if (account == 'B')
		{
			price = price - (10/100*price);
		}
		else if (account == 'C')
		{
			price = price - 0;
		}
		return price;
	}



}
