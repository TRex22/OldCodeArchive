package myArithmetic;

public class Arithmetic {

	//fields
	//public = shared to anyone
	//protected = shared to package
	//private if not shared
	private int num1;
	private double num2;
	//default constructor method
	//purpose give the fields a default value
	//it is called when you instanciate a method of the class
	//it ALWAYS has the same name as the class
	//leave out void/type
	//It is ALWAYS public/protected
	public Arithmetic()
	{
		setNum1(0);
		setNum2(0);

	}
	//parameterised constructor
	//that recieved two numbers
	//and save it into the fields

	public Arithmetic(int n1, double n2)
	{
		num1=n1;
		num2=n2;
	}



	//setter method = Mutator method = changes num 1
	//Recieves num1 from the other class and saves it in num1
	public void setNum1(int n1) {
		this.num1 = n1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getNum2() {
		return num2;
	}

	//to String
	//purpose: to create an output string that gets returned
	//is shared = public
	//it returns a String
	//name is toString ()

	public String toString()
	{
		return "WHY?\nNum 1: "+num1+"\nNum 2: "+num2;

	}


}
