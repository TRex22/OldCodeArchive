package myClassRoot;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ClassRoot1 {

	/**
	 * ^ax(pow 2) + bx + c = 0
	 * ^3 random integers a b and c
	 * determine roots of equation
	 * 	if b(pow2) - 4ac =0 
	 * 		*root is -(b/2a)
	 * 	if b(pow2) - 4ac > 0
	 * 		*root is ((-b+sqrt(b(pow2)-4ac)/2a) and ((-b-sqrt(b(pow2)-4ac)/2a)
	 */
	public static void main(String[] args) {
		int a,b,c;
		a = (int)(Math.random()*8)+1;
		b = (int)(Math.random()*8)+1;
		c = (int)(Math.random()*8)+1;
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		JTextArea txt = new JTextArea();
		frame.add(txt);
		frame.setLocation(20,20);
		
		if (Math.pow(b, 2)-(4*a*c) == 0)
		{
			double rootans = -(b/2*a);
			frame.setTitle("The Equation has 1 root ");
			txt.setText( "a = "+a+"\nb = "+b+"\nc = "+c );
			txt.append("\nIf The Equation IS b(pow2)-4ac = 0" +
					"\n then the roots is: -(b/2a)\n" +
					"The Root IS "+rootans);
					
			frame.setSize(190,200);
		}
		else if (Math.pow(b , 2)-(4*a*c) > 0)
		{
			//two roots!
			//((-b+sqrt(b(pow2)-4ac)/2a)
			double rootans1 = ((-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
			//((-b-sqrt(b(pow2)-4ac)/2a)
			double rootans2 = ((-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
			frame.setTitle("The Equation has 2 roots ");
			txt.setText( "a = "+a+"\nb = "+b+"\nc = "+c );
			txt.append("\nIf The Equation IS b(pow2)-4ac > 0" +
					"\n then the roots are:" +
					"\n((-b+sqrt(b(pow2)-4ac)/2a) \n" +
					"and \n" +
					"((-b-sqrt(b(pow2)-4ac)/2a) \n" +
					"The First Root IS "+rootans1+"\n" +
							"The Second Root IS "+rootans2);
			frame.setSize(380,200);
		}
		else
		{
			frame.setTitle("The Equation has no roots ");
			txt.setText( "a = "+a+"\nb = "+b+"\nc = "+c );
			frame.setSize(290,150);
		}
	
	}

}
