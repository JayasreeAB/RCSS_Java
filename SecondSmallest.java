import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Edge case: Need at least 2 elements
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find smallest and second smallest
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal).");
        } else {
            System.out.println("Second Smallest Element = " + secondSmallest);
        }

        sc.close();
    }
}
