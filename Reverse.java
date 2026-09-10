import java.util.Scanner;
public class Reverse {
    // Function 1: Returns the reverse of a number
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    // Function 2: Returns true if number is palindrome using reverse()
    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Check palindrome
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome and hence is true.");
        } else {
            System.out.println(n + " is not a palindrome and hence is false.");
        }
        sc.close();
    }
}
