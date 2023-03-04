
// Write a Java program to find the second smallest element in an array
import java.util.Scanner;

public class SecondSmallest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[20];
        System.out.print("enter the size :");
        int size = sc.nextInt();
        System.out.print("enter the numbers :");
        for (int i = 0; i < size; i++)
            numbers[i] = sc.nextInt();

        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        int secondSmallest = 0;
        for (int i = 1; i < size - 1; i++)
            if (numbers[i] < numbers[secondSmallest])
                secondSmallest = i;

        System.out.println("second smallest element :" + numbers[secondSmallest]);

    }
}
