package myFINAL;

public class NationalLicense {
	//fields
	private int year;
	private String license;
	
	public NationalLicense(int y, String l)
	{
		setYear(y);
		setLicense(l);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	
	public double getLicenseFee()
	{
		return 250;
	}
	
	public String toString()
	{
		return ""+license+"\t"+getLicenseFee();
	}
	
	
	
}
