package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_patterns {

	public static void main(String[] args)
	{
		Pattern p= Pattern.compile("Hello",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("Hello World!");
		boolean found=m.find();
		if(found)
		{
			System.out.print("Found!");
		}
		else {
			System.out.print("Not found");
		}
	}
	
}
