package myTestCharacters;

public class TestCharacters {

	//fields
	private String sentence1;
	private String sentence2;
	//default constructor

	public TestCharacters()
	{
		sentence1="";
		sentence2="";
	}
	//to give the fields values when
	//when the object is instanciated
	//mutators(setters) and
	//accessors(getters)
	public void setSentence1(String sentence1) {
		this.sentence1 = sentence1;
	}
	public String getSentence1() {
		return sentence1;
	}
	public void setSentence2(String sentence2) {
		this.sentence2 = sentence2;
	}
	public String getSentence2() {
		return sentence2;
	}
	public String analyseSentence1()
	{
		String out = "";
		for (int i =0; i<sentence1.length();i++)
		{

			char letter = sentence1.charAt(i);
			out+=letter +" ";
			if (Character.isLetter(letter))
			{


				if (Character.isUpperCase(letter))
				{
					out+="is a capitol* letter\n";
				}
				else
				{
					out+="is a small letter\n";
				}

			}
			else if (Character.isDigit(letter))
			{
				out+= "is a digit\n";
			}
			else if (Character.isWhitespace(letter))
			{
				out+="is a special character\n";
			}

		}
		return out;
	}
	public String encodeSentence2()
	{
		String out="";
		for (int i=0; i<sentence2.length();i++)
		{
			char letter = sentence2.charAt(i);
			letter++;
			//letter = (char)(((int) letter)+1);
			out+=letter;
		}
		return out;
	}
	public String valueSentence1()
	{
		String out = "";
		int sum=0;
		for (int i=0; i<sentence1.length();i++)
		{
			char letter = sentence1.charAt(i);
			int value = (int)letter; //gets the ascii value of letter
			out+=letter+" = "+value+" WHY?\n";
			sum+=value;
		}

		out+="_______________________________________\n"+"Total Value Equals "+sum;
		return out;
	}
	public String compareSentences()
	{
		String out = "";
		if (sentence1.equalsIgnoreCase(sentence2))
		{
			out+=sentence1+" is equals to \""+sentence2+"\"";
		}
		else if (sentence1.compareToIgnoreCase(sentence2)<0)
		{
			out+="\""+sentence1+"\" is alphabetically less than \""+sentence2+"\"";
		}
		else
		{
			out+="\""+sentence1+"\" is alphabetically more than \""+sentence2+"\"";
		}
		return out;
	}




}
