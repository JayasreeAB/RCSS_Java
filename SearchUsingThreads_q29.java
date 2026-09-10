import java.util.Scanner;

class SearchElement implements Runnable {
    int[] a;
    int start, end, key;

    SearchElement(int[] a, int start, int end, int key) {
        this.a = a;
        this.start = start;
        this.end = end;
        this.key = key;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (a[i] == key) {
                System.out.println(
                    "Element " + key + " found at position " + i +
                    " by " + Thread.currentThread().getName()
                );
            }
        }
    }
}

class SearchUsingThreads_q29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int threads = n / 5;
        if (threads == 0)
            threads = 1;

        int size = n / threads;

        System.out.println("Searching using " + threads + " threads");

        for (int i = 0; i < threads; i++) {
            int start = i * size;
            int end = (i == threads - 1) ? n : start + size;

            Thread t = new Thread(
                new SearchElement(a, start, end, key),
                "Thread-" + (i + 1)
            );
            t.start();
        }
    }
}
