
// Write a Java program to check whether a given number is prime or not. 
// import java.util.Scanner;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a number : ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            System.out.println(number + " is not a prime number");
            return;
        }
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        if (isPrime)
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is not prime number");
    }
}
