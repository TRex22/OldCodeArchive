package myPAT;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class main extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JMenuItem Open;
	private JPanel jPanel1;
	private JMenu Help;
	private JMenuItem Paste;
	private JMenuItem Options;
	private JMenuItem Cut;
	private JMenuItem Copy;
	private JMenuItem About;
	private JMenu Edit;
	private JMenu jMenu1;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				main inst = new main();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public main() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Geo Info Access");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("File");
					{
						Open = new JMenuItem();
						jMenu1.add(Open);
						Open.setText("Open");
					}
				}
				{
					Edit = new JMenu();
					jMenuBar1.add(Edit);
					Edit.setText("Edit");
					{
						Copy = new JMenuItem();
						Edit.add(Copy);
						Copy.setText("Copy");
					}
					{
						Cut = new JMenuItem();
						Edit.add(Cut);
						Cut.setText("Cut");
					}
					{
						Paste = new JMenuItem();
						Edit.add(Paste);
						Paste.setText("Paste");
					}
					{
						Options = new JMenuItem();
						Edit.add(Options);
						Options.setText("Options");
					}
				}
				{
					Help = new JMenu();
					jMenuBar1.add(Help);
					Help.setText("Help");
					{
						About = new JMenuItem();
						Help.add(About);
						About.setText("About");
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
