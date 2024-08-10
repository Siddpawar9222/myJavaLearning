package E_Strings;

import java.util.Arrays;

public class String_Methods {

   public static void main(String[] args) {
      // String name = "SIDDHESH PAWAR";
      // String name1 = "pawar" ;
      // // 1]
      // System.out.println(name.toLowerCase() + " " + name1.toUpperCase());
      //
      // // 2]
      // System.out.println(name.equalsIgnoreCase("Siddhesh Pawar") + " " +
      // name.equals("Pawar"));

      // 3]
      // String name = " Arjun ";
      // System.out.println(name.length());
      // System.out.println(name.trim());
      // System.out.println(name.trim().length());
      // System.out.println(name.charAt(6));

      // 4]
      // String letter ="Dear name, Thanks a lot . name Do you want Coefee" ;
      // System.out.println(letter.replaceAll("name","Siddhesh")); //replaceAll for
      // substring
      // System.out.println(letter.replaceFirst("name","Siddhesh")); //takes string
      // System.out.println(letter.replace('n','s')); ////replace for all characters (characters allow)

      // 5]
      // String string = "Im learning String in java" ;
      // System.out.println(string.substring(0));
      // System.out.println(string.substring(2));
      // System.out.println(string.substring(2 , 5));
      // System.out.println(string.substring(5,1)); //
      // java.lang.StringIndexOutOfBoundsException

      // 6]
      // String string = "Im learning String in java" ;
      // System.out.println(string.startsWith("im") + " " + string.endsWith("va"));

      // 7]
      // String name = "Siddhesh";
      // System.out.println(name.lastIndexOf("i",4)); // returns index number or -1 if
      // not present
      // System.out.println(name.indexOf("h",4));
      // System.out.println(name.indexOf("dh"));
      // System.out.println(name.lastIndexOf("d")); //It will return first
      // occurrence(Start searching from last index )
      // 8]
      // String s1="hello";
      // System.out.println(Arrays.toString(s1.toCharArray()));

      // The split() method is a built-in function in the Java String class that
      // splits a string into an array of substrings based on a specified delimiter.
      //  String str = "The quick brown fox jumps over the lazy dog";
      //  String[] words = str.split(" ");


      // System.out.println(Arrays.toString(words)); //Returns a string representation
      // of the contents of the specified array. The string representation consists of
      // a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent
      // elements are separated by the characters “ , ” (a comma followed by a space).
      // Returns “null” if a is null
      // By default it split basics on letters

      // --------------------------------------------------------------------------------

      // Note that the split() method does not modify the original string. Instead, it
      // returns a new array of substrings that are derived from the original string.
      // Also, if the delimiter is not found in the string, the split() method will
      // return an array with a single element that is equal to the original string.

      // intern()
      String s1 = new String("Im java");
      String s2 = new String("Im java");
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
      String s3 = s1.intern();
      String s4 = s2.intern();
      System.out.println(s3 == s4);

      // concatenation
      // System.out.println(String.join(" ","Siddhesh","Pawar"));
   }

}

/*
indexOf() -   proceed beginning towards the end of the string
lastIndexOf() - proceed backwards towards the beginning of the string
 */