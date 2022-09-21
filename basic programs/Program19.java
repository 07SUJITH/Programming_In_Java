// diaplay the maximum and minimum of  an array
public class Program19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 65, 7, 8, -9, 10};
        int min= arr[0];
        int max =arr[0];
        for(int i=1;i<arr.length;i++) {
            max = (max>arr[i])? max:arr[i];
            min = (min<arr[i])? min:arr[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}    
