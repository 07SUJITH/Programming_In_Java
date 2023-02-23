
//Write a Java program to calculate the area of different shapes namely circle, rectangle, 
//and triangle using the concept of method overloading. 
import java.lang.Math;
import java.util.Scanner;

public class MethodOverloading {
    public static void areaOfShapes(float radius) {
        float area = (float) (radius * radius * Math.PI);
        System.out.println("area of cicle :" + area);
    }

    public static void areaOfShapes(float length, float breadth) {
        float area = length * breadth;
        System.out.println("area of rectangle :" + area);
    }

    public static void areaOfShapes(float a, float b, float c) {
        float s = (a + b + c) / 2;
        float x = s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(x);
        System.out.println("area of triangle :" + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of circle : ");
        areaOfShapes(sc.nextInt());
        System.out.print("enter the length and breadth of rectangle :");
        areaOfShapes(sc.nextInt(), sc.nextInt());
        System.out.print("enter the 3 sides of triangle :");
        areaOfShapes(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
