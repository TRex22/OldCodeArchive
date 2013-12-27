package myCalcNumbers;

import javax.swing.JOptionPane;

public class Add2RealNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sNum1 = JOptionPane.showInputDialog( "Enter Real Number 1" );
		String sNum2 = JOptionPane.showInputDialog( "Enter Real Number 2" );
		double dNum1 = Double.parseDouble(sNum1);
		double dNum2 = Double.parseDouble(sNum2);
		//add numbers together
		double rSum = dNum1 + dNum2;
		double rProduct = dNum1 * dNum2;
		double rSubtract = dNum1 - dNum2;
		double rDivision = dNum1 / dNum2;
		JOptionPane.showMessageDialog(null,"Real Number 1 IS: "+dNum1
							          +"\nReal Number 2 IS: "+dNum2
							          +"\n"+dNum1+" + "+dNum2 +" = "+ rSum 
							          +"\n"+dNum1+" - "+dNum2+" = "+ rSubtract
							          +"\n"+dNum1+" * "+dNum2+" = "+ rProduct
							          +"\n"+dNum1+" / "+dNum2+" = " +rDivision);
	
	}

}
