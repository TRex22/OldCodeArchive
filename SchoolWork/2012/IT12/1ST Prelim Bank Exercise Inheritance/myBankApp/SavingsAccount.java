package myBankApp;

public class SavingsAccount extends BankAccount {
	private int interestRate;
	public SavingsAccount(String o, int aC, String ID, double b, int IR) {
		super(o, aC, ID, b);
		interestRate = IR;
		
		
		
	}
	public String toString()
	{
		return ""+super.getOwner()+"\t\t"+super.getAccCode()+"\t\t"+super.getIDNo()+"\t\t"+
				super.getBalance()+"\t\t"+interestRate;
	}

}
