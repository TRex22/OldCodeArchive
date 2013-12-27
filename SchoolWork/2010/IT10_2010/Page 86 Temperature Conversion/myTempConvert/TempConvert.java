package myTempConvert;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TempConvert {

	/**
	 * F = 9 * C / 5 + 32
	 */
	public static void main(String[] args) {
		try {
			
			//IPO
			//WELCOME
			String sCelcius = JOptionPane.showInputDialog( "Enter the Degrees celcius" );
			double rCelcius = Double.parseDouble(sCelcius);
			
			//calc farenheight
			double rFahrenheit = 9 * rCelcius / 5 + 32;
			int iFahrenheit = (int)Math.round(rFahrenheit);
			//dsp
			
			//Import a frame
			JFrame nameofframe = new JFrame();

			//make visiable
			nameofframe.setVisible(true);
			nameofframe.setLocation(40,20);
			nameofframe.setSize(350,50);
			nameofframe.setTitle( "Temperature Conversion" );

			//import text area

			JTextArea txt = new JTextArea();
			nameofframe.add(txt);

			//display in text area
			//fist set text then append after

			txt.setTabSize(20);
			txt.setText( rCelcius+" Degrees Celcius is: "+
					iFahrenheit+" degrees Fahrenheight");
			
			//extra

			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Unknown Error 1" );
		}
		
		
		
		
		
	}

}
