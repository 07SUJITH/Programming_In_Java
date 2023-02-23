
// read the data from two files and write to a another file and also show the contents in file to console during 
//the copying of file
import java.io.*;

public class FileMerging {
    public static void main(String[] args) {

        try {
            FileInputStream fin1 = new FileInputStream("inputEx.txt");
            FileInputStream fin2 = new FileInputStream("outputEx.txt");
            FileOutputStream fout = new FileOutputStream("mergeEx.txt");
            int ascii;
            while ((ascii = fin1.read()) != -1) {
                System.out.print((char) ascii);
                fout.write(ascii);
            }
            while ((ascii = fin2.read()) != -1) {
                System.out.print((char) ascii);
                fout.write(ascii);
            }
            fin1.close();
            fin2.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
