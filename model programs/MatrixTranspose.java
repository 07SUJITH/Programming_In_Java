import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int original[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                original[i][j] = sc.nextInt();

        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                transpose[j][i] = original[i][j];

        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(original[i][j] + " ");
            System.out.println();
        }
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }
}
/*
 * 
 * Create a Scanner object to read inputs from the user.
 * Read the number of rows (m) of the matrix.
 * Read the number of columns (n) of the matrix.
 * Create a 2D array of size m x n to store the elements of the matrix.
 * Read the elements of the matrix and store them in the 2D array.
 * Create another 2D array of size n x m to store the transposed matrix.
 * Transpose the matrix by swapping the rows and columns of the original matrix
 * and storing the result in the new 2D array.
 * Print the original matrix.
 * Print the transposed matrix.
 */