package myCoolApps;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class ClipboardDetails {

	/**
	 * http://www.codeproject.com/Articles/227478/Cool-Java-Programs
	 * @param args
	 * @throws IOException 
	 * @throws UnsupportedFlavorException 
	 */
	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
		if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			String text = (String)t.getTransferData(DataFlavor.stringFlavor);
			System.out.println("Current ClipBoard data is:\n"+text);
			text="I changed clipboard text";
			StringSelection ss = new StringSelection(text);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			System.out.println("Changed ClipBoard data is:\n"+text);
		}	
	}

}
