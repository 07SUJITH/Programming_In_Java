import java.util.Scanner;

// display the sum ,product and average of an intger array
public class Program17 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    Scanner input = new Scanner(System.in);
      System.out.println(" how many elements ?( max is 25)");
      int n = input.nextInt();
      
      while(n>25 || n<=0){
        System.out.println("Invalid number ,Try again");
        n = input.nextInt();
      }
      int[] numbers = new int[n];
      fillArrayOfNumbers(numbers);
      sumOfArrayOfNumbers(numbers);
      productOfArrayOfNumbers(numbers);
      averageOfArrayOfNumbers(numbers);
}

    private static void averageOfArrayOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("average is " +(double)sum/numbers.length);
    }

    private static void productOfArrayOfNumbers(int[] numbers) {
        int product = 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            product *= numbers[i];
        }
        System.out.println("product is " +product);
    }

    private static void sumOfArrayOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum is " + sum);
    }

    private static void fillArrayOfNumbers(int[] numbers) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter " + numbers.length +" numbers");
        for(int i=0;i<numbers.length;i++) {
         numbers[i]= sc.nextInt();
    }
}
}
