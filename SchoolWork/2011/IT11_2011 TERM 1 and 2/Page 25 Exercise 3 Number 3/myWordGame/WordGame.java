package myWordGame;

public class WordGame {
	//previous word
	private String previous;
	//current word
	private String current;
	//counter of valid words
	private int count;
	//score
	private int score;
	//constructor
	public WordGame()
	{
		previous = "";
		current = "";
		count = 0;
		score = 0;
	}
	//setters and getters
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public String getPrevious() {
		return previous;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getCurrent() {
		return current;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	//check if the current is valid
	public boolean isValid ()
	{
		boolean valid = true;
		//first letter of current word
		char first = current.charAt(0);
		//last letter of previous word
		char last = previous.charAt(previous.length()-1);
		//if the first letter is equal to last letter = valid
		if (first == last)
		{
			valid = true;
			count++;
			score += 10;
		}
		else
		{
			valid = false;
			score -= 10;
		}
		return valid;
	}

}
