import java.util.Scanner;

// displays reverse of a given string 
public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        
    }
}
