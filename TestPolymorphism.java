abstract class Shape{
	public abstract void numberOfSides();
}
class Triangle extends Shape{
	public void numberOfSides(){
		System.out.println("Number of Sides of triangle= 3");
	}
}
class Rectangle extends Shape{
	public void numberOfSides(){
		System.out.println("Number of Sides of rectangle= 4");
	}
}
class Hexagon extends Shape{
	public void numberOfSides(){
		System.out.println("Number of Sides of hexagon= 6");
	}
}
class TestPolymorphism{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		t.numberOfSides();
        r.numberOfSides();
		h.numberOfSides();
	}
}
output
Number of Sides of triangle= 3
Number of Sides of rectangle= 4
Number of Sides of hexagon= 6
