import java.util.Scanner;

public class maxthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        System.out.println("\n--- MAXIMUM USING 3 DIFFERENT LOGICS ---");

        // Logic 1: Using if-else
        int max1;
        if (a >= b && a >= c)
            max1 = a;
        else if (b >= a && b >= c)
            max1 = b;
        else
            max1 = c;

        System.out.println("Logic 1 (if-else): Maximum = " + max1);

        // Logic 2: Using Ternary Operator
        int max2 = (a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.println("Logic 2 (Ternary): Maximum = " + max2);

        // Logic 3: Using Math.max()
        int max3 = Math.max(a, Math.max(b, c));
        System.out.println("Logic 3 (Math.max): Maximum = " + max3);

        sc.close();
    }
}
