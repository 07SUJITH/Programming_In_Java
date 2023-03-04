// Write a Java program to illustrate Interface inheritance.

interface Shape {
    void draw();
}

interface Fillable extends Shape {
    void fillColor(String color);
}

class Circle implements Fillable {
    private String color;

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void fillColor(String color) {
        this.color = color;
        System.out.println("Filling the Circle with color: " + color);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.fillColor("Red");
    }
}