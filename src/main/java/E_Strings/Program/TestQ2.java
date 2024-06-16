package E_Strings.Program;
//reverse String
public class TestQ2 {
    public static void main(String[] args) {
        String s = "java";
        String reverse = "" ;
        for(int i=s.length() -1 ; i>= 0  ; i--){
               
               reverse = reverse + s.charAt(i) ;
        }
          System.out.println("reverse String is " + reverse);
         
        
    }
    
}
