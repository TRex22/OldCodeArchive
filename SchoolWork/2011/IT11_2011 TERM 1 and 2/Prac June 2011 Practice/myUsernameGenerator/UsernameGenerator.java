package myUsernameGenerator;

public class UsernameGenerator {

	private String name;
	private String surname;

	//public UsernameGenerator ()
	//{
	//	name = "";
	//	surname = "";

	//}
	public UsernameGenerator (String n, String s)
	{
		name = n ;
		surname = s;
	}

	public String generateUsername()
	{
		String out = ""+name+" "+surname+" is ";
		String s3 = "";
		String n3 = "";
		for (int i =0; i<3;i++)
		{
			out += surname.toUpperCase().charAt(i);

		}
		boolean test = false;
		for (int i = 0; i<name.length();i++)
		{
			char temp;
			if (name.equalsIgnoreCase("a")&&test == false)
			{
				out += "a";
				test = true;
			}
			else if (!name.equalsIgnoreCase("a")&&test == false)
			{
				out += "n";
				test = true;
			}

		}


			char nameTemp ;
			out += name.substring(name.length()-2,name.length());



		return out;
	}




}
