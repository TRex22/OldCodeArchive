package myFINAL;

import javax.swing.JOptionPane;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LicenseManager LM = new LicenseManager();
		
		JOptionPane.showMessageDialog(null, ("Total Licences:\n" + LM.totalLicenseFees()
				+"\n"+
		"GP List:\n" + LM.getGPLicenseList()+
		"Highest Licence:\n" + LM.getHighestLF()) );

	}

}
