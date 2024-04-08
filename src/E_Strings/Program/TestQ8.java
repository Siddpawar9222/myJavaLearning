package E_Strings.Program;

import java.util.Arrays;

public class TestQ8 {
    public static void main(String[] args) {
    	//Count number of words in the String
//        String s = "I love java programming";
//        String[] s1 = s.split(" ");
//        System.out.println(Arrays.toString(s1));
//        System.out.println(s1.length);
//--------------------------------------------------------------------------
        //Remove or Removing all the Whitespaces ( Blank spaces) In the String 
        
       String name = "  i m a good boy na   "  ;
       
       String nString ="" ;
       for(int j= 0 ; j<name.length() ; j++) {
    	   if(name.charAt(j)!= ' ') {
    		   nString += name.charAt(j) ;
    	   }
       }
       System.out.println(nString);
       nString.length();
    
    }
}
