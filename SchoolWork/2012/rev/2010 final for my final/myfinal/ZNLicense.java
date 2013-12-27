package myfinal;

public class ZNLicense extends NationalLicense{

	public ZNLicense(int y, String l) {
		super(y, l);
		
	}
	
	public int getLicenseFee()
	{
		if (super.getYear()<2000)
		{
			return super.getLicenseFee()+50;
		}
		else
		{
			return super.getLicenseFee();
		}
	}
	
	
	
}
