import java.util.Scanner;

//create an array of 3rectangles read from the keyboard , then print the attributes,area and perimeter of each rectangleForCurrentValue()

public class Program26 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Rectangle[] rectangle = new Rectangle[3];//null ,null ,null
    for(int i = 0; i < rectangle.length; i++){
        System.out.println("Do you want to enter the width and height of rectangle " +(i+1) + " ? (y/n)" );
        char choice=input.next().charAt(0);
        if(choice=='y'||choice=='Y'){
            System.out.println("Enter the width and height:");
            rectangle[i] = new Rectangle(input.nextDouble(), input.nextDouble());
        }
        else
        rectangle[i] = new Rectangle(); 
    }
    System.out.println("the rectangles are :");
    for(int i = 0; i < rectangle.length; i++){
        System.out.println("rectangle "+ (i+1));
        System.out.println("width: "+rectangle[i].getWidth()+" height: "+rectangle[i].getHeight());
        System.out.println("area: "+rectangle[i].getArea()+ " perimeter: "+rectangle[i].getPerimeter() );
        System.out.println();
    }
}
}
