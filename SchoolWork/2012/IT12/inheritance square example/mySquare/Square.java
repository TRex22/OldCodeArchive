package mySquare;

public class Square {

	//This is the super class that the other classes will inherit from
	
	//fileds
	private int width;
	
	//paramatried constructor
	public Square (int w)
	{
		width =w;
	}
	
	//acsessor and mustator methods = rarely used except with arrays
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	//other methods
	//calc area - to calc area
	public int calcArea ()
	{
		
	return width*width;
	}
//to striong = make disp
	
	public String toString()
	{
		return "The Square has a width "+width +" and the area is "+calcArea();
	}
	
	
	
}
