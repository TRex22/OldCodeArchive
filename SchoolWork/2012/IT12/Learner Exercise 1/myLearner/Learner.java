package myLearner;

import java.util.Scanner;

public class Learner {

	private String fullName;
	private int term1;
	private int term2;
	private int term3;
	
	public Learner (String fN, int t1, int t2, int t3)
	{
		setFullName(fN);
		setTerm1(t1);
		setTerm2(t2);
		setTerm3(t3);
	}
	//get firstname
	
	public String getFirstName()
	{
		//int posS = fullName.indexOf(" ");
		//setSurname(fullName.substring(posS, fullName.length()+1)) ;
		//return fullName.substring(0,posS+1);
		Scanner scFN = new Scanner (fullName).useDelimiter(" ");
		
		return ""+scFN.next();
	}
	//surname
	
	public String getSurname()
	{
		Scanner scFN = new Scanner (fullName);//.useDelimiter(" ");
		scFN.next();
		return ""+scFN.next();
	}
	//

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getTerm1() {
		return term1;
	}

	public void setTerm1(int term1) {
		this.term1 = term1;
	}

	public int getTerm2() {
		return term2;
	}

	public void setTerm2(int term2) {
		this.term2 = term2;
	}

	public int getTerm3() {
		return term3;
	}

	public void setTerm3(int term3) {
		this.term3 = term3;
	}
	
	
	public String toString()
	{
		
		return  ""+fullName+" Term1: "+term1+" Term2: "+term2+" Term3: "+term3;
	}
	public double getAverage()
	{
		return (double)(term1+term2+term3)/(3);
	}
	public int getHighestMark()
	{
		int HM = term1;
		if (term2>HM)
		{
			HM=term2;
		}
		else if (term3>HM)
		{
			HM=term3;
		}
		return HM;
	}
	public String getHighestTerm()
	{
		String out="";
		if(getHighestMark()==term1)
		{
			out+=("term1");
		}
		else if (getHighestMark()==term2)
		{	
			out+=("term2");
		}
		else if (getHighestMark()==term3)
		{
			out+=("term3");
		}
		return out;
	}
	
	
	
}
