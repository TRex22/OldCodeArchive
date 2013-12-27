package myBank;

public class BankAccount {
	
	private String owner;
	private int accCode;
	private String IDNo;
	private double balance;
	
	//paramatrised constructor
		public BankAccount (String o, int acc, String ID, double b)
		{
			owner = o;
			accCode =acc;
			IDNo = ID;
			balance =b;
		}
	
	//Accessor and mutoator methods
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getAccCode() {
		return accCode;
	}
	public void setAccCode(int accCode) {
		this.accCode = accCode;
	}
	public String getIDNo() {
		return IDNo;
	}
	public void setIDNo(String iDNo) {
		IDNo = iDNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//other methods
	
	public String toString ()
	{
		
		return ""+owner+"\t"+accCode+"\t"+IDNo+"\t"+balance;
	}
	
	
}
