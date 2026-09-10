import java.util.Scanner;

public class swapall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("\n--- Before Swapping ---");
        System.out.println("a = " + a + ", b = " + b);

        // Logic 1: Using Third Variable
        int x = a, y = b;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("\nLogic 1 (Using Third Variable): a = " + x + ", b = " + y);

        // Logic 2: Without Third Variable (Arithmetic Operators)
        x = a;
        y = b;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Logic 2 (Using Arithmetic): a = " + x + ", b = " + y);

        // Logic 3: Without Third Variable (Bitwise XOR)
        x = a;
        y = b;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Logic 3 (Using XOR): a = " + x + ", b = " + y);

        sc.close();
    }
}
