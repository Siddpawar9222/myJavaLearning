package E_Strings;

public class WrapperClasses1  {
    
	public static void main(String... args)  {
		
    String a = args[0];
    String b = args[1];
    System.out.println(a +" " + b);
    
    int c = Integer.parseInt(a);
    int d = Integer.parseInt(b);                                                
    System.out.println(c+d);
    
    Integer s1 = Integer.valueOf(a);
    int s2 = Integer.valueOf(b);
    System.out.println(s1 + " " + s2);
     
	}

}

//Integer.valueOf() and Integer.parseInt() are two methods in Java used for converting a string to an integer. The difference between them is that valueOf() returns an Integer object while parseInt() returns a primitive int value.
// If we  don't pass value at runtime even assigning varargs  then it will be throws ArrayIndexOutOfBoundsException 


/*
Difference between wrapper classes and typecasting : 

wrapper classes : 
  Used to convert primitive to object and vica-versa
typecasting : 
  One primitive type to another primitive type
    e.g. integer to double
  One Object type to another Object type 
 */