package myDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
public class GUIDatabase extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	DB objDB = new DB();
	private JMenuBar jMenuBar1;
	private JMenuItem btnDisplayAllCDs;
	private JMenuItem Exit;
	private JScrollPane jScrollPane1;
	private JMenuItem jMenuItem1;
	private JTextArea txtArea;
	private JMenu jMenu2;
	private JMenu jMenu1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUIDatabase inst = new GUIDatabase();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public GUIDatabase() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("POO");
			getContentPane().setForeground(new java.awt.Color(255,0,0));
			getContentPane().setBackground(new java.awt.Color(128,128,255));
			this.setFont(new java.awt.Font("Arial Narrow",0,10));
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(12, 54, 487, 318);
				{
					txtArea = new JTextArea();
					jScrollPane1.setViewportView(txtArea);
					txtArea.setBounds(12, 31, 487, 318);
					txtArea.setWrapStyleWord(true);
					txtArea.setTabSize(25);
					txtArea.setDoubleBuffered(true);
				}
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("File");
					{
						btnDisplayAllCDs = new JMenuItem();
						jMenu1.add(btnDisplayAllCDs);
						btnDisplayAllCDs.setText("Display All CDs");
						btnDisplayAllCDs.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("btnDisplayAllCDs.actionPerformed, event="+evt);
								txtArea.setText(objDB.display("SELECT * FROM tblCD"));
							}
						});
					}
					{
						Exit = new JMenuItem();
						jMenu1.add(Exit);
						Exit.setText("Exit");
						Exit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("Exit.actionPerformed, event="+evt);
								System.exit(1);
							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("About");
					{
						jMenuItem1 = new JMenuItem();
						jMenu2.add(jMenuItem1);
						jMenuItem1.setText("??????");
						jMenuItem1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("jMenuItem1.actionPerformed, event="+evt);
								//TODO add your code for jMenuItem1.actionPerformed
							JOptionPane.showMessageDialog(null, "HJGEIGFY*#*^R*FB\njbkrsfbkdbfkb\njkhsdkjhfbkdsbfkudshkjgbfk\nushfiubwefgiubj\nsidfgibfgbt87uib");
							paintAll(getGraphics());

							}
						});
					}
				}
			}
			pack();
			this.setSize(538, 432);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
