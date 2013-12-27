package myKeyboardInput;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class KeyboardInput {

	/**
	 * Using the IPO scanner
	 * Can have errs without any feasible reason
	 * Problems within system.in
	 *
	 *
	 */
	public static void main(String[] args) {

		//Using console to enter a sentence and display it.
		//sc
		Scanner sc = new Scanner(System.in);
		//ask for input
		System.out.println("Typeeee theeee in eeee senteeenceeeee");
		//read the input
		//next can have problems
		String sentence = sc.nextLine();
		//disp
		JOptionPane.showConfirmDialog(null, "WHY");
		System.out.println(""+sentence);
		System.out.println();
		System.out.println("HHAHAHHAHAHAHAHHAHAHAHAHAHHAHAHAHH........:)()()() -. tripple chin");

		//integer input
		//ask for fing  njho
		System.out.println("TYPE IN FING-NJHO");

		//read FingNjho
		int FingNjho = sc.nextInt();
		//display
		System.out.println();
		System.out.println("You types in "+FingNjho);
		System.out.println();
		
		sc.close();




	}

}
