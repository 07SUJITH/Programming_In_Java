import java.util.Scanner;

class ReverseString {

    static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(chars);
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedString = reverseString(str);
        System.out.print("Reversed string: " + reversedString);
    }
}
