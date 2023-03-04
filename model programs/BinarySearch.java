
/*
 Write a Java program that implements the binary search algorithm
 */
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int lb, int ub, int key) {
        if (lb > ub)
            return -1;
        int mid = (lb + ub) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            return binarySearch(arr, mid + 1, ub, key);
        else
            return binarySearch(arr, lb, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array:");
        int limit = sc.nextInt();

        int[] arr = new int[limit];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < limit; i++)
            arr[i] = sc.nextInt();

        System.out.println("Eter the element to be search :");
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, limit - 1, key);

        if (result == -1)
            System.out.println(key + " not found in list ");
        else
            System.out.println(key + " found in list at the index " + result);

    }

}
