package myprep;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalcChange {

	/**
	 *
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		DecimalFormat deci = new DecimalFormat("R#00.00");
		String name = JOptionPane.showInputDialog("Enter name of product");
		double price = Integer.parseInt(JOptionPane.showInputDialog("Enter price of product"));
		double AmountPaid = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount that was paid"));

		double vat = (14/100*price);
		double change = AmountPaid-(price+vat);

		System.out.println("Item Name: "+name+"\nPrice of Item: "+deci.format(change)+"\nAmount Paid: "+AmountPaid+"\nChange after 14% VAT: "+change);

	}

}
