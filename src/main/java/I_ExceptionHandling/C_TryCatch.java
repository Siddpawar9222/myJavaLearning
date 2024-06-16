package I_ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class C_TryCatch {
	
	public static void main(String[] args) {
		System.out.println("Program Start Here");

        //try with resources
		 try (FileReader fr = new FileReader("test.txt")) {
		} catch (IOException e) {
			System.out.println(e);
		}

        try {        
        	 String str = null ;
             System.out.println(str.length()); 
        } catch (Exception e) {
        	 System.out.println(e);
        } 

		//Multiple Catch 
		try{    
			int a[]=new int[5];    
			a[5]=30/0;    
		   }    
		   catch(ArithmeticException e)  
			  {  
			   System.out.println("Arithmetic Exception occurs");  
			  }    
		   catch(ArrayIndexOutOfBoundsException e)  
			  {  
			   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
			  }    
		   catch(Exception e)  
			  {  
			   System.out.println("Parent Exception occurs");  
			}
			
			//Nested try catch
			try {
				// Outer try block
				int[] numbers = {1, 2, 3};
				System.out.println(numbers[5]); 
				
				try {
					// Inner try block
					int result = 10 / 0; 
					System.out.println("Result: " + result);
				} catch (ArithmeticException e) {
					System.out.println("Inner ArithmeticException");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Outer ArrayIndexOutOfBoundsException");
			}

     
		System.out.println("Program terminated.........");
	}

}

/*
Java try and catch:
-The try statement allows you to define a block of code to be tested for errors while it is being executed.
-The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
-The try and catch keywords come in pairs.
 */

