package K_IO_Stream.ByteStream.ObjectInput_OutputSteam.Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import K_IO_Stream.ByteStream.ObjectInput_OutputSteam.serialization.Student;



public class Deserial {

	public static void main(String[] args)  {
		try {
		FileInputStream fis = new FileInputStream("src/K_FileHandling/serialization/output.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student=(Student) ois.readObject();
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getAddress());
		System.out.println(student.getAge());
		student.showSkills();

		ois.close();
		fis.close();
		
		
		} catch (Exception e) {
           e.printStackTrace();
		}

	}

}
