package E_Strings.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

	public static void main(String[] args) {
		
		 Pattern pattern = Pattern.compile("\\d+");
		 Matcher matcher = pattern.matcher("Hello 123 123 5563135 World");
		 while (matcher.find()) {
		     System.out.println("Match found: " + matcher.group());
		 }
		
		
		
		
		
		Pattern pattern6 = Pattern.compile("^[a|A]gent (\\d{3,4})$");
		Matcher matcher6 = pattern6.matcher("agent 007");
		//System.out.println(matcher6.find());
		
		if(matcher6.find()) {
			System.out.println(matcher6.group());
			System.out.println(matcher6.group(1)); // Matching portion of a first group
		}

	}

}
// find() - search for occurrences of a specified pattern within an input string .

			//If a match is found, the method returns true, and the internal state of the Matcher object is advanced to the next match.
			//If no match is found, the method returns false and the internal state of the Matcher object remains unchanged.