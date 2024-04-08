package E_Strings.Program;

public class TestQ5 {
    public static void main(String[] args) {
        //For numbers 
        // a=10 ;
        // b =30 ;

        // a = a + b ; = 40
        // b= a- b ; = 10
        // a = a - b ; = 30
        
         
      //For Strings
        String a = "hello";
        String b = "world";
        
        a = a + b ;      
        b =  a.substring(0 , (a.length()-b.length())) ;   
        a = a.substring(b.length()) ;   
         

       
    }

}
