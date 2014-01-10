package myQuestion2;

public class uBook {
	
	private String Deweycode;
	private String Classs;
	private String Author;
	private String Title;
	private String Status; //#
	
	public uBook (String d, String c, String a, String t, String s)
	{
		Deweycode =d;
		Classs =c;
		Author =a;
		Title = t;
		Status=s;
	}

	public String getDeweycode() {
		return Deweycode;
	}

	public void setDeweycode(String deweycode) {
		Deweycode = deweycode;
	}

	public String getClasss() {
		return Classs;
	}

	public void setClasss(String classs) {
		Classs = classs;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String toString ()
	{
		return Deweycode+"\t"+Classs+"\t"+Author+"\t"+Title;
	}
	
	public String getClassname()
	{
		return Classs;
	}
	
	public Boolean stockBook (String s1, String s2)
	{
		boolean out = false;
		
		if (s1.equalsIgnoreCase(Title)&&(s2.equals(Classs)))
		{
			out = true;
		}
		
		return out;
	}

}