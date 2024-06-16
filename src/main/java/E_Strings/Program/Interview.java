package E_Strings.Program;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		// Find the first non repeated character in a string
//		  e.g
//		  If the word "stress" is input then it should print  't'   as output.
//
//		  If the word "teeter" is input then it should print  'r'   as output.
		 
//		    String string = "stteess" ;
//		    boolean flag = true ;
//		    for(int i= 0 ; i<string.length() ; i++) {
//		     flag = true ;
//		    	for(int j= 0 ; j<string.length() ; j++) {
//		    		if( i!=j && string.charAt(i)==string.charAt(j)) {
//		    			flag=false ;
//		    			break ;
//		    		}
//		    	}
//		    	
//		    	if(flag==true) {
//		    		System.out.println(string.charAt(i));
//		    		break ;
//		    	}
//		    	
//		    }
//		    if(flag==false) {
//		    	System.out.println("Not word Found");
//		    }
		
//---------------------------------------------------------------------------------		
		
//		    String string = "Im god" ;
//		    boolean flag = true ;
//		    for(int i= 0 ; i<string.length() ; i++) {
//		     flag = true ;
//		    	for(int j= 0 ; j<string.length() ; j++) {
//		    		if( i!=j && string.charAt(i)==string.charAt(j)) {
//		    			flag=false ;
//		    			break ;
//		    		}
//		    	}
//		    	
//		    	if(flag==false) {
//		    		System.out.println("Repeated Character");
//		    		break ;
//		    	}
//		    	
//		    }
//		    if(flag==true) {
//		    	System.out.println("No repeated Character");
//		    }
 //------------------------------------------------------------------------
//		 String str1 = "abc";
//         String str2 = new String("abc");
//		 System.out.println(str1 == str2); //false
//		 System.out.println(str1.equals(str2)); //true 
		
		
//		 String str1 = "abc" ;
//		 //StringBuffer str1 = new StringBuffer() ;
//	     System.out.println(str1.equals("abc") + " " + "abc".equals(str1));
//		  
//	     String str2 = null;
//		 System.out.println(str2.equals("abc")); // null pointer  Exception
//		 System.out.println("abc".equals(str2));
		
//---------------------------------------------------------------------------
//       Change UpperCase to LowerCase and Lowercase to Uppercase Of All The Characters In The String Without Using Built In Java 
		
		
//		String  s1 ="I am Java";
//		for(int i=0; i<s1.length();i++) {
//			int ch=s1.charAt(i);
//			if(ch>=97 && ch<=122) {
//			  ch= ch-32 ;
//			  System.out.print((char)ch);
//			}
//			else if(ch>=65 && ch<=90) {
//				ch= ch+32 ;
//				System.out.print((char)ch);
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//-----------------------------------------------------------------------
		
		StringBuffer sbBuffer = new StringBuffer("How are You");
		System.out.println(sbBuffer.length());
		sbBuffer.replace(0 ,1, "") ;
		System.out.println(sbBuffer);
		System.out.println(sbBuffer.length());
//------------------------------------------------------------------------
//How to convert Signed integer to String in java with example 
		int a =10 ;
		int a1 = -14563 ;
	System.out.println(Integer.toString(a1));
	System.out.println(String.valueOf(a1));
		
	}
}
		  
		  


