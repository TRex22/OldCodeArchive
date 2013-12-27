package myBank;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(String o, int acc, String ID, double b, double IR) {
		super(o, acc, ID, b);
		interestRate = IR;
		
	}

	public String toString()
	{
		return ""+super.getOwner()+"\t"+super.getAccCode()+"\t"+super.getIDNo()+"\t"+super.getBalance();
	}

}
