import java.util.Scanner;

//print prime numbers between two numbers

public class Program14 {
    public static void main(String[] args) {
        System.out.println("enter the range (a,b)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime numbers between " + a + " and " + b);
        printPrimeBetween(a, b);

    }
  public static void printPrimeBetween(int a, int b) {
    for(int i = a+1;i<b ; i++) {
       if(isPrime(i))
          System.out.print(i + " ");
    }
}
    public static boolean isPrime (int num){
      // boolean prime = true;
          for(int j=2;j<=num/2;j++) {
             if(num%j==0) {
               return false;
            }
          }
         return true;

   
     }

} 
            