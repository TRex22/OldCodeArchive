package myQ2;

import javax.swing.JOptionPane;

public class SecurityDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Get String input 
		//Object is to multiply all digits except the 0
		
		//do two digits at a time until non left
		
		//for loop with length
		
		//Input
		Multiply multi = new Multiply();
		String input = JOptionPane.showInputDialog("Number?");
		
		//int prod = 1;
		//for (int i = 0; i<input.length()-1; i++)
		//{
			//int tempProd = (Integer.parseInt(in.charAt(i))*(in.charAt(i+1)));
			
		//	int temp = Integer.parseInt(""+input.charAt(i));
			
		//	prod = prod*temp;
			
		//}
		
		String InProcess = ""+input;
		//System.out.println("test = "+InProcess);
		
		while (InProcess.length()>1)
		{
			InProcess = ""+multi.ProdDigits(InProcess);
		}
		
		System.out.println("Security digit = "+InProcess);
		
	}

}
