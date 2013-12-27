package myProgram;

public class RaceResult {
	private String athlete;
	private String country;
	private int position;
	private String raceTime;
	
	//param constructor
	public RaceResult (String athlete, String country, int position, String raceTime)
	{
		this.athlete = athlete;
		this.country = country;
		this.position = position;
		this.raceTime = raceTime;
	}
	//accessor and getter
	public String getAthlete() {
		return athlete;
	}
	public void setAthlete(String athlete) {
		this.athlete = athlete;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getRaceTime() {
		return raceTime;
	}
	public void setRaceTime(String raceTime) {
		this.raceTime = raceTime;
	}
	
	public String toString()
	{
		return ""+athlete+" ("+country+"): "+position+"";
	}
	
	
}
