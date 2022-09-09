import java.util.Scanner;

// reverse the string in new string and  display the reverse

public class Program4 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        String reverse="";// reverese is an empty string
        int j=0;
        for(int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);// reverese=sreverse + str.charAt(i);

        }
        System.out.println(reverse);
    
}
}
