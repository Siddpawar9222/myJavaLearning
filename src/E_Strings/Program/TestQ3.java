
package E_Strings.Program;
//Palindrome String
public class TestQ3 {
    public static void main(String[] args) {
        String s = "HiiH";
        String reverse = "" ;
//        for(int i=s.length() -1 ; i>= 0  ; i--){
//               
//               reverse = reverse + s.charAt(i) ;
//        }
        
//      if(s.equalsIgnoreCase(reverse)){
//      System.out.println("It is Palindrome");
//  }
//  else{
//      System.out.println("It is not  Palindrome");
//  }
         
        boolean flag =true ;
        for(int i =0 ; i< (s.length()/2)  ; i++) {
        	if(s.charAt(i) != s.charAt(s.length()-1-i)) {
        		flag=false ;
        		break ;
        	}
        }
        
      if(flag==true){
      System.out.println("It is Palindrome");
  }
  else{
      System.out.println("It is not  Palindrome");
  }
        
        

    }
    
}
