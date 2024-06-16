package I_ExceptionHandling;

import java.io.FileReader;

public class B_TypesOfException {
    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {

     //  FileReader fr = new FileReader("test.txt") ; //checked exception
        
        String str = null ;
        System.out.println(str.length());         //uncheched exception

         B_TypesOfException.recursiveMethod();   //Error
    }
}
/*
  Types of Exception : 
  Caused by program
  Can be handle
  1]Checked Exception(compile-time) : 
   the compiler will enforce you to catch these exception
   e.g. IOException, SQLException, etc
    
  2]UnChecked Exception(runtime-time) :
   checked runtime-time, and we are not required to handle or declare them explicitly.
   e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
   

  Error : 
  Occurred due to system resources
  Cannot be handle(We must resolve)
  Unchecked
  e.g. NoClassDefFoundError ,StackOverflowError ,OutOfMemoryError etc
  Note : I can handle Error like this 
  try {
		B_TypesOfExceeption.recursiveMethod() ;
		}catch(StackOverflowError e) {
			System.out.println(e);
	}
    But it's generally not recommended to catch or handle Error instances. Errors are usually more severe issues that indicate fundamental problems with the JVM or the runtime environment, and attempting to handle them might not be effective or safe. It's a best practice to focus on preventing errors through proper coding practices and system configuration rather than trying to handle them.
 */