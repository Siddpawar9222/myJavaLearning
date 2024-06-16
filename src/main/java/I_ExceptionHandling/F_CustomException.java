package I_ExceptionHandling;

class NoDataFoundException extends RuntimeException{
	public NoDataFoundException() {
		
	}
	public NoDataFoundException(String msg) {
		  super(msg);
	}
}


public class F_CustomException{
    public static String myException(int id) {
		if (id==101) {
			return "Geeta";
		}
		else if (id==102) {
			return "Seeta";
		}
		else if(id<0){
            throw new IllegalArgumentException("Id cannot be Negative") ;
		}
		else {
			throw new NoDataFoundException("Invalid id");//custom exception
		}
	}
public static void main(String[] args) throws IllegalArgumentException, NoDataFoundException{
	  System.out.println(myException(-10));
	  System.out.println(myException(103));
	  System.out.println("Program Terminated......");
}
}
/*
RuntimeException and Unchecked Exceptions:
By extending RuntimeException or any subclass of it, you create an unchecked exception.

Exception and Checked Exceptions:
When you extend the Exception class or its subclasses (excluding RuntimeException and its subclasses), you create a checked exception.    
 */

 /*

The throw and throws keywords  are not used to handle exceptions.
-throw is used to raise an exception within a method or block of code.
-throws is used in a method declaration to indicate that the method might throw specific exceptions and that callers should be prepared to handle those exceptions.

  */