import java.util.Scanner;

public class MatrixMultiplication {

    public static void display(int m, int n, int arr[][]) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.println(" " + arr[i][j]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of First matrix (m n) :");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();

        System.out.print("Enter the order of Second matrix (m n) :");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 != m2) {
            System.out.println("matrix multiplication not possible");
            System.exit(1);
        }

        int A[][] = new int[m1][n1];
        int B[][] = new int[m2][n2];
        int R[][] = new int[m1][n2];
        System.out.println("Enter the first matrix ");
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n1; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Enter the second matrix ");
        for (int i = 0; i < m2; i++)
            for (int j = 0; j < n2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n1; k++)
                    R[i][j] += A[i][k] * B[k][j];

        System.out.println("First matrix ");
        display(m1, n1, A);
        System.out.println("Second matrix ");
        display(m2, n2, B);
        System.out.println("Resultand matrix");
        display(m1, n2, R);
    }

}
