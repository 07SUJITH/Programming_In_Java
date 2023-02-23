
/*
 * Write a Java program which creates a class named 'Employee' having the
 * following
 * members: Name, Age, Phone number, Address, Salary. It also has a method named
 * 'printSalary( )' which prints the salary of the Employee. Two classes
 * 'Officer' and 'Manager'
 * inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data
 * members 'specialization' and 'department' respectively. Now, assign name,
 * age, phone number, address
 * and salary to an officer and a manager by making an object of both of these
 * classes and
 * print the same. (Exercise to understand inheritance)
 */
import java.util.Scanner;

class Employee {
    String name;
    int age;
    double phoneNumber;
    String address;
    double salary;

    Employee(String name, int age, double phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void display() {
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone number : " + phoneNumber);
        System.out.println("Address : " + address);
    }

    public void printSalary() {
        System.out.println("salary : " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, double phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, double phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the details of officer ");
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.print("Phone number : ");
        double phoneNumber = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address : ");
        String address = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();// by consuming the leftover new line using the nextLine() method.

        /*
         * // Read the integer
         * int var = sc.nextInt();
         * 
         * // Read the leftover new line
         * sc.nextLine();
         */
        System.out.print("Specialization : ");
        String specialization = sc.nextLine();

        Officer officer = new Officer(name, age, phoneNumber, address, salary, specialization);
        System.out.println("Enter  the details of manager ");
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Age : ");
        age = sc.nextInt();
        System.out.print("Phone number : ");
        phoneNumber = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address : ");
        address = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("department : ");
        String department = sc.nextLine();

        Manager manager = new Manager(name, age, phoneNumber, address, salary, department);
        System.out.println();
        System.out.println("Details of Officer");
        officer.display();
        officer.printSalary();
        System.out.println("specialzation : " + officer.specialization);

        System.out.println();
        System.out.println("Details of Manager");
        manager.display();
        manager.printSalary();
        System.out.println("department : " + manager.department);
    }
}
