package myLearner;

public class Learner {
//1 makee fields
	//-sign means private
	
	private String fullname;
	private int term1;
	private int term2;
	private int term3;
	//3 make ur constructor
		//+ means public
	//public nameofclass (parm)
	//param (what you recieve) = one for each field
	public Learner(String f, int t1, int t2, int t3)
	{
		fullname = f;
		term1=t1;
		term2=t2;
		term3=t3;		
	}
	//2 make ur setters and getters (mutator methods) and getter (accessor methods)
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getTerm1() {
		return term1;
	}
	public void setTerm1(int term1) {
		this.term1 = term1;
	}
	public int getTerm3() {
		return term3;
	}
	public void setTerm3(int term3) {
		this.term3 = term3;
	}
	public int getTerm2() {
		return term2;
	}
	public void setTerm2(int term2) {
		this.term2 = term2;
	}
	//4) other methods = from ins
	
	//getFirstName = return first name only
	
	public String getFirstName()
	{
		
		//det the pos of the space
		int position = fullname.indexOf(" ");
		//f n = part of fullname until space
		String FirstName = fullname.substring(0, position);
		//return
		
		return FirstName;
	}
	public String getSurName()
	{
		
		//det the pos of the space
		int position = fullname.indexOf(" ");
		//f n = part of fullname until space
		String SurName = fullname.substring(position);
		//return
		
		return SurName;
	}
	//toString method = returns all fields
	
	public String toString()
	{
		return "Name: "+fullname+"\nSurname: "+getSurName()+"\nTerm1: "+term1+"\nTerm2: "+term2+"\nTerm3: "+term3;
	}
	
	public double getAvgerage()
	{
		
		double avg = 0.00;
		avg = (term1+term2+term3)/3.0;
		return avg;
	}
	
	public int getHighestMark()
	{
		
		int HighMark = term1;
		if (term2>term1)
		{
			HighMark = term2;
		}
		if (term3>HighMark)
		{
			HighMark = term3;
		}
		return HighMark;
	}
	
	public String getHighestTerm()
	{
		String HighestTerm = "";
		
		int highest = getHighestMark();
		if (term1 == highest)
		{
			HighestTerm += "Term 1 is highest\n";
		}
		if (term2 == highest)
		{
			HighestTerm += "Term 2 is highest\n";
		}
		if (term3 == highest)
		{
			HighestTerm += "Term 3 is highest\n";
		}
		
		return HighestTerm;
	}
	
	
}
