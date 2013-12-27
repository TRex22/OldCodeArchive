package averageMark;

import javax.swing.*;

public class AverageMark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int NumberOfLearners = Integer.parseInt(JOptionPane.showInputDialog("Number of Learners in Class"));
		int TotalOfTest = Integer.parseInt(JOptionPane.showInputDialog("Total OF Test"));
		int sum = 0;
		
		String output = "";
		for (int count = 1;count <= NumberOfLearners;count++)
		{
			String name = JOptionPane.showInputDialog("NAME");
			int mark = Integer.parseInt(JOptionPane.showInputDialog("MARK"));
			int percentage = (int) Math.round((mark*100)/TotalOfTest);
			output += "Name: "+name+" | Percentage Got: "+percentage+"%\n" ;
			sum+=percentage;
			
		}
		int average = (int) Math.round(sum/NumberOfLearners);
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setSize(500,500);
		frame.setVisible(true);
		txt.setText(output);
		txt.append("\nAVERAGE IS: "+average);
		
		
		
		
	}

}
