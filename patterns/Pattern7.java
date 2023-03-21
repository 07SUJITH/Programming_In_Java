/*

Enter the number of rows :7
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *


 */

import java.util.Scanner;

public class Pattern7 {

    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        rightTriangle(n);
    }

}
