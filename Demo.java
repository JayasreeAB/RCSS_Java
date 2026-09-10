import java.util.*;

public class Demo {

    public static <T> void printData(T data) {
        System.out.println("You entered: " + data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        printData(num);

        System.out.println("Enter a string:");
        String str = sc.next();
        printData(str);

        System.out.println("Enter a decimal number:");
        double d = sc.nextDouble();
        printData(d);
    }
}