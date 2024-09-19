package E_Strings;

public class String_Methods1 {
    public static void main(String[] args) {
        // CompareTo
     
        int compare = "apple".compareTo("apple");
        int compare1 = "apple".compareTo("avple");
        int compare2 = "apple".compareTo("abple");
        int compare3 = "apple".compareTo("app");
        System.out.println(compare + " " + compare1 + " " + compare2 + " " + compare3);
     
        // ==========================================================//
        
        /* equals() */
        // String str1 = "Hello";
        // String str2 = "Hello";
        // System.out.println(str1.equals(str2));

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2));


     

    }
}
/*
 * ComapreTo :
 * The compareTo() method compares two strings lexicographically.
 * e.g. Lets take the example of apple vs avple ,at start it will compare 'a'and
 * 'a'(a-a ascii value) which is zero ,then it compare 'p' and 'v' (p-v=-6) then
 * output would be -6.
 * apple vs app , compareTo return differece between length of apple and app
 * which is 2
 
 //2259. Remove Digit From Number to Maximize Result - Best example of compareTo method
 
 Summary : 
  x.compareTo(y) : 
  -ve : x is smaller than y 
  +ve : x is greater than y
 */
      
 /*
 
   equals() :
   String , StringBuffer and StringBuilder class implement equals method of object class .
   The default implementation of the equals method in the Object class compares the memory addresses of the objects, not their contents.
   In String Class overriden equals method and has own implementation  which compare content of String. Thats why we Got true output .
   In StringBuffer and  StringBuilder class , which doesnt not overriden the equals method and thats why default implementation pf equals compare reference not contents .
   To compare StringBuffer and  StringBuilder class Object we have to convert into String Object and which can be done by toString() method .
 
  */

