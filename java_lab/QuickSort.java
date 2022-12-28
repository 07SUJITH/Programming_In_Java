import java.util.Scanner;
public class QuickSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of names: ");
    int n = sc.nextInt();
    String[] names = new String[n];
    System.out.println("Enter the names: ");
    for (int i = 0; i < n; i++)
        names[i] = sc.next();
    quickSort(names, 0, n - 1);
    System.out.println("Sorted names: ");
    for (String name : names) 
        System.out.println(name);
  }
  public static void quickSort(String[] arr, int left, int right) {
    if (left >= right)
      return;
    int pivotIndex = partition(arr, left, right);
    quickSort(arr, left, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, right);
  }
  public static int partition(String[] arr, int left, int right){
    String pivot = arr[left];
    int i = left+1;
    for (int j = left + 1; j <= right; j++)
      if (arr[j].compareToIgnoreCase(pivot) < 0) {
        swap(arr, i, j);
        i++;
      }
    swap(arr, left, i-1);
    return i-1;
  }
  public static void swap(String[] arr, int i, int j) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
