package K_FileHandling;

import java.io.*;

public class B_FileMethods {

	public static void main(String[] args) {
		
//		File f = new File("D:/Destop/Coding/Java/Java_Eclipse/MyJavaLearning/src/K_FileHandling/Data");
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);

//=============================================================
        
//		File f1 =new File(f ,"abc.txt");
//		File f2 =new File(f ,"xyz.txt");
//		
//		try {
//			boolean creteFile1 = f1.createNewFile();
//			boolean creteFile2 = f2.createNewFile();
//			if (creteFile1 && creteFile2) {
//				System.out.println("Files has been created in Data Folder");
//			}
//		} catch (IOException e) { 
//			e.printStackTrace();
//		}
////==============================================================
//		File f3 = new File("D:/Destop/Coding/Java/Java_Eclipse/MyJavaLearning/src");
//		String[] list = f3.list();
//		for(String element : list) {
//			 File f4 = new File("D:/Destop/Coding/Java/Java_Eclipse/MyJavaLearning/src/"+element);
//			 if(f4.isDirectory()) {
//				 System.out.println(element + " is a directory" );
//			 }else if(f4.isFile()){
//				System.out.println(element + " is a file");
//			}else {
//				System.out.println(element+ " is a unknown format");
//				
//			}
//		}
////=================================================================
//		
//		File f4 = new File("D:/Destop/Coding/Java/Java_Eclipse/MyJavaLearning/src/K_FileHandling/Data/abc.txt") ;
//		try {
//			boolean delete = f4.delete();   
//			if (delete) {
//				System.out.println("File deleted successfully");
//			}
//		} catch (Exception e) {
//			 System.out.println(e);
//		}
//====================================================================
		
		File f5 = new File("src/K_FileHandling/Data/xyz.txt") ;
		try {
			boolean exists = f5.exists();
			if (exists) {
				System.out.println("Yes ,File " + f5.getName() + " exists in directory");
				System.out.println(f5.getAbsolutePath());
				System.out.println(f5.length());
			}
		} catch (Exception e) {
			 System.out.println(e);
		}
		
		
	}

}

//mkdir() - return boolean and   Creates a directory
//list() -    Returns an array(String) of the files in the directory
//isFile() -  return boolean whether file or not
//isDirectory()-  return boolean whether directory or not
//delete(); - return boolean and delete the file
// exists() -return  Boolean and Tests whether the file exists
//getName() - return name of file
//getAbsolutePath() - return url (directory) of file
//length()  - (Long)	Returns the size of the file in bytes