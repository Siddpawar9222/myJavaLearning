package K_FileHandling;

import java.io.File;
import java.io.IOException;

//File Handling enables us to store the output of any particular program in a file and allows us to perform certain operations on it.
//In simple words, file handling means reading and writing data to a file

//===============================================

public class A_CreateAFile {

	public static void main(String[] args) {

		try {
			
			File f = new File(
					"src/K_FileHandling/data/myfile.txt");
			if (f.createNewFile()) {
				System.out.println("File has been created...");
			} else {
				System.out.println("File already present in dictatory...");
			}
		} catch (IOException e) {
			System.out.println("Error Occured " + e.getMessage());
		}
		
	}

}
// .createNewFile() = create a new empty file
//File f = new File("myfile.txt"); //create file in main folder(Here MyJavaLearning)
//"D:/Destop/Coding/Java/JavaEclipse/MyJavaLearning/src/K_FileHandling/myfile.txt"  --->This path is can be write as----> "src/K_FileHandling/myfile.txt"