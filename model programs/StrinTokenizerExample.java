
// Write a Java program that reads a line of integers, and then displays each integer, and the 
// sum of all the integers (Use String Tokenizer class of java.util)
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrinTokenizerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by space :");
        String str = sc.nextLine();
        StringTokenizer token = new StringTokenizer(str, " ");
        int sum = 0;
        int number;
        while (token.hasMoreTokens()) {
            number = Integer.parseInt(token.nextToken());
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("sume = " + sum);
    }

}
