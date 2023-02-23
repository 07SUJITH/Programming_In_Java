import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException() {
        super("Age must be atleast 18");
    }

}

class AgeVerifier {
    private int age;

    public AgeVerifier(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException();
        else {
            this.age = age;
            System.out.println("Age is verified ");
        }
    }

    public int getAge() {
        return age;
    }
}

public class UseerDefinedExceptionExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        try {
            AgeVerifier v = new AgeVerifier(age);
            System.out.println("your age is : " + v.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
