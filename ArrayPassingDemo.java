import java.util.Scanner;
class ArrayPassingDemo {
    // Method 1: Pass entire array
    void displayArray(int[] arr) {
        System.out.println("Full array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // Method 2: Pass array elements individually (varargs)
    void displayElements(int... elements) {
        System.out.println("Elements passed individually:");
        for (int x : elements) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayPassingDemo obj = new ArrayPassingDemo();
        // Take array input once
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Passing the whole array
        obj.displayArray(arr);
        // Passing the same elements individually
        obj.displayElements(arr);   // varargs accepts the array
    }
}
