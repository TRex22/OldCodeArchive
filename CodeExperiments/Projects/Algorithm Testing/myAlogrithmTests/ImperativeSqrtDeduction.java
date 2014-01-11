package myAlogrithmTests;

import javax.swing.JOptionPane;

public class ImperativeSqrtDeduction {

	/**
	 * This will deduce a sqrt using the algorithm created by
	 * Heron of Alexandria
	 * 
	 * found on MIT Lecture
	 * Lec 1 | MIT 6.00 Introduction to Computer Science and Programming, Fall 2008 
	 * http://www.youtube.com/watch?v=k6U-i4gXkLM
	 * 
	 * Start with a guess G
	 * if G^2 #= (ie close to) X, Stop -->(return) G
	 * else G <--- (G+X/G)/2
	 * Repeat from step one 
	 * 
	 * the algorithm has been slightly edited to fix certain Java issues like
	 * unending loops since the double primitive is too small
	 * 
	 * Programmed by Jason Chalom
	 * 
	 * Edited Jan 2013 to be more effective and to show up 12 significant values
	 * original comments will most likely still be in code
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This will show Heron of Alexandria's imperative method of\n" +
				"deducing a square root.");
		double X = Double.parseDouble(JOptionPane.showInputDialog("Input X"));
		//double G = Double.parseDouble(JOptionPane.showInputDialog("Input Guess G"));
		//dont ask for guess but use a random number
		//will make code longer to execute but it will function through computation
		//rather than user input
		double G = Math.random()*X;

		//loop until evt Gsq close to X
		char endloop = ' ';
		int count = 0;
		do
		{
			//if ((G*G) == X)//There must not be == but rather close to not sure of symbol
			//will use a strange way to round off the last digit to 12 sig values using Math class
			float Xtmp = (float) (Math.round(X*1000000000000.00)/1000000000000.00);
			if ((G*G)==(Xtmp))//Problem *1
			{
				JOptionPane.showMessageDialog(null, "Return: "+G);
				endloop = 'X';
			}
			//the loop will be unending since the primitive im using is too small
			//therefore there must be a counter that will end the loop after let's say 100 iterations of the
			//method
			//if the count is at 100 then it should also return the current value of G
			else if (count == 100)
			{
				JOptionPane.showMessageDialog(null, "Return: "+G+" count: "+count);
				endloop = 'X';
				
			}
			else 
			{
				G = ((G+(X/G))/2);
				System.out.println("New G: "+G);
				count ++;
			}

		}while (endloop == ' ');



	}

}