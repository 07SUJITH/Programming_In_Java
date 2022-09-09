import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    // a Scanner object, reader is created to read a number from the user's keyboard. 
    
    System.out.println("enter a number");
    int x = reader.nextInt();
    //The entered number is then stored in a variable x
    
    if (x % 2 == 1) {
      System.out.println(x + " odd number");

    } else {
      System.out.println(x + " Even number");
    }

  }
}
