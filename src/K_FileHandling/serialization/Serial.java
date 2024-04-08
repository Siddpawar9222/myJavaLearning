package K_FileHandling.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {

		try {
			Student student = new Student("Siddhesh Pawar", "sidd@email.com", "Korahle Khurd", 23);
            
			//write data in file
			FileOutputStream fos = new FileOutputStream("src/K_FileHandling/serialization/output.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos) ;
			
			//how to serialize
			oos.writeObject(student);
			oos.close();
			fos.close();
			System.out.println("Object state transerred to file !!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
