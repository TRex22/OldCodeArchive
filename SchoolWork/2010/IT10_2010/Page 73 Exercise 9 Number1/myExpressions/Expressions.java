package myExpressions;

import javax.swing.JOptionPane;

public class Expressions {

	/**
	 * 
	 */
	public static void main(String[] args) {
	try {
		//checkpoint 6 p 71
		//1	
		System.out.println("1");
		System.out.println( "1+2*3 = "+(1+2*3) );
		System.out.println( "2/2*3 ="+(2/2*3) );
		System.out.println( "1+4/4 ="+(1+4/4) );
		System.out.println( "1*4%2 = "+(1*4%2) );
		System.out.println( "Math.pow(2*2, 3) = "+(int)(Math.pow(2*2, 3)) );
		System.out.println( "5%3%2 = "+(5%3%2) );
		//2
		System.out.println("\n2");
		System.out.println( "1/(2*3) = "+(1/(2*3)) );
		System.out.println( "Math.pow(2,2*3) = "+(int)(Math.pow(2, 2*3)) );
		System.out.println( "1.5x10^-4+2.5x10^-2 = "+((1.5*(Math.pow(10, -4)))+(2.5*(Math.pow(10, -2))) ) );
		System.out.println( "(3+4)/(5+6) = "+((double)(3+4)/(5+6)) );
		//3
		double a = 2, b = 3, c = 5;
		int i = 2, j =3;
		System.out.println("\n3");
		System.out.println( "Real: a = 2 b = 3 c = 5 Int: i = 2 j =3" );
		System.out.println( "a*b+c = "+(a*b+c) );
		System.out.println( "a*(b+c) = "+(a*(b+c)) );
		System.out.println( "b/c*a ="+(b/c*a) );
		System.out.println( "a/i/j ="+(a/i/j) );
		System.out.println( "4/b/4 ="+(4/b/4) );
		//System.out.println( "4/(j/4) ="+(4/(j/4)) );
		//error because we divide by 0 undefined
		//can fix by changing to double
		System.out.println( "17%(4%b) ="+(17%(4%b)) );
		//7
		System.out.println( "\n7" );
		System.out.println( "Math.pow(3.5, 2) = "+(Math.pow(3.5, 2)) );
		System.out.println( "Math.abs(-5) = "+(Math.abs(-5)) );
		System.out.println( "Math.round(-3.8) = "+(Math.round(-3.8)) );
		System.out.println( "Math.pow(65%9,2) = "+(Math.pow(65%9,2)) );
		System.out.println( "Math.round(Math.sqrt(150)) = "+(Math.round(Math.sqrt(150))) );
		System.out.println( "43%2+18*Math.sqrt(36/4) = "+(43%2+18*Math.sqrt(36/4)) );
		System.out.println( "Math.sqrt(7+18/7-23%10) = "+(Math.sqrt(7+18/7-23%10)) );
		System.out.println( "Math.sqrt(16) = "+(Math.sqrt(16)) );
		System.out.println( "Math.round(0.75) = "+(Math.round(0.75)) );
		System.out.println( "Math.pow(Math.round(4.75),2) = "+(Math.pow(Math.round(4.75),2)) );
		System.out.println( "Math.round(Math.abs(14.75-20)) = "+(Math.round(Math.abs(14.75-20))) );
		System.out.println( "Math.sqrt(6+76%10/2) = "+(Math.sqrt(6+76%10/2)) );
		System.out.println( "Math.abs(7.88 - Math.pow(12.5,2)) = "+(Math.abs(7.88 - Math.pow(12.5,2))) );
		System.out.println( "Math.round(14.7 - 0.95)+2.5*Math.abs(-6-4) = "+(Math.round(14.7 - 0.95)+2.5*Math.abs(-6-4)) );
		 //8
		System.out.println( "\n8" );
		System.out.println( "Math.sqrt(16*4)+Math.pow(7,3) = "+(Math.sqrt(16*4)+Math.pow(7,3)) );
		System.out.println( "Math.round(86.75)-Math.abs(-86.75) = "+(Math.round(86.75)-Math.abs(-86.75)) );
		System.out.println( "75/14+75%14+Math.round(75/14) = "+(75/14+75%14+Math.round(75/14)) );
		System.out.println( "18/5/3-67%Math.round(Math.abs(-5.77)) = "+(18/5/3-67%Math.round(Math.abs(-5.77))) );
		System.out.println( "Math.sqrt(Math.round(412.6/14.8))+Math.pow(Math.round(44.67/2.5),2) = "+(Math.sqrt(Math.round(412.6/14.8))+Math.pow(Math.round(44.67/2.5),2)) );
		
		
	} catch (Exception e) {JOptionPane.showMessageDialog(null, "Unknow Error");
			
	}
		

	
	
	
	
	
	
	}

}
