class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class UserDefinedException_q23 {
    public static void main(String[] args) {
        try {
            int x = 5;

            if (x < 10) {
                throw new MyException("Value is less than 10");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
