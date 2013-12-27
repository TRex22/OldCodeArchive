package myBankApp;

public class BankAccount {
	//fields
	private String owner;
	private int accCode;
	private String IDNo;
	private double balance;
	
	//paramatrised consructor
	public BankAccount (String o, int aC, String ID, double b)
	{
		owner = o;
		accCode = aC;
		IDNo = ID;
		balance = b;
	}
	
	//accessor getter
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
	public String toString()
	{
		
		
		return ""+owner+"\t\t"+accCode+"\t\t"+IDNo+"\t\t"+ balance;
	}
	
	
}
