
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws NegativeNumberException {
        if (length < 0 || width < 0) {
            throw new NegativeNumberException("Invalid dimensions: Length and width cannot be negative.");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3)
            throws NegativeNumberException {
        if (base < 0 || height < 0 || side1 < 0 || side2 < 0 || side3 < 0) {
            throw new NegativeNumberException("Invalid dimensions: Base, height and sides cannot be negative.");
        }
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws NegativeNumberException {
        if (radius < 0) {
            throw new NegativeNumberException("Invalid dimensions: Radius cannot be negative.");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class AbstractionProblem {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        try {
            shapes[0] = new Rectangle(3, 5);
            shapes[1] = new Triangle(3, 4, 5, 6, 7);
            shapes[2] = new Circle(3);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            return;
        }
        double maxArea = Double.MIN_VALUE;
        double maxPerimeter = Double.MIN_VALUE;
        Shape maxAreaShape = null;
        Shape maxPerimeterShape = null;

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();

            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = shape;
            }

            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
                maxPerimeterShape = shape;
            }
        }

        System.out.println("Shape with largest area: " + maxAreaShape.getClass().getSimpleName());
        System.out.println("Area: " + maxArea);
        System.out.println();
        System.out.println("Shape with largest perimeter: " + maxPerimeterShape.getClass().getSimpleName());
        System.out.println("Perimeter: " + maxPerimeter);

    }
}