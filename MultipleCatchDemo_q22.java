import java.util.*;

class MultipleCatchDemo_q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            int result = a / b;
            System.out.println("Result = " + result);
          
            int[] arr = {10, 20, 30};
            System.out.println("Array element: " + arr[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter only integer values");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range");
        }

        catch (Exception e) {
            System.out.println("General error occurred");
        }
        finally {
            System.out.println("Program execution completed");
            sc.close();
        }
    }
}

