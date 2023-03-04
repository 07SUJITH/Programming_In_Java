import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            System.out.println("Multiplication of two numbers");
            System.out.print("Enter number_1 : ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.print("Enter number_2: ");
            int num2 = Integer.parseInt(br.readLine());

            System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("End of program ");
        }
    }

}
