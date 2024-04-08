package E_Strings.Program;

import java.util.Arrays;

//The occurrance of a in java
public class TestQ1 {
	public static void main(String[] args) {
		String s = "java";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("The occurrance of a in java is " + count);

		int[] arr = { 1, 2, 3, 4 };
		String ssString = Arrays.toString(arr);
		System.out.println(ssString); // simplest way to print the array as a string in Java

	}

}
