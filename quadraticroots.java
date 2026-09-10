import java.util.Scanner;

public class quadraticroots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calculate discriminant (b² - 4ac)
        double d = b * b - 4 * a * c;

        System.out.println("\nDiscriminant = " + d);

        if (d > 0) {
            // Real and distinct roots
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (d == 0) {
            // Real and equal roots
            double root = -b / (2 * a);

            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);

        } else {
            // Complex roots
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);

            System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + real + " + " + imaginary + "i");
            System.out.println("Root 2 = " + real + " - " + imaginary + "i");
        }

        sc.close();
    }
}
