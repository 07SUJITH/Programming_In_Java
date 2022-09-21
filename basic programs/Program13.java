import java.util.Scanner;
//a method that gets the name of the user and a method that gets the age of the user
public class Program13 {
    public static void main(String[] args) {
       System.out.println("enter a name");
       System.out.println("entered name is " + getName());
       System.out.println("enter the age ");
       System.out.println("entered age is " + getAge());
    }
    public static String getName(){
      // Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        // if you want to use  the object only one time there is no need to create a variable that references the object
                return new Scanner(System.in).nextLine(); 

    } 
    public static int getAge(){
        //Scanner sc = new Scanner(System.in);
        //int age = sc.nextInt();
        return new Scanner(System.in).nextInt();
    }
}
