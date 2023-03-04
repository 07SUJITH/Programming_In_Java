import java.util.Scanner;

class EmployeeClass {

    private String name;
    private double salary;
    private String phoneNumber;

    public void setDetails(String name, double salary, String phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;

    }

    public void salaryIncrement() {
        if (salary > 100000) {
            double temp = salary - 100000;
            salary = salary + (temp * 25) / 100;
        }
    }

    public void display() {
        System.out.println("\n DETAILS \n");
        System.out.println("Name : " + name);
        System.out.println("salary :" + salary);
        System.out.println("phoneNumber : " + phoneNumber);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name :");
        String name = sc.nextLine();
        System.out.print("Enter the salary :");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the Phone Number :");
        String phoneNumber = sc.nextLine();

        EmployeeClass emp = new EmployeeClass();
        emp.setDetails(name, salary, phoneNumber);
        emp.salaryIncrement();
        emp.display();
    }
}
