 package myfinal;

public class ZNLicense extends NationalLicense{

	public ZNLicense(String LN, int y) {
		super(LN, y);
		
	}
	
	
	public double getLicenseFee()
	{
		double fee = super.getLicenseFee();
		if (super.getYear() < 1999)
		{
			fee += 50;
		}
		
				
		return fee;
	}
	
}
