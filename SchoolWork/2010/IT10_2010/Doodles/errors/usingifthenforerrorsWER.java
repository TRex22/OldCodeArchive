package errors;

import javax.swing.JOptionPane;

public class usingifthenforerrors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pass = JOptionPane.showInputDialog( "ENTER Number" );
		int iPass = Integer.parseInt(pass);
		if (iPass == 45)  {JOptionPane.showMessageDialog(null, "ENter");}
		else
		{JOptionPane.showMessageDialog(null, "Error You May Not Enter Retard");
		
		}
	System.out.println("test");
		}
		
	
	}


