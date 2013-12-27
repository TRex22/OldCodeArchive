package myProgram;

public class RaceResult {
	private String athlete;
	private String country;
	private int position;
	private String raceTime;
	
	//paramatrised Constructor
	public RaceResult (String a, String c, int p, String r)
	{
		athlete =a;
		country =c;
		position =p;
		raceTime =r;
	}
	//getters and setters
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
	public String getTime() {
		return raceTime;
	}
	public void setTime(String raceTime) {
		this.raceTime = raceTime;
	}
	
	//other methods
	public String toString()
	{
		return athlete+" ("+country+"): "+position;
	}
	
	
}
