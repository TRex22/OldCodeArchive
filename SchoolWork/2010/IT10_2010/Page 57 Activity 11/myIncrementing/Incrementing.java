package myIncrementing;

import javax.swing.JOptionPane;

public class Incrementing {

	/**
	 * Put name here and question number heading
	 */
	public static void main(String[] args) {
	try{	
		//Input
		String sNum1 = JOptionPane.showInputDialog( "Enter First Integer" );
		String	sNum2 = JOptionPane.showInputDialog( "Enter Second Integer" );
		int iNum1 = Integer.parseInt(sNum1);
		int iNum2 = Integer.parseInt(sNum2);
		System.out.println( "The First Number Is "+iNum1 );
		System.out.println( "The Second Number Is "+iNum2 );
		
		JOptionPane.showMessageDialog(null, "The First Number Is "+iNum1 );
		JOptionPane.showMessageDialog(null, "The Second Number Is "+iNum2 );
		
		//Method 1
		//Increment means add 1
		//Method 1 : Add 1 to num1 and and save it back to num1
		//lh = rh
		//LH is where you save 
		//Rh is calculation
		//= is not an equation
		//= is assignment statement
		
		iNum1 = iNum1+1;
		
		//Method2
		//other way of incrementation
		//shortcut for adding 1 ++
		
		iNum2++;
		
		//display answer
		System.out.println( "The First Number Is With Increment: "+iNum1 );
		System.out.println( "The Second Number Is With Increment: "+iNum2 );
		
		JOptionPane.showMessageDialog(null, "The First Number Is With Increment: "+iNum1 );
		JOptionPane.showMessageDialog(null, "The Second Number Is With Increment: "+iNum2 );
		
		//Method 1
		//Decrement means Subtract 1
		//Method 1 : Add 1 to num1 and and save it back to num1
		//lh = rh
		//LH is where you save 
		//Rh is calculation
		//= is not an equation
		//= is assignment statement
		
		iNum1 = iNum1-1;
		
		//Method2
		//other way of Decrementation
		//shortcut for Subtracting 1 --
		
		iNum2--;
		
		//display answer
		//Go Back to original numbers
		System.out.println( "The First Number Is With Decrement: "+iNum1 );
		System.out.println( "The Second Number Is With Decrement: "+iNum2 );
		
		JOptionPane.showMessageDialog(null, "The First Number Is With Decrement: "+iNum1 );
		JOptionPane.showMessageDialog(null, "The Second Number Is With Decrement: "+iNum2 );
	}catch (NumberFormatException x)
	{System.err.println("Insert Integers Only!!!");}
	{
		//second part input y or n
		//String q=JOptionPane.showInputDialog( "So?" );
		//int iq = Integer.parseInt(q);  
		//if (iq==1){System.out
	}	
		
		
		
	
	}

}
