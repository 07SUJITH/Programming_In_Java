import java.util.Arrays;

//places odd numbers of array before even numbers
public class Program20 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] temp = new int[numbers.length];
        int j=0;
        int k=temp.length-1;
        for(int i =0; i < temp.length; i++)
            if(numbers[i]%2!=0)
                temp[j++] = numbers[i];
            else
                temp[k--] = numbers[i];
        copyArray(temp,numbers);  
        System.out.println(Arrays.toString(numbers));  
}

    private static void copyArray(int[] temp, int[] numbers) {
        for( int i=0; i < temp.length; i++ ) 
            numbers[i] = temp[i];
        }
}

