/*
    Write a Java program that implements Quick sort algorithm for sorting a list of names in 
    ascending order
 */

import java.util.Scanner;

public class QuickSort {
    static int partition(String[] arr, int lb, int ub) {
        String pivot = arr[lb];
        int i = lb + 1;
        for (int j = lb + 1; j <= ub; j++)
            if (arr[j].compareToIgnoreCase(pivot) < 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }

        arr[lb] = arr[i - 1];
        arr[i - 1] = pivot;
        return i - 1;
    }

    static void quickSort(String arr[], int lb, int ub) {
        if (lb >= ub)
            return;
        int pivot_index = partition(arr, lb, ub);
        quickSort(arr, lb, pivot_index - 1);
        quickSort(arr, pivot_index + 1, ub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names :");
        int n = sc.nextInt();
        sc.nextLine();
        /*
         * // Read the integer
         * int var = sc.nextInt();
         * // Read the leftover new line
         * sc.nextLine();
         */

        String[] names = new String[n];
        System.out.print("Enter the names : ");
        for (int i = 0; i < n; i++)
            names[i] = sc.nextLine();

        System.out.println("UNSORTED  NAMES");
        for (int i = 0; i < n; i++)
            System.out.println(names[i] + " ");

        quickSort(names, 0, n - 1);

        System.out.println("\nSORTED NAMES  ");
        for (int i = 0; i < n; i++)
            System.out.println(names[i] + " ");

    }
}
