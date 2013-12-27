package myAd;

import java.text.DecimalFormat;

public class Advertisement {

	private int width;
	private int height;
	private String ad;

	public Advertisement (int w, int h, String a)
	{
		width = w;
		height = h;
		ad = a;
	}

	public double calcSizeCost()
	{
		double sqcost = 0.00;
		double sqmeter = (width*height);
		sqcost = (sqmeter*10);
		return sqcost;
	}
	public double calcLetterCost ()
	{
		double lcost = 0.00;
		int noWords = 1;//
		int noDigits = 0;//
		int noVowels = 0;//
		int noConst =0;//
		int noSpecial =0;//
		for (int i =0; i<ad.length();i++)
		{
			char temp = ad.charAt(i);
			if (Character.isWhitespace(temp))
			{
				noWords ++;
			}
		}
		for (int i =0; i<ad.length();i++)
		{
			char temp = ad.charAt(i);
			if (Character.isDigit(temp))
			{
				noDigits ++;
			}
		}
		for (int i =0; i<ad.length();i++)
		{
			char temp = ad.charAt(i);

			String vowels = "AEIOUaeiou";

			if (vowels.indexOf(temp)>=0 )
			{
				noVowels ++;
			}
		}
		for (int i =0; i<ad.length();i++)
		{
			char temp = ad.charAt(i);

			String vowels = "AEIOUaeiou";

			if (Character.isLetter(temp)&& vowels.indexOf(temp)<0&&!Character.isWhitespace(temp)&&!Character.isDigit(temp) )
			{
				noConst ++;
			}
		}
		for (int i =0; i<ad.length();i++)
		{
			char temp = ad.charAt(i);
			if (!Character.isWhitespace(temp)&&!Character.isLetterOrDigit(temp) )
			{
				noSpecial ++;
			}
		}
		double WCost = (noWords*1);
		double VCost = (noVowels * 0.20);
		double CCost = (noConst * 0.30);
		double nCost = (noDigits * 0.10);
		double SCost = (noSpecial * 0.50);
		lcost = (WCost+VCost+CCost+nCost+SCost);
		return lcost;
	}
	public String toString()
	{
		String message = "";
		double cost = calcSizeCost()+calcLetterCost();
		DecimalFormat rand = new DecimalFormat("R#.00");
		message = "This advertisement will cost "+rand.format(cost);
		return message;
	}

}
