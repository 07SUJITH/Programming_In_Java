PROGRAM
import java.util.*;
class TestToken{
    public static void main(String[ ] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers separated by space:");
      StringTokenizer token = new StringTokenizer(sc.nextLine()," ");
      int sum=0;
      while(token.hasMoreTokens()){
        String num = token.nextToken();
        System.out.println(num);
        sum += Integer.parseInt(num);
      }
      System.out.println("sum="+sum);
  }
}
OUTPUT
Enter the numbers separated by space:
20 30 35 12
20
30
35
12
sum=97
