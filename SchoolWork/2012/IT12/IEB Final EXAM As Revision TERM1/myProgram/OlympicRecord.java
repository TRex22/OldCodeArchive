package myProgram;

public class OlympicRecord extends RaceResult{

	public OlympicRecord(String a, String c, int p, String r) {
		super(a, c, p, r);
		
	}
	
	public boolean isVaild ()
	{
		boolean check = false;
		if (super.getPosition()== 1)
		{
			check = true;
		}
		else
		{
			check = false;
		}
		return check;
	}
	
	public double getTimeInSeconds ()
	{
		double TimeSec = 0.00;
		if (super.getTime().contains("m")&&(int)(super.getTime().charAt(0))>0)
		{
			int pos = super.getTime().indexOf("m");
			int minute = Integer.parseInt(super.getTime().substring(0,pos));
			double seconds = Double.parseDouble(super.getTime().substring(pos+1, super.getTime().length()));
			TimeSec = (minute*60)+seconds;
		}
		else if (super.getTime().contains("m"))
		{
			int pos = super.getTime().indexOf("m");
			TimeSec = Double.parseDouble(super.getTime().substring(pos+1,super.getTime().length()));
		}
		else
		{
			TimeSec = Double.parseDouble(super.getTime());
		}
		return TimeSec;
	}

	public String toString()
	{
		String out = "";
		boolean temp = isVaild();
		if (temp = true)
		{
			out += super.getAthlete()+" ("+super.getCountry()+"): "+super.getPosition()+" Record Is Valid, Time:"+getTimeInSeconds()+" seconds.";
		}
		else
		{
			out += super.getAthlete()+" ("+super.getCountry()+"): "+super.getPosition()+" Record Is Not Valid, Time:"+getTimeInSeconds()+" seconds.";
		}
	return out;
	}
}
