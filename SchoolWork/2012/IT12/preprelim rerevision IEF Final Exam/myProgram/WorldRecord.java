package myProgram;

public class WorldRecord extends OlympicRecord{

	public WorldRecord(String athlete, String country, int position,
			String raceTime) {
		super(athlete, country, position, raceTime);
		
	}
	
	public String toString()
	{
		return super.toString()+" WORLD RECORD!";
	}

}
