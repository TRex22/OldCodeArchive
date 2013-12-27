package MemCheck;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.Frame;
import java.awt.Window;

public class MemCheck extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JPanel jPanel = null;
	private TextArea textArea = null;
	//  @jve:decl-index=0:visual-constraint="164,109"
	/**
	 * This is the default constructor
	 */
	public MemCheck() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(363, 285);
		this.setContentPane(getJContentPane());
		this.setTitle("MemCheck by Jason Chalom");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJButton(), BorderLayout.SOUTH);
			
			jContentPane.add(getTextArea(), BorderLayout.CENTER);
		}
		return jContentPane;
	}
	/**
	 * This method initializes textArea	
	 * 	
	 * @return java.awt.TextArea	
	 */
	private TextArea getTextArea() {
		if (textArea == null) {
			textArea = new TextArea();
			//int repeat=0;
			//long tot = 0;
			//long free = 0;
			//while (repeat==0)
			//{
				long tot = (((Runtime.getRuntime().totalMemory())/8)/1024);
				long free = (((Runtime.getRuntime().freeMemory())/8)/1024);
			//}
			textArea.setText(""+
					
					"totalMemory: "+(int)tot+" MB"
					+
					
					"\nfreeMemory: "+(int)free+" MB"
				
			);
			Runtime.getRuntime().gc();
		}
		return textArea;
	}
	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setPreferredSize(new Dimension(34, 50));
			jButton.setText("About ");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JOptionPane.showMessageDialog(null, "MemCheck By Jason Chalom" +
							"\nCopyRight 2010" +
							"\nVersion 0.1 Initial Test Version" +
							"\nTotal Memory Shows the total memory that Java Virtual Machine has access to" +
							"\nTherefore it is not exactly the amount of memory the computer has access to" +
							"\nBut should reflect what most high level programs could possibly use." +
							"\nPlease note the figures are rounded off and are an indication of buffer which" +
							"\ninclude page file and ram which is virtual memory in Windows" +
							"\nJava will try to use "+(((Runtime.getRuntime().maxMemory())/8)/1024)+" MB" +
									"\nA Garbage Collector included with Java Runtime is also run constantly when this program" +
									"\nis running.\n");
					
				}
			});
		}

		return jButton;
	}

	/**
	 * This method initializes window	
	 * 	
	 * @return java.awt.Window	
	 */
	
	}

	

	

  //  @jve:decl-index=0:visual-constraint="283,21"
