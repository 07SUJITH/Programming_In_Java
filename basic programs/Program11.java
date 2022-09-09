import java.util.Scanner;
 // read a number n   from the user and dispaly the following pattern
/* n=5

    *
   * *
  *   *
 *     *
*********
 */


public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt(); 
        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            
            for(int k=1; k<=2*i-1; k++){
                if(i==n)
                  System.out.print("*");
                else{
                    if(k==1||k==2*i-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }   
}
