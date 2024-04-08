package A_Basic ;

import java.io.PrintStream;
import java.util.Scanner;

public class Hello_World {

	public static void main(String args[]) {
		int x = 10;
		float y = 88;

//----------------------------------------------------------------------
		System.out.print("Hello World");
		System.out.print(" Good bye");
		System.out.println();
		System.out.printf("The value of x is %d\n", x);
		System.out.printf("The value of y/x is %f", y / x);
//-----------------------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of z ");
		int z = scanner.nextInt();
		System.out.println("The value of z is " + z);
        scanner.close();
   }

}