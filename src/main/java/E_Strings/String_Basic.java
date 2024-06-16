package E_Strings;

public class String_Basic {
    public static void main(String[] args) 
    {
         String st = "Siddhesh";
         String st1 = new String("Pawar") ;
         
         System.out.format(st + " " + st1);
         
//---------------------------------------------------------------------------------         
         String a1 = "Siddhesh" ;
         String a2 = a1.substring(0 , 2);
         System.out.println(a1);
         System.out.println(a2);                 
          // That why String is immutable
          //We can change the value of String by assigning 
          a2 = "Pawar" ;    
          System.out.println(a2);     

       // Operations on String objects are thread-safe. (They are thread safe  because String objects are immutable)
//        Unsynchronized read and write operations1 on non-final shared2 variables are not thread-safe, irrespective of the type of the variable.
           //e.g  
          
             String so = "How are You" ;
             so = so + "1" ;
             System.out.println(so); 
             
             
             
         
         StringBuffer b1 = new StringBuffer("SiddheshBuffer") ;
         System.out.println(b1);
         b1.append(" Pawar");            
         System.out.println(b1);
        // We can change the value
          
         
         
         "Siddhesh".indexOf('s');
         
         // Scanner sc = new Scanner(System.in);
         // String sp = sc.nextLine();
         // System.out.printf("Entered value : %s ",sp);
         // sc.close();
         
         
      
// In Java, strings are immutable, meaning that their values cannot be changed after they are created. When you perform operations on a string, such as concatenation, the original string remains unmodified, and a new string object is created with the desired changes.      
//--------------------------------------------------------------------------


    }
   
    
}
