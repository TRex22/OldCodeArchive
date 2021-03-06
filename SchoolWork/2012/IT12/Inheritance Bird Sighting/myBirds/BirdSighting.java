package myBirds;

public class BirdSighting extends MammalSighting{
	private int distance;
	private int big6;
	private int flight;
	public BirdSighting(int s, int l, char S, String SD, String VC,int d, int b6, int f) {
		super(s, l, S, SD, VC);
		distance = d;
		big6=b6;
		flight =f;
		
	}
	public String toString()
	{
		
		return ""+super.toString()+"\t\t"+distance+"\t\t"+big6+"\t\t"+flight;
	}
	
	public int calcScore()
	{
		int out = 15;
		if (distance <10)
		{
			out += 20;
			
		}
		if (flight == 1)
		{
			out += 5;
		}
		if (big6==1)
		{
			out += 15;
		}
		
		return out;
	}

}
