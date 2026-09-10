class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - count: " + i +
                               " - priority: " + getPriority());
        }
    }
}

class ThreadPriorityDemo_q35 {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
