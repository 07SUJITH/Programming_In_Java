/*
 
                     1 
                   2 3 2 
                  3 4 5 4 3 
                 4 5 6 7 6 5 4 
                5 6 7 8 9 8 7 6 5 
               6 7 8 9 0 1 0 9 8 7 6 
              7 8 9 0 1 2 3 2 1 0 9 8 7 
             8 9 0 1 2 3 4 5 4 3 2 1 0 9 8 
            9 0 1 2 3 4 5 6 7 6 5 4 3 2 1 0 9 
           0 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 0 
          1 2 3 4 5 6 7 8 9 0 1 0 9 8 7 6 5 4 3 2 1 
         2 3 4 5 6 7 8 9 0 1 2 3 2 1 0 9 8 7 6 5 4 3 2 
        3 4 5 6 7 8 9 0 1 2 3 4 5 4 3 2 1 0 9 8 7 6 5 4 3 
       4 5 6 7 8 9 0 1 2 3 4 5 6 7 6 5 4 3 2 1 0 9 8 7 6 5 4 
      5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 
     6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 0 9 8 7 6 5 4 3 2 1 0 9 8 7 6 
    7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 2 1 0 9 8 7 6 5 4 3 2 1 0 9 8 7 
   8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0 9 8 
  9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0 9 
 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0 
1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 0 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 
 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, num;
        System.out.print("Enter the number of lines : ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            num = i;
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++, num++) {
                // if (num > 9)
                // num = num % 10;
                System.out.print(num % 10 + " ");

            }

            num = num - 2;
            for (j = 1; j < i; j++, num--) {
                // if (num < 0)
                // num = 9;
                System.out.print((num % 10 + 10) % 10 + " ");
            }

            System.out.println();
        }
    }
}
