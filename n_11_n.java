import java.util.Scanner;

public class n_11_n {

    // Function 1: Display from n down to -1
    static void displayNtoMinus1(int n) {
        if (n < -1) return;     // Base condition
        System.out.print(n + " ");
        displayNtoMinus1(n - 1);
    }

    // Function 2: Display from 1 down to -n
    static void display1toMinusN(int n) {
        if (n < 0) return;      // Base condition
        System.out.print((1 - n) + " ");
        display1toMinusN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("\nNumbers from n to -1:");
        displayNtoMinus1(n);

        System.out.println("\n\nNumbers from 1 to -n:");
        display1toMinusN(n);

        sc.close();
    }
}
