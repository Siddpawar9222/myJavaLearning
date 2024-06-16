package E_Strings;

public class Command_line_arguments {
    public static void main(String[] a) {
//  Arguments-->values

// ->Command line Arguments are used to supply dynamic values as input for our program at the runtime

// ->Command line Arguments will be received in the main method

// ->Command Arguments default data type is String

// ->We can multiple command arguments they will be stored in an Array.

 String s1 = a[0];
 String s2 = a[1];
 String s3 = a[2];

System.out.println(s1+s2+s3);
// compile-->javac fileName.java
// run-->java fileName hi hello hi
 
//int x = Integer.parseInt(a[0]) ;
//int y = Integer.parseInt(a[1]) ;

//System.out.println(x+y);
     


    }
}
