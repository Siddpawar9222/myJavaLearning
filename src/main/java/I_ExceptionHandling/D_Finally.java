package I_ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class D_Finally {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
//	fr = new FileReader("D:\\Destop\\Coding\\Placement_Class\\Java_Eclipse\\MyJavaLearning\\src\\I_ExceptionHandling\\abc.txt");
			// OR
			fr = new FileReader(
					"src/I_ExceptionHandling/files/abc.txt");
			int read = fr.read();
			int result = read / 10;
			System.out.println(result);
			// It will only first character 0(Ascii value of 0 is 48) --> 48/10 =4
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

		System.out.println("Terminated Successfully...");

	}

}

/*
Java finally block : 
-finally block is always executed whether an exception is handled or not.
-It helps in doing the cleanup like- Rollback Transaction, Close Connection, Close a file etc.
-The important statements to be printed can be placed in the finally block.
-There are two main scenarios in which finally block is not executed:
  1. Program exits by calling system.exit() call.
  2. A fatal error causes JVM to crash.

 */

