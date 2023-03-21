/*

Enter the number of rows :7

 *
 *   *
 *       *
 *           *
 *               *
 *                   *
 *   *   *   *   *   *   *
 

 
 */

import java.util.Scanner;

public class Pattern13 {
    public static void rightTriangleStar(int n) {
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print(" *  ");
                else
                    System.out.print("    ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
            System.out.print(" *  ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        rightTriangleStar(n);
    }

}
