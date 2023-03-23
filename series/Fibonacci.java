import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        int count = 0;
        System.out.print("Fibonacci series : ");
        while (count < n) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            count++;
        }
    }
}