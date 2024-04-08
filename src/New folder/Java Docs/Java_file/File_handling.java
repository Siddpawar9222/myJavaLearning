import java.io.File;
import java.io.IOException;
public class File_handling {
    public static void main(String[] args) {
        try {
            File FileName = new File("D:\\Destop\\Coding\\Java_Project\\Java Docs\\Java_file\\Siddhesh.txt");
            FileName.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
