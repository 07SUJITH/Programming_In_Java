import java.util.Scanner;
import java.util.InputMismatchException;
class TestException{
       static int[] getValue() throws InputMismatchException{
 	  Scanner sc =new Scanner(System.in);
 	  System.out.println("Enter number_1:");
 	  int a=sc.nextInt();
 	  System.out.println("Enter number_2");
 	  int b=sc.nextInt();
 	  int value[] ={a,b};
 	  return value;
       }
       public static void main(String args[]){
 	try{
 	     System.out.println("Program to perform Division");
 	     int value[]=getValue();
 	     int c=value[0]/value[1];
 	     System.out.println("result="+c);
 	}
 	catch(ArithmeticException e){
 	      System.out.println(e.getMessage());
 	}
 	catch(InputMismatchException e){
 	      System.out.println("Invalid integer input");
 	}
 	finally{
 	      System.out.println("End of operation");
 	}
       }
}
/* 
Program to perform Division
Enter number_1:
8
Enter number_2
4
result=2
End of operation

Program to perform Division
Enter number_1:
4
Enter number_2
0
/ by zero
End of operation

Program to perform Division
Enter number_1:
g
Invalid integer input
End of operation
*/