class OddThread implements Runnable {
    int n;

    public OddThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd : " + i);
        }
    }
}

class EvenThread implements Runnable {
    int n;

    public EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class NumberThreadDemo_q28 {
    public static void main(String args[]) {
        int N = 20;

        OddThread odd = new OddThread(N);
        EvenThread even = new EvenThread(N);

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }
}
