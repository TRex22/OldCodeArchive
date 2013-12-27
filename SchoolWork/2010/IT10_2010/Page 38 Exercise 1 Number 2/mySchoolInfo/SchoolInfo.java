package mySchoolInfo;

import javax.swing.JOptionPane;

public class SchoolInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//input full name
		String SFullName;
		SFullName = JOptionPane.showInputDialog( "Enter Full Name" );
		//input name of school
		String Sschool;
		Sschool = JOptionPane.showInputDialog( "Enter The Name Of Your School" );
		//input grade
		String Sgrade;
		Sgrade = JOptionPane.showInputDialog( "Enter Your Grade" );
		//input class
		String SClass;
		SClass = JOptionPane.showInputDialog( "Enter Your Class" );
		
		//display
		//System.out.println( "SCHOOL DETAILS" );
		//System.out.println( "--------------" );
		//System.out.println("Name: "+ SFullName );
		//System.out.println("School: "+Sschool );
		//System.out.println("Grade: "+Sgrade+" "+SClass );
		System.out.println( "  SCHOOL DETAILS \n"+
							"-------------------\n"
						  +"Name: \t"+ SFullName+ "\n"
						  + "School:\t"+Sschool+ "\n"
						  + "Grade: \t"+Sgrade+" "+SClass );
		//\t is tab \n is new line \r is extra line on top
		
	
	
	}

}
