package myEmployee;

public class Employee {

	private int hWork;
	private double hSalary;
	public Employee ()
	{
		hWork =10;
		hSalary = 20.00;
	}
	public void sethWork(int hWork) {
		this.hWork = hWork;
	}
	public int gethWork() {
		return hWork;
	}
	public void sethSalary(double hSalary) {
		this.hSalary = hSalary;
	}
	public double gethSalary() {
		return hSalary;
	}

	public double calcPay (int hMonth)
	{

		double Pay = 0.00;
		if (hWork == hMonth)
		{
			Pay = hWork*hSalary;
		}


		else if(hWork > hMonth)
		{
			int hoursOver = hWork-hMonth;
			Pay = (hMonth*hSalary)+(hoursOver*hSalary*2);
		}

		else if (hWork < hMonth)
		{
			Pay = hWork*hSalary;

		}
		return Pay;

	}
}







