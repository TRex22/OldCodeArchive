package myLearner;

import javax.swing.JOptionPane;

public class LearnerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//parm constr
		
		String name = JOptionPane.showInputDialog("ENTER NAME");
		int term1 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 1"));
		int term2 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 2"));		
		int term3 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 3"));
	
		//instanciate it
		
		Learner learner = new Learner(name, term1, term2, term3);
	
		char menu = 'S';
		
		do
		{
			menu = JOptionPane.showInputDialog("Choose:\nN=new learner\nD=Display\nS=Stop").charAt(0);
			
			switch (menu)
			{
			case 'N':	
			 name = JOptionPane.showInputDialog("ENTER NAME");
			 term1 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 1"));
			 term2 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 2"));		
			 term3 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for Term 3"));
			 //use your mutator methods to change the information
			 learner.setFullname(name);
			 learner.setTerm1(term1);
			 learner.setTerm2(term2);
			 learner.setTerm3(term3);
		break;
			case 'D':	
				JOptionPane.showMessageDialog(null, learner.toString()+"\n AVG MARK: "+learner.getAvgerage()+"\nThe Highest Mark: "+learner.getHighestTerm()+"\n"+learner.getHighestTerm());
				break;
			case 'S':	menu = 'S' ;
			JOptionPane.showMessageDialog(null, "EYE");
			break;
			default: JOptionPane.showMessageDialog(null, "Invalid choice");
			}
		}while (menu != 'S'||menu != 'S');
	
	}

}
