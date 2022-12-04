import java.util.Scanner;
public class StrPalindrome {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=in.nextLine();
		int len=str.length();
        	boolean flag=true;
		for(int i=0;i<len/2;i++)
			if( str.charAt(i)!= str.charAt(len-i-1)){ 
				flag=false;
				break;
			}
		if(flag)
			System.out.println("String is palindrome ");
		else
			System.out.println("String is not palindrome");
	}
}
