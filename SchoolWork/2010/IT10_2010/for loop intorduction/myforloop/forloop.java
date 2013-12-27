package myforloop;

import javax.swing.JOptionPane;

public class forloop {

	/**
	 * 
	 */
	public static void main(String[] args) {
		String output = "";
		int learners = Integer.parseInt(JOptionPane.showInputDialog("NUMBER OF stuff"));
		int sum=0;
		for (int i=1;i<=learners;i++)
		{
			int number = Integer.parseInt(JOptionPane.showInputDialog("ENTER: "));
			output +=number+"\n";
			sum=sum+number;
		}
		System.out.println("Number of Learners:"+learners+
				"\n"+output+
				"\nThe Sum Is: "+sum);
	
	}

}
