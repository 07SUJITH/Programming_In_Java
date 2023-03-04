import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

    public static void divide(int a, int b) throws ArithmeticException {
        System.out.println("number_1 :" + a);
        System.out.println("number_2 :" + b);
        if (b == 0)
            throw new ArithmeticException("division by zero not possible");
        else {
            int result = a / b;
            System.out.println("result after division : " + result);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First  Number  :");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number :");
            int num2 = sc.nextInt();

            divide(num1, num2);

        } catch (InputMismatchException e) {
            System.err.println("Invalid integer input ");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("program for division completed");
        }
    }

}
