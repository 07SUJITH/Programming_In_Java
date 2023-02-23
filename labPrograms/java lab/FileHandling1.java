//Write a Java program that read from a file and write to file by handling all file related exception

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling1 {

    public static void main(String[] args) {
        // Open the input file
        Scanner in = null;
        try {
            File inputFile = new File("input.txt");
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
            System.exit(1);
        }

        // Open the output file
        PrintWriter out = null;
        try {
            File outputFile = new File("output.txt");
            out = new PrintWriter(outputFile);
        } catch (IOException e) {
            System.err.println("Error: Unable to open file for writing");
            System.exit(1);
        }

        // Read from the input file and write to the output file
        try {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }

        // Close the files
        try {
            in.close();
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("File handling complete");
    }
}
