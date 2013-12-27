package myfinal;

public class NationalLicense {
	//fields or properties
	private int year;
	private String licenseNo;
	
	//constructor
	public NationalLicense (int y, String l)
	{
		setYear(y);
		setLicenseNo(l);
	}

	
	//accessors
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	
	//methods
	public int getLicenseFee ()
	{
		return 250;
	}
	
	public String toString()
	{
		return ""+licenseNo+"\t"+getLicenseFee();
	}
	
	
	
}
