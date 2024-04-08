package K_FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBufferStream {

	public static void main(String[] args) throws IOException {
		
		final String OUTPUT = "src/K_FileHandling/data/buffertxt.txt";
		FileOutputStream fout = new FileOutputStream(OUTPUT);
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String data = "Hello, BufferedOutputStream!";
		byte[] bytes = data.getBytes();
		bout.write(bytes);
		bout.flush();
		bout.close();
		fout.close();

		System.out.println("Success");

	}

}
//Using BufferedOutputStream is particularly useful when performing frequent write operations or when working with slow I/O devices, as it helps optimize I/O performance by reducing the number of system calls and improving data transfer efficiency.