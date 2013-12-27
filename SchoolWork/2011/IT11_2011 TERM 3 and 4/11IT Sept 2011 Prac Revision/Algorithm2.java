import java.awt.Toolkit;
import java.util.Scanner;


public class Algorithm2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Shorten vowels in sms text. Read in msg and remove all vowels
		System.out.println("Enter Message after the tone:");
		System.out.print("\007\007\007\008\013\005");
		System.out.flush();
		String vowels = "AEIOUYaeiouy";
		Toolkit.getDefaultToolkit().beep();
		Scanner scInput = new Scanner(System.in);
		String message = "";
		Scanner scString = new Scanner(scInput.nextLine());

		String temp = scString.nextLine();
		for (int i = 0;i<temp.length();i++)
		{
			char ch = temp.charAt(i);
			if (vowels.indexOf(ch)<0)
			{
				message+= ch;
			}
		}


		System.out.println(message);


		scString.close();
		scInput.close();






	}

}
