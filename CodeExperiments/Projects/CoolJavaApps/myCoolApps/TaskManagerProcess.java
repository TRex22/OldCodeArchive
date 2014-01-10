package myCoolApps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskManagerProcess {

	/**
	 * http://www.codeproject.com/Articles/227478/Cool-Java-Programs
	 */

	public static void main(String[] args) {
		try{
			String line;
			Process p = Runtime.getRuntime().exec("tasklist.exe");
			BufferedReader input =
					new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = input.readLine()) != null) {
				System.out.println(line); //<-- Parse data here.
			}
			input.close();}
		catch (Exception e)
		{

		}






	}

}
