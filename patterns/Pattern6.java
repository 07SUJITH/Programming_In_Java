
/*
  
Enter the number of rows :5
     * 
    *  * 
   *  *  * 
  *  *  *  * 
 *  *  *  *  * 

 
 */
import java.util.Scanner;

public class Pattern6 {
    public static void pyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(" * ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        pyramidPattern(n);
    }

}
