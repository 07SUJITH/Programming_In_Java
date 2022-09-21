import java.awt.*;
public class Circle {
    Point center;  // attributes or data field in the class Circle
    double radius; // attributes or data field in the class Circle


    Circle(){} // constructor overloading based on number of arguments
    Circle(Point center, double radius){
        this.radius=radius;// assigning parameter radius to attribue radius 
        this.center=center;
    }
    double getPerimeter(){// method to calculate  perimeter  
        return 2*Math.PI*this.radius;
    }
    double getArea(){
        return  Math.PI*this.radius*this.radius;
    }
    void setCenter(Point center){
        this.center=center;
    }
    void setRadius(double radius){
        this.radius=radius;
    }

}
