package myPerson;

public class Person {
//fields = properties/attributes
	//=global variables
	//=instance variables

// Access modifiers 
	//(-) [signs given in exams] private
	//(+)public = accesiable in any class
	//(#) protected = accessible in any class in the same package

	private String name;
	private String telnum;
	
	//constructor = a mehod that gives your fields default values
	//always public plus the name of the class
	//default constructor = programmer chooses the default values
	
	public Person() //default constr
	{
		name = "anonops";
		telnum = "0000000000";
		
	}
	
	//paramitised constructor = recieves values as parameters
	//and saves it into the fields
	public Person (String n, String t)
	{
		name=n;
		telnum=t;
	}
	
	//accesor and mutator methods
	//accessor method = getter method: returns the field
	//Mutator method = setter method:
	//recieves a value in a parameter and stores it in the field
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
	
	//other methods
	//public/private/protected DataTypeThatYouReturn NameOfTheMethod
	//toString method = generate a string with all the fields' information
	//and returns it.
	
	public String toString()
	{//this is overwriting the toString method that ALL classes have
		return name +" TEL: "+telnum;
	}

}
