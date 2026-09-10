import java.util.Scanner;

public class SumNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;      // final total sum
        int innerSum = 0; // running sum of 1+2+...+i

        while (i <= n) {
            innerSum = innerSum + i;  // builds 1+2+3+...+i
            sum = sum + innerSum;     // adds it to final sum
            i++;
        }

        System.out.println("Sum of the series = " + sum);
    }
}
