package myWebBrowser;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JRootPane;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//JRootPane browser = new JRootPane();
		//new JFrame("Browser").add(browser);
		//browser.load("www.google.com");
		//browser.setEnabled(true);
		//browser.getGraphics();
		
		System.out.println("Begin.");
		try {
			Runtime.getRuntime().exec("Catch-22sum.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Line.");

	}

}
