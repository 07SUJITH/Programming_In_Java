/*

Enter the number of lines :7
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567

 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines :");
        int line = sc.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = line - i; j > 0; j--)
                System.out.print(" ");
            for (int k = i; k > 0; k--)
                System.out.print(k);
            for (int k = 2; k <= i; k++)
                System.out.print(k);
            System.out.println();
        }
    }
}