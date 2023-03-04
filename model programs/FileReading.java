/*
 write a java program to  read data from a file using FileInputStream and write data to a file using FileOutputStream.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String ipfileName = "inputEx.txt";
        String opfileName = "outputEx.txt";
        try {
            FileInputStream fin = new FileInputStream(ipfileName);
            FileOutputStream fout = new FileOutputStream(opfileName);
            int ascii;
            while ((ascii = fin.read()) != -1) {
                System.out.print((char) ascii);
                fout.write(ascii);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
