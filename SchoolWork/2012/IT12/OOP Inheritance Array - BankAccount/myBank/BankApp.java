package myBank;

import javax.swing.JOptionPane;

public class BankApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountArray obj = new AccountArray();
		char choice = 'X';
		
		do{
		choice = JOptionPane.showInputDialog("Chosse BITCH:\n" +
				"A: Search acc\n" +
				"B:View all acc\n" +
				"C: Deposit\n" +
				"X: EXIT").toUpperCase().charAt(0);
		switch(choice){
		case 'A':
			String accountCode = JOptionPane.showInputDialog("Enter the account code you are looking for");
			if (obj.search(accountCode)==-1)
			{
				JOptionPane.showMessageDialog(null, "Account was not found");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Account was found");
				
			}
			
			break;
		case 'B':
			JOptionPane.showMessageDialog(null, obj.toString());
			
			break;
		case 'C':
			
			accountCode = JOptionPane.showInputDialog("Enter the account code you are depositing money into");
			int position = obj.search(accountCode);
			if (position==1)
			{
				JOptionPane.showMessageDialog(null,  "account code is incorrect");
			}
			else
			{
				double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to deposit"));
				obj.deposit(position, amount);
			}
			break;
		case 'X':break;
		default: JOptionPane.showMessageDialog(null, "BOOBIES ;)");
		}
		
		}while(choice != 'X');
		

	}

}
