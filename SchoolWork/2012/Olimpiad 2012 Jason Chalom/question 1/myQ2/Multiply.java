package myQ2;

public class Multiply {
	//Get String input from main class SecurityDigit
			//Object is to multiply all digits except the 0
			
			//do two digits at a time until non left
			
			//for loop with length
	
	//fields
	
	public int ProdDigits(String in)
	{
		int prod = 1;
		for (int i = 0; i<in.length(); i++)
		{
			//int tempProd = (Integer.parseInt(in.charAt(i))*(in.charAt(i+1)));
			
			int temp = Integer.parseInt(""+in.charAt(i));
			if (temp != 0)
			{
				prod = prod*temp;
			}
			else
			{
				prod = prod;
			}
		}
		
		
		return prod;
	}
}
