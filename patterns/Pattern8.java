/*

Enter the number of rows :10
                  *
                * *
              * * *
            * * * *
          * * * * *
        * * * * * *
      * * * * * * *
    * * * * * * * *
  * * * * * * * * *
* * * * * * * * * *


 */

import java.util.Scanner;

public class Pattern8 {

    public static void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        leftTriangle(n);
    }

}
