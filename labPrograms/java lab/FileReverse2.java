
// read n numbers from the file and store in one file and store reverse in another file 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReverse2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("numbers.txt");
            FileWriter fw1 = new FileWriter("newNormal.txt");
            FileWriter fw2 = new FileWriter("newReverse.txt");
            System.out.println("how many numbers should read from the file :");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i, num = 0, rev = 0;
            int j = 0;
            while ((i = fr.read()) != -1 && j < n) {
                num = (num * 10) + i - 48;
                j++;
            }
            int temp = num;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            System.out.println(num + " " + rev);
            fw1.write(" " + num);
            fw2.write(" " + rev);
            fr.close();
            fw1.close();
            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
