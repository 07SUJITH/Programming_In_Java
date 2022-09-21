import java.util.Arrays;
import java.util.Scanner;

// program that fill an array with n intgers entered  by the user
public  class Program15{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println(" how many elements ?( max is 25)");
      int n = input.nextInt();
      
      while(n>25 || n<=0){
        System.out.println("Invalid number ,Try again");
        n = input.nextInt();
      }
      int[] numbers = new int[n];

      fillArrayOfNumbers(numbers);
      printArrayOfNumbers(numbers);
    
    
    }

    private static void printArrayOfNumbers(int[] numbers) {
      System.out.println("entered array of numbers");
      System.out.println(Arrays.toString(numbers));
      /*for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/
    }

    private static void fillArrayOfNumbers(int[] numbers) {
      Scanner input = new Scanner(System.in);

      
      for(int i=0;i<numbers.length;i++){
        System.out.print("enter the  number " + (i +1)+" :");
        numbers[i] = input.nextInt();
      }
    
    }
}