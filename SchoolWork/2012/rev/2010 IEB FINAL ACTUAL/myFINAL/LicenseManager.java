package myFINAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LicenseManager {
	private NationalLicense[] arrNL = new NationalLicense[200];
	private int count = 0;
	
	public LicenseManager()
	{
		try {
			//BufferedReader br = new BufferedReader(new FileReader("license.txt"));
			Scanner scFile = new Scanner (new File("license.txt"));
			while (scFile.hasNext())
			{
				Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("#");
				int year = scLine.nextInt();
				String license = scLine.next();
				if (license.substring(6).equalsIgnoreCase("GP"))
				{
					arrNL[count]= new GPLicense (year, license);
				}
				else
				{
					arrNL[count]= new ZNLicence (year, license);
				}
				
				count++;
				scLine.close();
			}
			scFile.close();
			//br.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public double totalLicenseFees()
	{
		double TF = 0.00;
		
		for (int i =0; i<count;i++)
		{
			if (arrNL[count] instanceof GPLicense )
			{
				GPLicense arrTemp = (GPLicense) arrNL[i];
				TF = arrTemp.getLicenseFee();
			}
			else if (arrNL[count] instanceof ZNLicence)
			{
				ZNLicence arrTemp = (ZNLicence) arrNL[i];
				TF = arrTemp.getLicenseFee();
			}
			else
			{
				TF = arrNL[i].getLicenseFee();
			}
		}		
		
		return TF;
	}
	
	public String getGPLicenseList()
	{
		String out = "";
		
		for (int i =0; i<count; i++)
		{
			if (arrNL[i] instanceof GPLicense)
			{
				GPLicense temp = (GPLicense) arrNL[i];
				out += temp.toString()+" ";
			}
		}
		
		
		return out;
	}
	
	public String getHighestLF()
	{
		String out = "";
		double highest = 0;
		
		for (int i = 0; i<count;i++)
		{
			NationalLicense temp;
			if(arrNL[i] instanceof GPLicense){
			temp = (GPLicense) arrNL[i];
			}
			else if(arrNL[i] instanceof ZNLicence){
			temp = (ZNLicence) arrNL[i];
			}
			else{
			temp=arrNL[i];
			}
			if(temp.getLicenseFee()>highest)
			{
			highest=temp.getLicenseFee();
			out=temp.toString();
			}
			
			
			
		}
		
		return out;
	}
	
	
	
	
}
