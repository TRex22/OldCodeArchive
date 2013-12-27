package myWordGame;

import javax.swing.*;

public class UseWordGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instaciate object
		WordGame objWG = new WordGame();
		JFrame frame = new JFrame();
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setSize(400,400);
		frame.setTitle("WordGame");
		boolean valid = false;
		objWG.setPrevious(JOptionPane.showInputDialog("Enter a Word"));
		do {
		objWG.setCurrent(JOptionPane.showInputDialog("Enter a Word"));


		if (valid == false)
		{
			txt.setText("The current word does not start with the last letter\n"+
					"of the previous word. \n Game will now terminate!!");

		}
		//make the current word the previous word for the next set
		objWG.setPrevious(objWG.getCurrent());
		//stop when count is 10
		//i.e. go in loop while it is less than 10
		//and stop when invalid entry is made
		//i.e. go into loop only if the entry was valid
	}while(objWG.getCount()<10&&objWG.isValid()==true);

		frame.setVisible(true);
		txt.setText("You Entered "+objWG.getCount()+"\n"+"Score is: "+objWG.getScore());
		JOptionPane.showMessageDialog(null, "" );
		System.exit(0);
	}
}
