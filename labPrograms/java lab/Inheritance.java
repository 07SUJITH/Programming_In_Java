/*
 * Write two Java classes Employee and Engineer. Engineer should inherit from Employee 
class. Employee class to have two methods display() and calcSalary(). Write a program to 
display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed). 
● display() only prints the name of the class and does not return any value. Ex. “ Name 
of class is Employee.” 
● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in 
Engineer displays “Salary of employee is 20000.”
 */

class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }

    void calcSlary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    @Override
    void display() {
        System.out.println("Name of class is Engineer");
    }

    void calcSlary() {
        System.out.println("Salary of Engineer  is 20000");
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Employee emp = new Engineer();

        /*
         * creates a new object of the class Engineer and assigns its reference to the
         * Employee reference variable emp.
         * Employee emp declares a reference variable named emp of the type Employee.
         * The reference variable emp can refer to an object of the class Employee or
         * any of its subclasses, such as Engineer
         */
        emp.display();
        emp.calcSlary();
    }
}
