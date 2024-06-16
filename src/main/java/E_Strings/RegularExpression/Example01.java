package E_Strings.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {

	public static void main(String[] args) {
	
		/*
		
	    Pattern pattern = Pattern.compile("Hello");
	    Matcher matcher = pattern.matcher("Hello");
	    System.out.println(matcher.find()); 
		
		
		
		
		
		
		Pattern pattern1 = Pattern.compile("agent \\d{3}"); // d{3}-->\\d\\d\\d
		Matcher matcher1 = pattern1.matcher("agent 0000");//*
		System.out.println(matcher1.find());
		//Here we can specifies range here of digit e.g.  [0-9]
		
		
		Pattern pattern2 = Pattern.compile("agent \\d{3}");
		Matcher matcher2 = pattern2.matcher("agent 0000");//*
		System.out.println(matcher2.find());
		
		
       
		

		Pattern pattern3 = Pattern.compile("^agent \\d{3}$");
		Matcher matcher3 = pattern3.matcher("agent 000");//*
		System.out.println(matcher3.find());
		
		 
		
		Pattern pattern4 = Pattern.compile("^[a|A|aa]gent \\d{3}$");
		Matcher matcher4 = pattern4.matcher("aagent 000");//*
		System.out.println(matcher4.find());
		
		
		
		Pattern pattern5 = Pattern.compile("^\\w\\d{3}$");
		Matcher matcher5 = pattern5.matcher("a151");
		System.out.println(matcher5.find());
	
		
		// Pattern pattern6 = Pattern.compile("^\\w*\\d{3}$");
		// Matcher matcher6 = pattern6.matcher("151");
		// System.out.println(matcher6.find());
		
        

		Pattern pattern6 = Pattern.compile("^[a||A||bb]$"); //**
		//Pattern pattern6 = Pattern.compile("^(a||A||bb)$"); //***
		Matcher matcher6 = pattern6.matcher("b");
		System.out.println(matcher6.find());
		
		
		Pattern pattern7 = Pattern.compile("(\\d+)-(\\w+)"); 
		Matcher matcher7 = pattern7.matcher("123-abc");
		System.out.println(matcher7.find());

		
		 */
		Pattern pattern9 = Pattern.compile("(abc){2,3}"); 
		Matcher matcher9 = pattern9.matcher("abcabcabc");
		System.out.println(matcher9.find());
		
		
		
		
		
		

	}

}
//*--> agent 0000 from this word it would check only agent 000 . number of character on left or right side doesn't matter ,
//**  [] --> always give one character
//*** () --> multiple purposes, including grouping, capturing, and defining subpatterns.

//https://regex101.com/  Good website to run,debug regex

//Website to see meaning of each character
//https://www.nv5geospatialsoftware.com/docs/Learning_About_Regular_E.html#:~:text=The%20backslash%20suppresses%20the%20special,('%5C%5C').&text=The%20open%20parenthesis%20indicates%20a%20%22subexpression%22%2C%20discussed%20below.