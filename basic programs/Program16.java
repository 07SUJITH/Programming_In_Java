import java.util.Arrays;
import java.util.Scanner;
//errror
// program that fill an array with n points entered  by the user (array of points)
public  class Program16{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println(" how many elements ?( max is 25)");
      int n = input.nextInt();
      
      while(n>25 || n<=0){
        System.out.println("Invalid number ,Try again");
        n = input.nextInt();
      }
      Point[] points = new Point[n];

      fillArrayOfPoints(points);
      printArrayOfPoints(points);
    
    
    }

    private static void printArrayOfPoints(Point[] points) {
      System.out.println("entered array of points");
      System.out.println(Arrays.toString(points));
      /*for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/
    }

    private static void fillArrayOfPoints(Point[] points) {
      Scanner input = new Scanner(System.in);

      
      for(int i=0;i<points.length;i++){
        System.out.print("enter the  x ans y of number " + (i +1)+" :");
        points[i] = new Point( input.nextInt() , input.nextInt());
      }
    
    }
}