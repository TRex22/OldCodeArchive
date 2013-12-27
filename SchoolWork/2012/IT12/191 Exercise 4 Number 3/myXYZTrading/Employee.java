package myXYZTrading;

public class Employee {
	private String firstName;
	private String surname;
	private String dob;//ccyymmdd
	private Double salary;
	private int dependent;
	private char medAid;
	
	public Employee (String f, String s, String d, double sal, int de, char mA)
	{
		setFirstName(f);
		setSurname(s);
		setDob(d);
		setSalary(sal);
		setDependent(de);
		setMedAid(mA);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
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
	
	public String getDate()
	{
		return ""+dob.substring(6)+"/"+dob.substring(4,6)+"/"+dob.substring(0,4);
	}
	public double calcNettSalary()
	{
		double MSal = salary/12;
		double netSal = MSal-(calcTax()+calcPension()+calcMedAid());
		return netSal;
	}

	public double calcMedAid() 
	{
		double med = 0.00;
		if (medAid == 'Y')
		{
			med= 1500+(300*dependent);
		}
		return med;
	}

	public double calcPension() 
	{
		double MSal = salary/12;
		return (MSal*30)/100;
	}

	public double calcTax() 
	{
		double MSal = salary/12;
		return (MSal*7.5)/100;
	}
	public String displayPaySlip ()
	{
		double MSal = salary/12;
		return "Name: "+firstName+" "+surname+" DOB: "+getDate()+" Monthly Salary: R"+MSal+" Tax: R"+calcTax()+" Pension: R"+calcPension()+" MedAid: R"+calcMedAid()+" Net MSal: R"+calcNettSalary();
	}
	
	
}
