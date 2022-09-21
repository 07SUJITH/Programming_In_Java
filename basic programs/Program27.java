import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        double amount;
        Scanner input = new Scanner(System.in);
        Account testAccount = new Account(1122,20000.0,4.5);
        System.out.println(" enter \n1 for withdraw  \n2 for deposit ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 :
                 System.out.println("enter the amount");
                 amount = input.nextDouble();
                 testAccount.withdraw(amount);
                 break;
            case 2 :
                 System.out.println("enter the amount");
                 amount = input.nextDouble();
                 testAccount.deposit(amount);   
                 break;
            default :
                 System.out.println("Wrong choice");
                 break;
                }
        

}
}
