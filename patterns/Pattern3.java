/*

  Enter the number of lines :10
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

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines :");
        int line = sc.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int k = i; k > 0; k--)
                System.out.print("* ");
            System.out.println();
        }
    }
}