import javax.swing.JOptionPane;


public class isD {

	/**
	 * 
	 */
	public static void main(String[] args) {
		String input = "x";
		input = JOptionPane.showInputDialog("Enter String to check:");
		while (!input.equalsIgnoreCase("exit"))
		{
			input = JOptionPane.showInputDialog("Enter String to check:");

			JOptionPane.showMessageDialog(null, "Input: "+input+"\nisDouble:"+isDouble(input));
		}
	}

	public static boolean	isDouble (String str)
	{
		boolean isDouble = true;
		//check if the string is not null
		//more for redundant checking since it will already be checked
		if (str == null)
		{
			isDouble = false;
		}
		//check if string is empty but instanciated
		if (str.length() == 0)
		{
			isDouble = false;
		}
		//check if the first character is - which means negative than the double is valid
		//start making the count for the for loop
		int count = 0;
		if(str.charAt(0) == '-')
		{
			//if the length of the string is only 1 place than it is a string and not a number
			if (str.length() == 1)
			{
				isDouble = false;
			}
			//if the string has a - and is still valid as an double than the count for the loop
			//must be 1 because the - must be skipped by the loop
			count=1;
		}
		//this loop will run the length of the string
		//System.out.println("\nreturn before loop: "+isDouble+"\n");
		for (;count < str.length(); count++)
		{
			//a character will be called to be the place of that count of the string
			char c = str.charAt(count);
			//check to see if the character is a digit
			//System.out.println("double char: "+c);
			//System.out.println("isDigit Return: "+Character.isDigit(c));
			if (!Character.isDigit(c) && c != '.' && c != '/')
			{
				isDouble = false;
				//System.out.println("not digit");
			}
			//also check for characters allowed in a double
			//Standard computer data handling means that ',' is not used
			//as a seperator unless specific geographical data is set in the OS
			//for the purposes of this project that will not be assumed in this method



		}

		//System.out.println("return: "+isDouble+"\n");
		return isDouble;
	}


}
