import java.util.Scanner;

public class DisplayMN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number (m): ");
        int m = sc.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = sc.nextInt();

        int i = m;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
