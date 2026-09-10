import java.util.Scanner;
public class Maxofthree {
    // Function to return maximum of two numbers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        // Use max() function to find maximum of three
        int maxOfThree = max(max(x, y), z);
        System.out.println("Maximum of the three numbers is: " + maxOfThree);
        sc.close();
    }
}
