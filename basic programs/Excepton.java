public class Excepton{
    public static void main(String[] args) {
       // String str=null;//nullpointer exception
        //System.out.println(str.length());
            try{
                int a=20,b=0;
                int c =a/b;//arithmetic exception
            }
            catch(ArithmeticException e){
               // System.out.println(e.getMessage());
               System.out.println("division of a number by zero not possible");
            }
            try{
                int num=Integer.parseInt("hello");
                System.out.println(num);
            }
            catch(NumberFormatException e){
                System.out.println(e.getMessage());
                //System.out.println("number format exception");
            }
            try{
                int arr[] =new int[5];
                arr[7]=5;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
    }
}