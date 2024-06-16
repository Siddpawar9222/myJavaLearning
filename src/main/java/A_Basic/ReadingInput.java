package A_Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ReadingInput {
    public static void main(String[] args) throws IOException
    {  
    	
    	//Scanner Class
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("The value of a is :");
        System.out.println(a);
        sc.close();
        
        //Buffered Reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader  br = new BufferedReader(isr) ;
        System.out.println("Enter your Name");
        String string =  br.readLine();
        System.out.println(string);
        System.out.println("Enter number");
        String string1 =  br.readLine();
        int num = Integer.parseInt(string1) ;
        System.out.println(num);
        
        
        //Note
//        BufferedReader is synchronous while Scanner is not. BufferedReader        should be used if we are working with multiple threads.
//        BufferedReader has a significantly larger buffer memory than Scanner.
//        The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
//        BufferedReader is a bit faster as compared to Scanner because the Scanner does the parsing of input data and BufferedReader simply reads a sequence of characters.

    }
}
