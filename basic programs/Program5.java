import java.util.Scanner;

// finds if a string is palindrome or not
public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        String reverse="";// reverese is an empty string
        for(int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);// reverese=sreverse + str.charAt(i);

        }
         for(int i=0; i<reverse.length(); i++) {
            if(reverse.charAt(i)!=str.charAt(i)){
                System.out.println(str +" is not palindrome");
                return;}
            }
            System.out.println(str + " is palindrome");}

    }
    

