package mySum;

import javax.swing.JOptionPane;

public class Sum {

	/**
	 * Enter numbers
	 * stop when sum greater or equal to 100
	 * display the numbers
	 * count how many numbers have been entered
	 * determine the sum
	 * 
	 * Planning:
	 * before
	 * 
	 */
	public static void main(String[] args) {
		int sum = 0;
		char answer = 'Y';
		int i = 1;
		while (sum<100&&answer=='Y')
		{
			int no1 = Integer.parseInt(JOptionPane.showInputDialog("Number "+i));
			sum += no1;
			System.out.println( "Number "+i+" entered : "+no1+" Sum with others: "+sum );
			i++;
			answer = JOptionPane.showInputDialog("Do You Want to enter another number?").toUpperCase().charAt(0);
		}
		
		
		
		
		

	}

}
