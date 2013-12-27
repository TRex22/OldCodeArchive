package myProgram;

public class OlympicRecord extends RaceResult{

	public OlympicRecord(String athlete, String country, int position,
			String raceTime) {
		super(athlete, country, position, raceTime);
		
	}

	public boolean isValid()
	{
		boolean isValid = false;
		if (super.getPosition() == 1)
		{
			isValid = true;
		}
		else
		{
			isValid = false;
		}
		
		
		return isValid;
	}
	
	public double getTimeInSeconds()
	{
		double racetime = 0.00;
		if (super.getRaceTime().contains("m"))
		{
			char temp = super.getRaceTime().charAt(0);
			int pos = super.getRaceTime().indexOf("m");
			if (temp == '0')
			{
				racetime = Double.parseDouble(super.getRaceTime().substring(pos+1));
			}
			else 
			{
				String min = ""+temp;
				String sec = ""+super.getRaceTime().substring(pos+1);
				racetime = (Double.parseDouble(min)*60)+(Double.parseDouble(sec));				
			}
		}
		else
		{
			racetime = Double.parseDouble(super.getRaceTime());
		}
		return racetime;
	}
	
	public String toString()
	{
		String valid = "";
		boolean temp = isValid();
		if (temp = true)
		{
			valid = "Record is Valid";
		}
		else
		{
			valid = "Record is not valid";
		}
		return ""+super.toString()+" "+valid+" RaceTime: "+getTimeInSeconds()+"S";
	}
	
}
