package K_IO_Stream.CharacterStream.FileReader_WriterStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C_ReadingData {

	public static void main(String[] args) throws IOException {
		
     File  f = new File("src/K_FileHandling/data/Input.txt") ;
     FileWriter writer = new FileWriter("src/K_FileHandling/data/FileOutput.txt");
     Scanner sc = new Scanner(f) ;
     while (sc.hasNextLine()) {
	   writer.write(sc.nextLine()) ;
	}
     
     writer.flush();  
     writer.close();
     sc.close();
    
     
	}

}
