//Write a file handling program in Java with reader/writer. 

import java.io.*;

public class FileReader3 {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("sample1.txt");
            FileWriter fout = new FileWriter("sample2.txt");
            int unicode;
            while ((unicode = fin.read()) != -1) {
                System.out.print((char) unicode);
                fout.write(unicode);
            }
            fin.close();
            fout.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
