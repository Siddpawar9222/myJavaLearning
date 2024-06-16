package E_Strings.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example04 {

	public static void main(String[] args) {
		
		/*
		Pattern pattern1 = Pattern.compile("\\d+");
		Matcher matcher1 = pattern1.matcher("Hello 123 World");
		String simplified1 = "Result: " + matcher1.replaceFirst("###");
		System.out.println(simplified1);
		*/
		
		
		
		
	  Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
	  Matcher matcher = pattern.matcher("10 divided by 2") ;
	  // 10 divided by 2
	  // 10/2
	  if(matcher.find()) {
		  String simplified = "result= " + matcher.replaceFirst("$1/$2");
		  System.out.println(simplified);
		  int num1 = Integer.parseInt(matcher.group(1));
		  int num2 = Integer.parseInt(matcher.group(2));
		  System.out.println(num1/num2);
		  
	  }

	}

}
//replaceFirst() method which is used to replace the first occurrence of a pattern in a string with a specified replacement string

//$1 --First group
//$2 --Second group