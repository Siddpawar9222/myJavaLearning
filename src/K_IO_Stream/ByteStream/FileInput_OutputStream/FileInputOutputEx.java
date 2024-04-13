package K_IO_Stream.ByteStream.FileInput_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputEx {

	public static void main(String[] args) throws IOException {
		//Reading
		FileInputStream stream = new FileInputStream("D:/Destop/Coding/Java/JavaEclipse/MyJavaLearning/src/K_FileHandling/data/data.txt") ;
          
		int result = stream.read();
		
/*		result = stream.read();
		result = stream.read();
		result = stream.read();
		result = stream.read();
*/		
		
		StringBuilder sb = new StringBuilder("") ;
		while(result!=-1) {          //eof=-1
			sb.append((char)result);
			 result = stream.read();
		}
		System.out.println(sb);
		stream.close();
//===========================================================================	     
		//Writing
		FileOutputStream stream2 = new FileOutputStream("D:/Destop/Coding/Java/JavaEclipse/MyJavaLearning/src/K_FileHandling/data/output.txt"); 
		stream2.write(sb.toString().getBytes());
		
		String str = "New Data" ;
		stream2.write(str.getBytes());    //append the data
		stream2.close();
		
//============================================
		
		FileOutputStream stream3 = new FileOutputStream("D:/Destop/Coding/Java/JavaEclipse/MyJavaLearning/src/K_FileHandling/data/output.txt",true); //true means data will append, without writing true it will rewrite data(erase the data)
		
		String str1 = "New Data of Stream 3" ;
		stream3.write(str1.getBytes());
		stream3.close();
		
		System.out.println("Success");
	}

}
