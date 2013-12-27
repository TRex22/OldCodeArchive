package myFINAL;

public class ZNLicence extends NationalLicense{

	public ZNLicence(int y, String l)
	{
		super (y, l);

	}

	public double getLicenseFee()
	{
		double LF = super.getLicenseFee();

		if (this.getYear() < 2000)
		{
			return LF +50;
		}
		else
		{
			return LF;
		}
	}


}
