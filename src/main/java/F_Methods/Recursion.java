package F_Methods;

//Recursion in java is a process in which a method calls itself continuously
//It makes the code compact but complex to understand.
import java.util.Scanner;

public class Recursion {
	static int factorial(int a) {
		if (a == 0 || a == 1) {
			return 1;
		} else {
			return (a * factorial(a - 1));
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.printf("Factorial of %d is %d", n, factorial(n));
		sc.close();

	}

}
