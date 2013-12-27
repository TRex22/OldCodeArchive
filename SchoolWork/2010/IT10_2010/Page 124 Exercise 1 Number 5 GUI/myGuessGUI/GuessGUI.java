package myGuessGUI;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTextField txtInput = null;
	private JButton btnOK = null;
	private JLabel lblOUTPUT = null;

	/**
	 * This method initializes txtInput	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtInput() {
		if (txtInput == null) {
			txtInput = new JTextField();
			txtInput.setBounds(new Rectangle(123, 61, 40, 30));
		}
		return txtInput;
	}

	/**
	 * This method initializes btnOK	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton();
			btnOK.setBounds(new Rectangle(116, 94, 58, 28));
			btnOK.setFont(new Font("Dialog", Font.BOLD, 12));
			btnOK.setText("OK");
			btnOK.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//lblOUTPUT.setText(txtInput.getText());
					int number = Integer.parseInt(txtInput.getText());
				if (number>50)
				{
					lblOUTPUT.setText("TOO HIGH");
				}
				else if (number<50)
				{
					lblOUTPUT.setText("TOO LOW");
				}
				else
				{
					lblOUTPUT.setText("Correct");
				}
				}
			});
		}
		return btnOK;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuessGUI thisClass = new GuessGUI();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public GuessGUI() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 300);
		this.setContentPane(getJContentPane());
		this.setTitle("GUESS");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblOUTPUT = new JLabel();
			lblOUTPUT.setBounds(new Rectangle(64, 132, 175, 99));
			lblOUTPUT.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(85, 21, 122, 36));
			jLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
			jLabel.setText("Enter Your Guess");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getTxtInput(), null);
			jContentPane.add(getBtnOK(), null);
			jContentPane.add(lblOUTPUT, null);
		}
		return jContentPane;
	}

}
