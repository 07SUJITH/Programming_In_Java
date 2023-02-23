
// Write a Java program that checks whether a given string is a palindrome or not.
// Ex: MALAYALAM is palindrom
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        int length = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++)
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }

        if (isPalindrome)
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}