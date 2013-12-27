package myfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LicenseManager {
	//fields
	private NationalLicense[] arrNL = new NationalLicense[200];
	private int count;
	//default constructor
	public LicenseManager ()
	{
		//read the license.txt using scanner objects
		try {
			Scanner scFile = new Scanner (new File("license.txt"));
			
			//run loop while scFile has data
			while (scFile.hasNext())
			{
				//scan each line and use delimeter
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				int year = scLine.nextInt();
				String license = scLine.next();
				
				if(license.substring(6).equalsIgnoreCase("GP"))
				{
					arrNL[count] = new GPLicense(year, license);
				}
				else
				{
					arrNL[count] = new ZNLicense(year, license);
				}
				
				//close scLine stream
				scLine.close();
				count++;
			}
		
			//close the streams
			scFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//methods
	public int getTotalLicenceFees()
	{
		int fees = 0;
		for (int i = 0; i<count; i++)
		{
			if (arrNL[i] instanceof GPLicense)
			{
				GPLicense temp = (GPLicense)arrNL[i];
				fees += temp.getLicenseFee();
			}
			else if (arrNL[i] instanceof ZNLicense)
			{
				ZNLicense temp = (ZNLicense)arrNL[i];
				fees += temp.getLicenseFee();
			}
			else
			{
				fees += arrNL[i].getLicenseFee();
			}
		}
		
		return fees;
	}
	
	public String getGPLicenseList()
	{
		String out = "";
		for (int i =0; i <count;i++)
		{
			if (arrNL[i] instanceof GPLicense)
			{
				GPLicense temp = (GPLicense)arrNL[i];
				out += temp.toString()+"\n";
			}
		}
		
		
		return out;
	}
	
	public String HighestFees()
	{
		String out = "";
		int highest = 0;
		NationalLicense temp;
		for (int i =0; i<count; i++)
		{
			if (arrNL[i] instanceof GPLicense)
			{
				temp = (GPLicense)arrNL[i];
			}
			else if (arrNL[i] instanceof ZNLicense)
			{
				temp = (ZNLicense)arrNL[i];
			}
			else
			{
				temp = arrNL[i];
			}
			if (temp.getLicenseFee() > highest)
			{
				highest = temp.getLicenseFee();
				out = temp.toString();
			}
		}
		
		
		
		return out;
	}
	
	
	
	
}
