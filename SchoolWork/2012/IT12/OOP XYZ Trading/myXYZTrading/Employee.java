package myXYZTrading;

public class Employee {
	//fields
	private String firstname;
	private String surname;
	private String DOB;
	private double salary;
	private int dependent;
	private char medAid;
	
	
	public Employee (
			String f, String s, String d, int i, int dep, char m)
	{
		firstname = f;
		surname = s;
		DOB = d;
		salary = i;
		dependent = dep;
		medAid = m;
	}
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		firstname = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDependent() {
		return dependent;
	}
	public void setDependent(int dependent) {
		this.dependent = dependent;
	}
	public char getMedAid() {
		return medAid;
	}
	public void setMedAid(char medAid) {
		this.medAid = medAid;
	}
	
	//other methods
	private double calcNettSalary()
	{
		double nett = salary/12-calcTax();
		
		return nett;
	}
	private double calcTax()
	{
		double tax = salary/12*30.0/100;
		
		return tax;
	}
	private double calcPension ()
	{
		return salary/12*7.5/100;
	}
	private double calcMedAid()
	{
		double med = 0;
		if (medAid=='Y')
		{
			med =1500+ 300*dependent;
		}
		return med;
	}
	public String displayPaySlip()
	{
		return firstname+"\ndob: "+DOB+"\nmonthly salary: R"+salary/12+"\ntax: R"+calcTax()+"\npension: R"+calcPension()+"\nmedical aid: R"+getMedAid()+"\nfinal nett slalary: R"+calcNettSalary();
				
	}
}
