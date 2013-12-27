public class Clothes {
	
	private String colour;
	private String descr;
	private int rating;
	
	public Clothes (String c, String d, int r)
	{
		setColour(c);
		setDescr(d);
		setRating(r);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//other methods
	public String toString()
	{
		return colour+"\t"+descr+"\t"+rating;
	}
	
	
	
}
