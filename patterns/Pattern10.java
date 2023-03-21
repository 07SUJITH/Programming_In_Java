/*


Enter the number of rows :10
*  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  
*  *  *  *  *  *  
*  *  *  *  *  
*  *  *  *  
*  *  *  
*  *  
*  


 */

import java.util.Scanner;

public class Pattern10 {
    public static void downwardTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        downwardTriangle(n);
    }

}
