package K_IO_Stream.CharacterStream.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadHTMLFile {
        public static void main(String[] args) throws IOException {

            //read file
            File iFile = new File("src/K_IO_Stream/Data/index.html");
            FileReader fileReader = new FileReader(iFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //write file
            File oFile = new File("src/K_IO_Stream/Data/output.html");
            FileWriter fileWriter = new FileWriter(oFile);

            String line;
            while ((line=bufferedReader.readLine())!=null) {
                //System.out.println(line);
                fileWriter.write(line);
            }

            bufferedReader.close();
            fileWriter.close();
        }
}
