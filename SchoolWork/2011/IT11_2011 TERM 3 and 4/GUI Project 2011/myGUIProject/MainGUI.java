package myGUIProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
public class MainGUI extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	DBCode objDB = new DBCode ();
	private JMenuBar jMenuBar1;
	private JMenuItem Query9;
	private JMenuItem Query8;
	private JScrollPane jScrollPane1;
	private JMenuItem Query7;
	private JMenuItem Query6;
	private JMenuItem Query5;
	private JMenuItem Query4;
	private JMenuItem Query3Complex;
	private JMenuItem Query2Complex;
	private JMenu HelpMenu;
	private JMenuItem AboutMnu;
	private JTextField txtBY;
	private JTextArea txtArea;
	private JMenuItem Query1Complex;
	private JMenu MnuDBTasks;
	//private JMenuItem MusicMnu;
	private JMenuItem Quit;
	private JMenu FileMenu;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainGUI inst = new MainGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MainGUI() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(155,155,255));
			this.setUndecorated(true);
			{
				txtBY = new JTextField();
				getContentPane().add(txtBY);
				txtBY.setText("Made By: Jason Chalom 11S");
				txtBY.setBounds(372, 486, 170, 28);
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(6, 10, 875, 465);
				{
					txtArea = new JTextArea();
					jScrollPane1.setViewportView(txtArea);
					txtArea.setBounds(6, 7, 877, 469);
					txtArea.setTabSize(16);
				}
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					FileMenu = new JMenu();
					jMenuBar1.add(FileMenu);
					FileMenu.setText("File");
					{
						MnuDBTasks = new JMenu();
						FileMenu.add(MnuDBTasks);
						MnuDBTasks.setText("Database Tasks");
						{
							Query1Complex = new JMenuItem();
							MnuDBTasks.add(Query1Complex);
							Query1Complex.setText("Show Sales Data");
							Query1Complex.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									System.out.println("Query1Complex.actionPerformed, event="+evt);
									//TODO add your code for Query1Complex.actionPerformed
									//objDB.dispQuery1(Query1Complex);
									txtArea.setText(objDB.Display(""+
											"SELECT tblSales.SalesID, tblSales.ClientID, tblClient.Name, tblSales.StockID, tblStock.ItemName, tblStock.Price, tblSales.AmountPurchases, [AmountPurchases]*[Price] AS TotalSpent"+
									" FROM tblStock INNER JOIN (tblClient INNER JOIN tblSales ON tblClient.ClientID=tblSales.ClientID) ON tblStock.StockID=tblSales.StockID;"));
								}
							});
						}
						{
							Query2Complex = new JMenuItem();
							MnuDBTasks.add(Query2Complex);
							Query2Complex.setText("Show Which Items are Returned the Most");
							Query2Complex.setBounds(269, 0, 97, 21);
							Query2Complex.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									System.out.println("Query2Complex.actionPerformed, event="+evt);
									//TODO add your code for Query1Complex.actionPerformed
									//objDB.dispQuery1(Query1Complex);
									txtArea.setText(objDB.Display(""+"SELECT tblStock.StockID, tblStock.ItemName, tblStock.Quantity, tblStock.AmountReturns, tblStock.Price"+" "+
									"FROM tblStock WHERE tblStock.Quantity >10 AND tblStock.Price >= 500 AND  tblStock.AmountReturns > 1 ORDER BY tblStock.StockID;"));
								}});
						}
						{
							Query3Complex = new JMenuItem();
							MnuDBTasks.add(Query3Complex);
							Query3Complex.setText("Show How Much is Lost by Returns");
							Query3Complex.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									System.out.println("Query3Complex.actionPerformed, event="+evt);
									//TODO add your code for Query1Complex.actionPerformed
									//objDB.dispQuery1(Query1Complex);
									txtArea.setText(objDB.Display(""+
									"SELECT tblStock.StockNo, tblStock.BarCodeNumber, tblStock.ItemName, tblStock.AmountReturns, [AmountReturns]*[Price] AS TotalLost FROM tblStock;"));

								}
							});
						}}

					{
						Quit = new JMenuItem();
						FileMenu.add(Quit);
						Quit.setText("Quit");
						Quit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								//System.out.println("Quit.actionPerformed, event="+evt);
								//TODO add your code for Quit.actionPerformed
								System.exit(1);
							}
						});
					}
				}
				{
					HelpMenu = new JMenu();
					jMenuBar1.add(HelpMenu);
					HelpMenu.setText("Help");
					{
						AboutMnu = new JMenuItem();
						HelpMenu.add(AboutMnu);
						AboutMnu.setText("About");
						AboutMnu.setBounds(-39, 59, 116, 21);
						AboutMnu.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("AboutMnu.actionPerformed, event="+evt);
								//TODO add your code for AboutMnu.actionPerformed
								JOptionPane.showMessageDialog(null, "Database Project" +
										"\nMade by Jason Chalom" +
										"\nCopyright 2011" +
										"\nFor King David High Linksfield IT Department" +
										"\nGrade 11 IT Project"+
								"\nContact: jasonchalom@yahoo.co.uk");
							}
						});
					}
				}
			}
			pack();
			this.setSize(898, 530);
		} catch (Exception e) {
			//add your error handling code here
			e.printStackTrace();
		}
	}

	/**
	 * Auto-generated method for setting the popup menu for a component
	 */
	private void setComponentPopupMenu(final java.awt.Component parent, final javax.swing.JPopupMenu menu) {
		parent.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent e) {
				if(e.isPopupTrigger())
					menu.show(parent, e.getX(), e.getY());
			}
			public void mouseReleased(java.awt.event.MouseEvent e) {
				if(e.isPopupTrigger())
					menu.show(parent, e.getX(), e.getY());
			}
		});
	}

}
