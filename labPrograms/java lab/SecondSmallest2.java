import java.util.Scanner;

public class SecondSmallest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit :");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE;// smallest
        int second = Integer.MAX_VALUE;// second smallest

        for (int i = 0; i < n; i++) {
            if (A[i] < first) {
                second = first;
                first = A[i];
            } else if (A[i] > first && A[i] < second) {
                second = A[i];
            }
        }
        System.out.println("smallest element is :" + first);
        System.out.println("second smallest element is :" + second);

    }

}
