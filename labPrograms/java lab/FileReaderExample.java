
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("inputFile.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("outputfile.txt");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                fw.write(line);
            }
            fw.close();
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
