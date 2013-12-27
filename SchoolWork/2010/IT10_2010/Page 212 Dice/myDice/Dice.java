package myDice;

public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dice = (int) (Math.random()*6)+1;
		do
		{
			dice=(int) (Math.random()*6)+1;
			System.out.println(dice+"");
		}
		while (dice!=6);



	}

}
