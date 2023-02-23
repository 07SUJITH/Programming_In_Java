
// //Write a Java program that read from a file and write to file by handling all file related exception
import java.io.*;

public class FileHandling2 {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("inhand.txt");
            FileOutputStream fout = new FileOutputStream("outhand.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
                fout.write(i);
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
/*
 * 0. START
 * 1. import the necessary package: java.io.*
 * 2. Define a public class named "FileHandling2"
 * 3. Define a public static void method named "main" with a string array
 * argument "args"
 * 4. Surround the entire code with a try-catch block to handle any file-related
 * exceptions that may occur
 * 5. Inside the try block,
 * 5.1 create a new FileInputStream object named "fin" that reads from the file
 * "inhand.txt"
 * 5.2 Create a new FileOutputStream object named "fout" that writes to the file
 * "outhand.txt"
 * 5.3 Declare an integer variable "i" to hold the value of the byte being read
 * 5.6 WHILE (i=fin.read()) != -1 do
 * 1. cast the integer value to a character and print it to the console using
 * System.out.print()
 * 2. Write the byte to the output file using the FileOutputStream object
 * "fout.write(i)"
 * 5.7 close both the FileInputStream and FileOutputStream objects using
 * "fin.close()" and "fout.close()"
 * 6.In the catch block,
 * 6.1 if a FileNotFoundException occurs,
 * print the error message to the console using
 * "System.err.println(e.getMessage())"
 * 7. In the catch block,
 * 7.1 if an IOException occurs,
 * print the error message to the console using
 * "System.err.println(e.getMessage())"
 * 8. End the try-catch block
 * 9. END
 * 
 */