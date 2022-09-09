import java.util.Scanner;

// read a number n   from the user and dispaly the following pattern
/* n=5
        *
       **
      ***
     ****
    *****
 */

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            
            for(int k=1; k<=i; k++)
                System.out.print("*");
            
            System.out.println();
        }
    }   
}
