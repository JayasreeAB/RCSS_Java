class MyTask implements Runnable {
    int limit;

    public MyTask(int limit) {
        this.limit = limit;
    }

    public void run() {
        int i;
        for (i = 1; i <= limit; i++) {
            System.out.print("i = " + i + "\t");
        }
    }
}

class ThreadDemo_q27 {
    public static void main(String args[]) {
        MyTask task1, task2;
        Thread th1, th2;

        task1 = new MyTask(30);
        task2 = new MyTask(50);

        th1 = new Thread(task1);
        th2 = new Thread(task2);

        System.out.println("Before Threading");

        th1.start();
        th2.start();

        System.out.println("Finished");
    }
}
