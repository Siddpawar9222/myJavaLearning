package K_IO_Stream.ByteStream.FileInput_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputOutput {

	public static void main(String[] args) throws IOException {
	   // FileInputStream and FileOutputStream for bytestream
    
		String INPUT = "src/K_IO_Stream/data/Apna-Bana-Le.mp3" ;
		String OUTPUT = "src/K_IO_Stream/data/Apna-Bana-Le(copy).mp3" ;
		
		FileInputStream reader = new FileInputStream(INPUT) ;
		FileOutputStream writer = new FileOutputStream(OUTPUT) ;
		
		byte buffer[] = new byte[1024] ;
		int byteRead = reader.read(buffer);
		int count=0 ;
		while (byteRead != -1 ) {
			writer.write(buffer ,0 ,byteRead);   //*
			byteRead = reader.read(buffer);
			++count ;
		}
		System.out.println(count);
		
		reader.close();
		writer.close();
		
		
	  System.out.println("success") ;
	}

}
//*--> .write(buffer, 0, bytesRead)-

//buffer: This is the byte array buffer that holds the data read from the input stream. It contains a portion of the data that needs to be written to the output stream.
//0-This is the starting index in the buffer from where the data should be written to the output stream. In this case, it starts from the beginning of the buffer.
//bytesRead: This is the number of bytes that were successfully read from the input stream and stored in the buffer. It represents the actual amount of data that needs to be written to the output stream.