package A_Basic;

import java.util.*;
  
public class MethodsOfScanner {    
    public static void main(String args[]){       
          String s = "Hello, This is JavaTpoint.";  
         //Create scanner Object and pass string in it  
         Scanner scan = new Scanner(s);  

         //Check if the scanner has a token(Input) or not 
         System.out.println("Result: " + scan.hasNext());   //boolean result
         
         //next() splits the line up into individual words, returning individual text Strings one at a time
         System.out.println("String(Word):" + scan.next());
         
         //nextLine() returns every character in a line of text right up until the carriage return
         System.out.println("String: " + scan.nextLine());  
         //Check if the scanner has a token after printing the line  
         System.out.println("Final Result: " + scan.hasNext());  
         //Close the scanner 
         
         // System.out.println("--->" + scan.nextLine());
         scan.close();  
       }    
    }  
