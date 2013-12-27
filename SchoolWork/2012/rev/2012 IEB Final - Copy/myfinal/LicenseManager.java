package myfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LicenseManager {
	
	NationalLicense[] arrNL = new NationalLicense[200];
	int count = 0;
	
	public LicenseManager ()
	{
		try {
			Scanner scFile = new Scanner (new File("license.txt"));
			
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				int year = scLine.nextInt();
				String LicenseNo = scLine.next();
				if (LicenseNo.substring(LicenseNo.length()-2).equals("GP"))
				{
					arrNL[count] = new GPLicense(LicenseNo, year);
				}
				else
				{
					arrNL[count] = new ZNLicense(LicenseNo, year);
				}
				
				count++;
				scLine.close();
			}
			
			
			scFile.close();
		} catch (FileNotFoundException e) {
			// where errs are caught, tried and sentenced to death ie executed
			e.printStackTrace();
		}
	}
	
	
}
