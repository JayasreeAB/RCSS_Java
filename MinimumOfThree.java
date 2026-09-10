import java.util.Scanner;

public class MinimumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Single statement to find minimum
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Minimum number is: " + min);
    }
}
