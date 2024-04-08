package MCQ;

public class Basic {
     public static void main(String[] args) {
        // String  a = 10 + 20 + " Hello " ;
		// String b = " hello " + 10 +20 ;

		 //System.out.println(a + " : " + b );

    	 
     	System.out.println("HelloWorld" + 10+20);
     	System.out.println(10+20+"HelloWorld");
     	
     	
//     	The output of the two statements will be different because of the way that Java evaluates expressions involving the + operator.
//
//     	In the first statement, "HelloWorld" + 10+20, the + operator is used to concatenate the string "HelloWorld" with the integer 10. Since one operand is a string, Java will treat the other operand as a string as well, resulting in the string "HelloWorld10". This new string is then concatenated with the integer 20, resulting in the final string "HelloWorld1020", which is printed to the console.
//
//     	In the second statement, 10+20+"HelloWorld", the + operator is used to add the integers 10 and 20 first, resulting in the integer 30. Then, the integer 30 is concatenated with the string "HelloWorld", resulting in the string "30HelloWorld", which is printed to the console.
	}
}
