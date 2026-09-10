import java.util.Scanner;

class Addition {
    public double compute(double a, double b) {
        return a + b;
    }
}

class Subtraction {
    public double compute(double a, double b) {
        return a - b;
    }
}

class Multiplication {
    public double compute(double a, double b) {
        return a * b;
    }
}

class Division {
    public double compute(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }
}

public class ArithmeticOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Create objects of each operation class
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        // Perform operations
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + add.compute(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + sub.compute(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + mul.compute(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + div.compute(num1, num2));

        sc.close();
    }
}
