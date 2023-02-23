
/* calculate the average of the integers in the input line. If a negative integer is encountered in the input line,
 then throw a user defined NegativeNumberException  */

import java.util.Scanner;
import java.util.StringTokenizer;

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super("Numbers should be positive ");
    }
}

public class labProgram1 {

    public static float averageOfLine(String line) throws NegativeNumberException {
        float average;
        int size = 0;
        int sum = 0;
        StringTokenizer token = new StringTokenizer(line, " ");
        while (token.hasMoreTokens()) {
            size++;
            int num = Integer.parseInt(token.nextToken());
            if (num < 0)
                throw new NegativeNumberException();
            else
                sum = sum + num;
        }
        average = (float) sum / size;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of integers separated by space :");
        String line = sc.nextLine();
        try {
            System.out.println("average of integers in  line : " + averageOfLine(line));
        } catch (NegativeNumberException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

/*
 * 
 * 
 * ALGORITHM
 * 
 * 1]Start the program.
 * 
 * 2]Declare a new class called NegativeNumberException which extends the
 * built-in Exception class. Inside the class, define a constructor that sets
 * the error message to "Numbers should be positive".
 * 
 * 3]Define a new class called labProgram1.
 * 
 * 4]Inside the labProgram1 class, define a static method called averageOfLine
 * that takes a string argument line and returns a float. The method can throw a
 * NegativeNumberException if it encounters a negative number in the input
 * string.
 * 
 * 5]Declare the local variables average, size, and sum as integers.
 * 
 * 6]Create a new StringTokenizer object called token to tokenize the input
 * string with a space as the delimiter.
 * 
 * 7]While the token object has more tokens, do the following:
 * a. Increment the size variable by 1.
 * b. Parse the next token to an integer using Integer.parseInt().
 * c. If the number is negative, throw a new NegativeNumberException.
 * d. Otherwise, add the number to the sum variable.
 * 
 * 8]Calculate the average of the input integers by dividing sum by size and
 * cast the result to a float.
 * 
 * 9]Return the average from the averageOfLine method.
 * 
 * 10]In the main method, create a new Scanner object called sc to read input
 * from the console.
 * 
 * 11]Print a message to the console asking the user to enter a line of integers
 * separated by space.
 * 
 * 12]Read the user input from the console using the nextLine() method of the
 * Scanner object and store it in a string variable called line.
 * 
 * 13]Call the averageOfLine method with the line variable as an argument.
 * 
 * 14]Print the calculated average to the console.
 * 
 * 15]If a NegativeNumberException is caught, print the error message and stack
 * trace to the console.
 * 
 * 16]End the program.
 * 
 */