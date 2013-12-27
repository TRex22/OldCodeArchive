package inputexception;

import javax.swing.JOptionPane;

public class inputexception {

	/**
	 * @param args
	 * used activity 4 page 40 code just left out
	 * * + and -
	 * leepoint for java notes
	 */
	public static void main(String[] args) {
		//ctrl a select all then ctrl i indent
		try{
			String sNum1 = JOptionPane.showInputDialog( "Enter Real Number 1" );
			String sNum2 = JOptionPane.showInputDialog( "Enter Real Number 2" );
			int iNum1 = Integer.parseInt(sNum1);
			int iNum2 = Integer.parseInt(sNum2);
			//add numbers together
			//double rSum = dNum1 + dNum2;
			//double rProduct = dNum1 * dNum2;
			//double rSubtract = dNum1 - dNum2;
			double rDivision = (double)iNum1 / iNum2;
			JOptionPane.showMessageDialog(null,"Real Number 1 IS: "+iNum1
					+"\nReal Number 2 IS: "+iNum2
					// +"\n"+dNum1+" + "+dNum2 +" = "+ rSum 
					// +"\n"+dNum1+" - "+dNum2+" = "+ rSubtract
					// +"\n"+dNum1+" * "+dNum2+" = "+ rProduct
					+"\n"+iNum1+" / "+iNum2+" = " +rDivision);

		}	catch (NumberFormatException x)
		{
			//system error
			System.err.println("Why am I not working properly?");
		}

	}
}