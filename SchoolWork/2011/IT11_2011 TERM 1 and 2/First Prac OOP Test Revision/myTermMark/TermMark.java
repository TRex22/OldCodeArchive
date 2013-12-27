package myTermMark;

import javax.swing.JOptionPane;

public class TermMark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int learnerno = Integer.parseInt(JOptionPane.showInputDialog("Number of Learners in the class"));
		int test1 = Integer.parseInt(JOptionPane.showInputDialog("Total for Test 1"));
		int test2 = Integer.parseInt(JOptionPane.showInputDialog("Total for Test 2"));
		int test3 = Integer.parseInt(JOptionPane.showInputDialog("Total for Test 3"));
		String Highest = "";
		double HighestAvgPercent = 0.00;
		double sum1=0, sum2=0, sum3=0, sum=0;
		for (int i = 1; i<=learnerno;i++)

		{
			String name = JOptionPane.showInputDialog("Enter The learners full name");
			int mark1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark recieved for test 1"));
			int mark2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark recieved for test 2"));
			int mark3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark recieved for test 3"));

			Leraner objL = new Leraner();
			objL.setLearnerNo(i);
			objL.setFullName(name);
			objL.setTest1(test1, mark1);
			objL.setTest2(test2, mark2);
			objL.setTest3(test3, mark3);

			JOptionPane.showMessageDialog(null, objL.toString());
			sum1+=objL.getTest1();
			sum2+=objL.getTest2();
			sum3+=objL.getTest3();
			sum+=objL.calcAve();
			if (objL.calcAve()>HighestAvgPercent)
			{
				Highest = objL.toString();
				HighestAvgPercent = objL.calcAve();
			}

		}
		sum1 = sum1/learnerno;
		sum2 = sum2/learnerno;
		sum3 = sum3/learnerno;
		sum = sum/learnerno;
		JOptionPane.showMessageDialog(null, "The average for test 1			:"+sum1+" " +
				"\nThe Average for test 2			:"+sum2+"" +
						"\nThe Average for test 3			:"+sum3+"" +
								"\nThe Average for all the tests			:"+sum+"" +
										"\nThe Highest Average Percentage was "+Highest);


	}

}
