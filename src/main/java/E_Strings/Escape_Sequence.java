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
e.g.
  \\: Backslash
  \': Single quote
  \": Double quote

- There are some predefine Escape sequences(8) character provided by java like
     \n : Newline
     \t : Tab
     \b : Backspace
     \f : form feed
     \r : Carriage return
     \" : "  
     \' : ' 
     \\ : \

- Escape sequences are used precisely when you want to represent characters that have special meanings in Java or when Java uses those characters for special purposes.
- Escape sequences can be used in case(or in concept) where particular character has special meaning there.
 e.g. String string = "aaa.bbb.ccc.ddd" 
   -I want to split string based on .(dot) . i can use split method . split method accept regex. 
   - So i can write like this "." , but in regex which means every character(special meaning), so i can use \ here which is used to suppresses the special meaning of the character it precedes, and turns it into an ordinary character in regex.
   - String become "\." . String acts it as regex because of \ . But \. is not valid regex(out of 8) . so we need to add one more \ .
   - so  string become "\\." which is valid regex . Here 1st \ act second \ as special , so it will add in string and string become 
     ".\" which is valid for string

Leetcode 2788 : Split Strings by Separator
Leetcode 165. Compare Version Numbers
 */