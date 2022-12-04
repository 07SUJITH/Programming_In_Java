import java.util.Scanner;
class Multiplication2{
    static void display(int m,int n,int arr[][]){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the dimension of MATRIX_1 :");
	    int m1=sc.nextInt();
	    int n1=sc.nextInt();
	    System.out.println("Enter the dimension of MATRIX_2 :");
	    int m2=sc.nextInt();
	    int n2=sc.nextInt();
	    if(n1!=m2){
	        System.out.println("Multiplication not possible");
	        return;
	    }
	    int A[][] =new int[m1][n1];
	    int B[][] =new int[m2][n2];
	    int C[][] =new int[m1][n2];
	    System.out.println("Enter MATRIX_1");
	    for(int i=0;i<m1;i++)
		    for(int j=0;j<n1;j++)
			    A[i][j]=sc.nextInt();
	    System.out.println("Enter MATRIX_2");
	    for(int i=0;i<m2;i++)
		    for(int j=0;j<n2;j++)
			    B[i][j]=sc.nextInt(); 
	    for(int i=0;i<m1;i++)
		    for(int j=0;j<n2;j++){
			    C[i][j]=0;
			    for(int k=0;k<n1;k++)
				    C[i][j]+=A[i][k]*B[k][j];
		    }
	    System.out.println("MATRIX_1");
        display(m1,n1,A);
	    System.out.println("MATRIX_2");
        display(m2,n2,B);
	    System.out.println("RESULTANT MATRIX");
        display(m1,n2,C);
    }
}
