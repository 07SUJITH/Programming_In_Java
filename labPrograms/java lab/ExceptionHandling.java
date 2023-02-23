
// Write a Java program that shows the usage of try, catch, throws and finally
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {

    static int[] readNumbers() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        int[] numbers = { num1, num2 };
        return numbers;
    }

    public static void main(String[] args) {
        try {
            int numbers[] = readNumbers();
            System.out.println("number 1 : " + numbers[0]);
            System.out.println("number 2 : " + numbers[1]);
            float result = numbers[0] / numbers[1];
            System.out.println("Result after division :" + result);
        } catch (InputMismatchException e) {
            System.err.println("Invalid integer input ");

        } catch (ArithmeticException e) {
            System.err.println("Division by zero not possible");

        } finally {
            System.out.println("\nProgram finished ,Visit again !");
        }
    }
}
