import java.util.*;
public class Searchsort {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // return index if found
            }
        }
        return -1; // not found
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }    
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Array after Selection Sort: " + Arrays.toString(arr));
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        int linResult = linearSearch(arr, key);
        if (linResult != -1)
            System.out.println("Linear Search: Element found at index " + linResult);
        else
            System.out.println("Linear Search: Element not found");
        sc.close();
    }
}
