public class Rectangle{
    private double width;  // attribute
    private double height;
    Rectangle(){
        this(1.0,1.0);//calling the second constructor
    };
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width ;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }


}