import java.util.Scanner;
class FrequencyCount{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the string :");
	String str =in.nextLine();
	System.out.print("Enter the character :");
	char ch =in.nextLine().charAt(0);
	int count=0;
	for(int i=0;i<str.length();i++)
	     if(str.charAt(i)==ch)
		    count++;
	System.out.println("Count of occurence of "+ch+" =" +count);
      }
}
