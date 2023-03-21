
/*

       1 
     2 3 2 
    3 4 5 4 3 
   4 5 6 7 6 5 4 
  5 6 7 8 9 8 7 6 5 
 6 7 8 9 10 11 10 9 8 7 6 
7 8 9 10 11 12 13 12 11 10 9 8 7 


 */
import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, num;
        System.out.print("Enter the number of lines : ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            num = i;
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++, num++)
                System.out.print(num + " ");

            num = num - 2;
            for (j = 1; j < i; j++, num--)
                System.out.print(num + " ");

            System.out.println();
        }
    }
}
