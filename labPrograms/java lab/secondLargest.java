
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit :");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;// largest
        int second = Integer.MIN_VALUE;// second largest

        for (int i = 0; i < n; i++) {
            if (A[i] > first) {
                second = first;
                first = A[i];
            } else if (A[i] < first && A[i] > second) {
                second = A[i];
            }
        }
        System.out.println("largest element is :" + first);
        System.out.println("second largest element is :" + second);

    }

}
