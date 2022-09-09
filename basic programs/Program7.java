// finds if a string is palindrome or not
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        boolean isPalindrome = true;
        for(int i=0, j= str.length()-1; i<j ;i++,j-- ){
            if(str.charAt(i)==str.charAt(j))
                continue ;
            isPalindrome = false;
            break;
            
    }
        System.out.println(isPalindrome ? str+ " is palindrome" : str +" is not palindrome");
    }
    
}
