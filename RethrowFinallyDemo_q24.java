public class RethrowFinallyDemo_q24 {
    static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught inside method");
            throw e;   // re-throwing exception
        }
        finally {
            System.out.println("Finally block executed inside method");
        }
    }

    public static void main(String args[]) {
        try {
            divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");
        }
        finally {
            System.out.println("Finally block executed in main");
        }
    }
}
