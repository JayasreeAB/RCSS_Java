import java.util.Scanner;

public class j39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Length of a string");
            System.out.println("2. Compare two strings");
            System.out.println("3. Extract substring");
            System.out.println("4. Convert to Uppercase & Lowercase");
            System.out.println("5. Reverse a string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    System.out.println("Length = " + str1.length());
                    break;
                case 2:
                    System.out.print("Enter first string: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = sc.nextLine();
                    if (s1.equals(s2)) {
                        System.out.println("Strings are equal");
                    } else {
                        System.out.println("Strings are not equal");
                    }
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String str2 = sc.nextLine();
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Substring: " + str2.substring(start, end));
                    break;

                case 4:
                    System.out.print("Enter a string: ");
                    String str3 = sc.nextLine();
                    System.out.println("Uppercase: " + str3.toUpperCase());
                    System.out.println("Lowercase: " + str3.toLowerCase());
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String str4 = sc.nextLine();
                    String reversed = new StringBuilder(str4).reverse().toString();
                    System.out.println("Reversed string: " + reversed);

                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
