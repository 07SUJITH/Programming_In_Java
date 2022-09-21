public class Program25 {
    public static void main(String[] args) {
        Program24 p1 =new Program24();
        System.out.println(p1.getX());
        //p1.x=5; error because x is declered as private
        p1.setX(5);
        System.out.println(p1.getX());
     
    }
    
}
