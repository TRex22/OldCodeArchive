package mytxtobj;

public class Pupil {

	//fields
	private String name;
	private String surname;
	private int eng;
	private int afri;
	private int math;
	//default constructor - no parameters in brackets
	//purpose to give fields default values
	public Pupil()
	{
		name = "HAHAHA";
		surname = "Booby";
		eng =0;
		afri = 0;
		math = 0;

	}
	//paramatised constructor
	//parameters send in for all fields in ()
	//Purpose: to save parameters in fields
	public Pupil (String n, String s, int e, int a, int m)
	{
		name = n;
		surname = s;
		eng = e;
		afri =a;
		math=m;
	}


	//accersors (getters) - returns fields
	//mutators (setters) - change fields
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setAfri(int afri) {
		this.afri = afri;
	}
	public int getAfri() {
		return afri;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public int calcAvg()
	{
		return (int) Math.round((eng+afri+math)/3.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000);
	}
	public String toString()
	{
		return name += "\t"+surname+"\t"+ eng+"\t"+afri+"\t"+math+"\t"+calcAvg();
	}





}
