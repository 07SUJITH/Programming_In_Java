import java.util.Scanner;

// read a number from the user and dispaly the following pattern
/* 1
 * 22
 * 333
 * 4444
 * 
 * nnnnnnnn...n
 */

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");
        System.out.println();
        }
   }
}
