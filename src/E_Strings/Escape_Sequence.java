package E_Strings;

public class Escape_Sequence {
    public static void main(String[] args)
    {
        System.out.println("  \"Im siddhesh pawar . \t Im learning the Java Language\"  ");
        System.out.println("   \" I am \n proficient java \t developer \"      ");
    }
    
}

/*
Escape sequences character :
- Escape sequences are special sequences of characters used in string literals to represent characters that are difficult or impossible to type directly into the source code.
 e.g. Lets suppose you want to print  " . How you can do that ? 
       System.out.println( " " ") ;   But it gives error.
- Like above example there are many character we cant print or use directly , So In such type of cases, we can  use Escape sequences character.  
- With help of \ we can define Escape sequences character.
- The total number of  escape characters in Java is 8
\n: Newline
\t: Tab
\b: Backspace
\f : form feed
\r: Carriage return
\\: Backslash
\': Single quote
\": Double quote

- Escape sequences are used precisely when you want to represent characters that have special meanings in Java or when Java uses those characters for special purposes.
Leetcode 2788 : Split Strings by Separator
 */