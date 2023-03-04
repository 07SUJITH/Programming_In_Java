
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Age must be at least 18");
    }
}

class AgeVerifier {

    int age;

    AgeVerifier(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException();
        else {
            this.age = age;
            System.out.println("Age is valid");
        }
    }

    public int getAge() {
        return age;
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        try {
            AgeVerifier verify = new AgeVerifier(age);
            System.out.println("Your age is " + verify.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
