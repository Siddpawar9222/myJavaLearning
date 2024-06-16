package F_Methods;

import java.util.Arrays;

public class A_BasicMethod {

	static int mul(int a)    
	{
		int result = a * a;
		return result;
	}

	static void change(int[] arr) {
     arr[0] = 500;   
    }

	static String changeForString(String name) {
		name = "Siddhesh";
		return name;

	}

	public static void main(String[] args) {
		//primitive datatypes(In primitive datatypes copy is passed)
		int a = 10;
		mul(a);
		System.out.println(a);


		//Changing the array(In array reference is passed)
        int[] marks = { 45, 96, 23, 78, 89, 50 };
		change(marks);
		System.out.println(Arrays.toString(marks));
        
	}

}
/*
Methods are block of code that perform particular task. We write business logic inside methods.
 */