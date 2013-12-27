package mySquare;
//Sub class of the square class and it extends on it.
public class Cube extends Square{
	private int depth;
	//paramitrised constructor that must recieve values for all fields
	//in this class and the super class
	public Cube(int w, int d) {
		//calls the constructor of the super class, ie Square
		//sends the w into the super class
		super(w);
		//saves the d into depth
		depth = d;
		
	}
	
	//accessor and mutator for fields in this class only
	public void setDepth (int depth)
	{
		this.depth = depth;
	}
	//override the calcArea method of the super class
	public int calcArea () {
		return super.calcArea()*2+((super.getWidth()*depth)*4);
	}
	//override the toString method of
	public String toString()
	{
		return "The width is "+super.getWidth()+" \nthe depth is "+depth+" the SA is "+calcArea();
	}
	
	
}
