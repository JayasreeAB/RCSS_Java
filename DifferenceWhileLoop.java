import java.util.Scanner;

public class DifferenceWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Ensure x >= y for subtraction
        while (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int diff = 0;

        while (x >= y) {
            x = x - 1;
            diff++;
            if (x == y - 1) {
                break;
            }
        }

        System.out.println("Difference = " + diff);
    }
}
