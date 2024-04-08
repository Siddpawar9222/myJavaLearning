package K_FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// FileReader For character streams
		
		
		final String INPUT = "src/K_FileHandling/data/Input.txt";
		final String OUTPUT = "src/K_FileHandling/data/Outputtxt.txt";
		FileReader reader = new FileReader(INPUT);
		FileWriter writer = new FileWriter(OUTPUT);
		int charRead = reader.read();
		System.out.println(charRead);
		int count = 0;
		while (charRead != -1) {
			if (Character.isLetterOrDigit((char) charRead)) {
                 writer.write((char) charRead);
				System.out.println(++count);
			}
			charRead = reader.read();
		}
		reader.close();
		writer.close();
		System.out.println("Success");

	}

}
//Without  Character.isLetterOrDigit((char) charRead) --> count=302 -->count every character in the input file, including spaces, newlines, and any other special characters.

//with  Character.isLetterOrDigit((char) charRead) --> count=238 -->  check if the character is a letter, digit, or space.
