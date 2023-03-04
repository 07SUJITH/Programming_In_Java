
// Write a Java program that reads a file and displays the file on the console, with a line 
// number before each line .And also write this displayed content into an file with displayed format

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileReaderWithLineNumber {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("input.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("output.txt");
            bw = new BufferedWriter(fw);
            String line = br.readLine();
            int lineNumber = 1;
            while (line != null) {
                System.out.println(lineNumber + " : " + line);
                bw.write(lineNumber + " : " + line);
                bw.newLine();
                lineNumber++;
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();

            } catch (IOException e) {
                System.out.println("An error occurred while closing objects");
            }
        }
    }
}
