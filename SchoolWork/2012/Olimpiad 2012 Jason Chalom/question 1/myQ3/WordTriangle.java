package myQ3;

import javax.swing.JOptionPane;

public class WordTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		//input.length())%2==0 && 
		//the word must begin and end with the same character
		String out = "";
		//boolean test = true;
		String input = JOptionPane.showInputDialog("Enter Word");
		char begin = input.charAt(0);
		char end = input.charAt(input.length()-1);
		//det if word has an even amount of chars
		if (begin != end)
		{
			//test = false;
			out = "Not suitable";

		}
		else
		{
			//test = true;
			int space = (input.length()/2) + 1;
			for (int i = 0 ; i < space ; i++)
			{
				out+=" ";
			}
			out += input.charAt(0)+"\n";
			for (int i =1; i<input.length()-1; i++)
			{

				//for (int j =1; j<input.length(); j++)
				//{

				//}

				for (int k = 0 ; k < space-i ; k++)
				{
					out+=" ";
				}

				out += input.charAt(i);
				for (int y = i+(i-1); y>0; y--)
				{
					out +=" ";
				}
				out += input.charAt((input.length()-1)-i)+"\n";

			}
			//out += ""+input+"\n";
			for (int i = 0; i<input.length(); i++)
			{
				out += ""+input.charAt(i)+" ";
			}
			out +="\n";
		}

		//if (test = true)
		//{
		//no times to place spaces for top char is half between length of word. I will add one
		//for redundency sake



		//}


		System.out.println("\n"+out);
	}

}
