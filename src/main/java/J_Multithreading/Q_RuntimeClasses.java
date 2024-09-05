package J_Multithreading;

import java.io.IOException;

public class Q_RuntimeClasses {

	public static void main(String[] args) throws IOException {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
/*
The purpose of the Runtime class is to provide access to the Java
Runtime system. This class provides certain important methods like:
1. Runtime.freeMemory() – This method returns the value of
free memory in JVM
2. Runtime.maxMemory() - This method returns the value of
maximum memory that JVM can use.
3. Runtime.gc() – This method can invoke garbage collection
Runtime.getRuntime().exec() : to invoke an external process from JVM.

 */
