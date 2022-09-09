// finds if a string is palindrome or not
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(str.length()-i-1))
               { System.out.println(str + " is not palindrome");
                 return;

                }   
             System.out.println(str + " is  palindrome");

        }
      
    }
    
}
