package myfinal;

public class GPLicense extends NationalLicense{

	public GPLicense(int y, String l) {
		super(y, l);
		
	}
	
	//methods
	public int getLicenseFee()
	{
		double LicenseFee = super.getLicenseFee()*1.2;
		String vowels = "AEIOUaeiou";
		boolean personalised = false;
		for (int i = 0; i <3; i++)
		{
			if(vowels.indexOf(super.getLicenseNo().charAt(i))>=0)
			{
				LicenseFee *= 2;
				personalised = true;
			}
		}
		if (personalised)
		{
			int numbers = Integer.parseInt(super.getLicenseNo().substring(3,6));
			LicenseFee += numbers;
		}
		
		return (int)LicenseFee;
	}
	
}
