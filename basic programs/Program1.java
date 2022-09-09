
// Reads an integer n and display nth fibonacci number
import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        int n= input.nextInt();

        int f1=1;
        int f2=1;
        int result=0;
        if(n<=0){
            System.out.println("invalid nmber");   
        }
        else if(n==1|| n==2){
            System.out.println("fibonacci number at " + n + " is 1");
        }
        else{
            for(int i=0;i<n-2;i++){
                result= f1+f2;
                f1=f2;
                f2=result;
                
            }


            System.out.println("fibonacci number at " + n + " is " + result);
        }

        
    }
}
