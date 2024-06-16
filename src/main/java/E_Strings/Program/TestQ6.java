package E_Strings.Program;


public class TestQ6 {
    public static void main(String[] args) {
        String s = "Hello, Heow are you?" ;

         String a =  s. replaceAll("[aeiouAEIOU]" , "") ;
         System.out.println(a);
//------------------------------------------------------------------------------
         
         String string ="Alive is awesome  ";
         int count =0 ;
         for(int i=0 ; i<string.length(); i++) {
        	 if(string.toLowerCase().charAt(i) == 'a' || string.charAt(i) == 'e' ||string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' )  {       
        		  count++;
        		 
        	 }
         }
         System.out.println(count);
    }
    
}
