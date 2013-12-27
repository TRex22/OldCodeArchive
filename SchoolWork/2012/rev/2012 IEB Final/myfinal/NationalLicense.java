package myfinal;

public class NationalLicense {
	//fields
	private String LicenseNo;
	private int year;
	
	//constructor
	public NationalLicense (String LN, int y)
	{
		LicenseNo = LN;
		year = y;
	}
	
	
	//Accessor and Setter
	public String getLicenseNo() {
		return LicenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getLicenseFee ()
	{
		return 250.00;
	}
	public String toString()
	{
		return ""+LicenseNo+"\t"+getLicenseFee();
	}
	
}
