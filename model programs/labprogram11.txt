/*
 write a program to read the first n characters in a file where n is given by the  
user. The characters read from file has to be reversed and displayed on 
screen and also store in another file. Built in methods can be used in the program
 */

import java.io.*;
import java.util.Scanner;

public class ReadCharacters {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("readfile.txt");
            fw = new FileWriter("writefile.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("how many characters should read ?");
            int n = sc.nextInt();
            int i;
            int j = 0;
            String str = "";
            while (((i = fr.read()) != -1) && j < n) {
                str = str + Character.toString((char) i);
                j++;
            }
            System.out.println("n characters :" + str);
            str = new StringBuilder(str).reverse().toString();
            System.out.println("reversed charcters : " + str);
            j = 0;
            fw.write(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Error in closing files");
            }
        }
    }

}
