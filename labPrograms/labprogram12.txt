/*
 Create a user defined exception "lnvalidAgeException'. Write a Java program  that takes age as a Command Line Argument. Raise the Exception InvalidAgeException' if age is less than 18
  
*/

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Agevalidator {
    public static void main(String args[]) {
        try {
            int age = Integer.parseInt(args[0]);
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18");
            }
            System.out.println("Age is valid");
        } catch (NumberFormatException e) {
            System.err.println("Invalid age: " + args[0]);
        } catch (InvalidAgeException e) {
            System.err.println("Invalid age: " + e.getMessage());
        }
    }
}
