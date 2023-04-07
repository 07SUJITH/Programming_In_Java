import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int n = scanner.nextInt();
        int count = 0;
        int number = 2; // start with the first prime number
        System.out.print("Prime series : ");
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
