package myPalindrome;

public class Palindrome {

	private String input;

	public Palindrome ()
	{
		input = "";
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void removeInvalid()
	{
		String temp = "";
		for (int i = 0; i<input.length();i++)
		{
			char tempspace = input.charAt(i);
			if (Character.isLetter(tempspace))
			{
				temp += tempspace;
			}

		}

		input = temp;
		//return temp;


	}

	public String determinePalindrome ()
	{
		String inputBack = "";
		String out = "";

		for (int i =0; i<input.length();i++)
		{
			char temp = input.charAt(input.length()-1-i);
			inputBack += temp;
		}

		if (input.equalsIgnoreCase(inputBack))
		{
			if (input.length()==5)
			{
				out = ""+input+" is a palindrome";
			}
			else
			{
				out = ""+input+" is too short";
			}
		}
		else
		{
			out = ""+input+" is not a palindrome";
		}
		return out;

	}







}