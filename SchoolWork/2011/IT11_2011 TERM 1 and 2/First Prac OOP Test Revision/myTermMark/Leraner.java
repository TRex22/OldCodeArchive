package myTermMark;

public class Leraner {

	private int learnerNo;
	private String fullName;
	private int test1, test2, test3;

	public Leraner ()
	{
		learnerNo=0;
		fullName="";
		test1=0;
		test2=0;
		test3=0;
	}

	public void setLearnerNo(int learnerNo) {
		this.learnerNo = learnerNo;
	}

	public int getLearnerNo() {
		return learnerNo;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setTest1(int total1,int mark1) {
		int percent =
		mark1*100/total1;

		test1 = percent;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest2(int total2, int mark2) {

		int percent =
			mark2*100/total2;

			test2 = percent;


	}

	public int getTest2() {
		return test2;
	}

	public void setTest3(int total3, int mark3) {

		int percent =
			mark3*100/total3;

			test3 = percent;

	}

	public int getTest3() {
		return test3;
	}
	public int calcAve()
	{

		return ( test1+test2+test3)/3;
	}
	public String toString ()
	{


		return learnerNo+"\t"+fullName+"\t"+calcAve()+"%";
	}

}
