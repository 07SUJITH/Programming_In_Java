import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.print("Enter a character :");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                count++;
        System.out.println("Frequency of " + ch + " in " + str + " = " + count);
    }
}
