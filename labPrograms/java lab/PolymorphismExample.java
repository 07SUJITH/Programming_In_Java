/*
 Write a java program to create an abstract class named Shape that contains an empty 
method named numberOfSides( ). Provide three classes named Rectangle, Triangle and 
Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures. (Exercise to understand polymorphism).
 */

abstract class Shape {
    public void numberOfSides() {

    }
}

class Hexagon extends Shape {

    public void numberOfSides() {
        System.out.println("number of sides of Hexagon  : 6 ");
    }
}

class Rectangle extends Shape {

    public void numberOfSides() {
        System.out.println("number of sides of Recatangle : 4 ");
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        System.out.println("number of sides of Triangle : 3 ");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Hexagon h = new Hexagon();
        t.numberOfSides();
        r.numberOfSides();
        h.numberOfSides();
    }
}
