package myPerson;

public class Person {
	//This contains trhe information of 1 person
	
	//fields
	private String name;
	private String telnum;
	
	//constructor parm
	public Person (String n, String t)
	{
		name=n;
		telnum = t;
	}

	//accessor and mutator
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	
	public String toString (){
		return name +"\t"+telnum;
	}
	
}
