package myBank;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	public SavingsAccount(String o, String aC, String IDN, double ba, double iR) {
		super(o, aC, IDN, ba);
		interestRate = iR;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String toString()
	{
		return ""+super.getOwner()+"\t"+super.getAccCode()+"\t"+super.getIDNo()+"\t"+"R"+super.getBalance()+"\t"+interestRate;
	}
}
