import java.util.Scanner;

class SquareThread implements Runnable {
    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class CubeThread implements Runnable {
    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

class SquareCubeThread_q30 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Thread t1 = new Thread(new SquareThread(n));
        Thread t2 = new Thread(new CubeThread(n));

        t1.start();
        t2.start();

        sc.close();
    }
}
