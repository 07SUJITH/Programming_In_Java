
// Write a Java program that displays the number of characters, lines and words in a text file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDataInfo {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("input.txt"));
            int characters = 0;
            int lines = 0;
            int words = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lines++;
                characters += line.length();
                words += line.split(" ").length;
            }
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
