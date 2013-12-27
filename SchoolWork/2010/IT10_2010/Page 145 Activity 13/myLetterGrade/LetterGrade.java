package myLetterGrade;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class LetterGrade {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int mark = Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR MARK"));
		mark = mark/10;
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		char grade = 'X';
		frame.setSize(200,200);
		frame.add(txt);
		frame.setTitle("YOUR CRAP MARK");
		switch (mark)
		{
		case 10:
		case 9:
		case 8:
			grade = 'A';
			break;
		case 7:
			grade = 'B';
			break;
		case 6:
			grade = 'c';
			break;
		case 5:
			grade = 'D';
			break;
		case 4:
			grade = 'E';
			break;
		case 3: case 2: case 1: case 0:
			grade = 'F';
			break;

		}
		if (grade =='X')
		{
			JOptionPane.showMessageDialog(null, "Invalid Mark");
		}
		else
		frame.setVisible(true);
		txt.setText("Your mark of "+mark+"\nis equal to "+grade);
		





	}

}
