/*
 Sandglass Star Pattern

 Enter the number of rows :5

 *   *   *   *   *
   *   *   *   *
     *   *   *
       *   *
         *
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *

 */

import java.util.Scanner;

public class Pattern12 {
    public static void sandGlass(int n) {
        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int space = n - i; space > 0; space--)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *  ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        sandGlass(n);
    }

}
