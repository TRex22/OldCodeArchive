package myLine;

import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Line {

	//fields
	int size = 50;
	char pattern = '*';
	boolean framese = true;
	//method to draw a line
	//1: shared: public = shared to all
	//		  	 protected = shared with the
	//			 private = not shared
	//2: Does it return something
	//			 void = return nothing, only does something
	//			 if it does return something = state the data type
	//3: name of the method
	//4: BRACKETS
	//5: anything sent in to the method goes into the barckets
	public void drawLine ()
	{
		String out="";

		//frame
		JFrame frame = new JFrame ();
		JTextArea txt = new JTextArea();

		frame.add(txt);
		frame.setSize(250,250);
		frame.setTitle("Draw LINE !!!!!!!!!!!!");

		for (int i=1;i<=size;i++)
		{
			out+=pattern;
		}
		frame.setVisible(framese);
		txt.setText(out);

	}

	//method 2 make a line and send it to the other side
	//1: shared: public = shared to all
	//		  	 protected = shared with the
	//			 private = not shared
	//2: Does it return something
	//			 void = return nothing, only does something
	//			 if it does return something = state the data type
	//3: name of the method
	//4: BRACKETS
	//5: anything sent in to the method goes into the barckets
	public String makeLine ()
	{
		String out="";


		for (int i=1;i<=size;i++)
		{
			out+=pattern;
		}

		return out;
	}





}