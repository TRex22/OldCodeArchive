package myAd;

import javax.swing.JOptionPane;

public class UseAdvertisement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of ad"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of ad"));
		String AdContents = JOptionPane.showInputDialog("Enter Contents of Ad");
		Advertisement ad = new Advertisement(width, height, AdContents);
		//System.out.println(ad.calcLetterCost());
		JOptionPane.showMessageDialog(null, ad.toString());




	}

}