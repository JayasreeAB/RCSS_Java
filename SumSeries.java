import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        double sum = 0;
        double fact = 1;  // to store factorial

        for (int i = 1; i <= n; i++) {
            fact = fact * i;       // calculate factorial iteratively
            sum = sum + (double)i / fact;   // add i/i!
        }

        System.out.println("Sum of the series = " + sum);
    }
}
