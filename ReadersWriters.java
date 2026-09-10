class ReadWrite {
    private int readers = 0;
    private boolean writing = false;

    // Reader wants to read
    synchronized void startRead() {
        try {
            while (writing) {
                wait();
            }
            readers++;
            System.out.println(Thread.currentThread().getName() + " started reading");
        } catch (InterruptedException e) {}
    }

    // Reader finished reading
    synchronized void endRead() {
        readers--;
        System.out.println(Thread.currentThread().getName() + " finished reading");
        notifyAll();
    }

    // Writer wants to write
    synchronized void startWrite() {
        try {
            while (writing || readers > 0) {
                wait();
            }
            writing = true;
            System.out.println(Thread.currentThread().getName() + " started writing");
        } catch (Exception e) {}
    }

    // Writer finished writing
    synchronized void endWrite() {
        writing = false;
        System.out.println(Thread.currentThread().getName() + " finished writing");
        notifyAll();
    }
}

// Reader thread
class Reader extends Thread {
    ReadWrite rw;

    Reader(ReadWrite rw, String name) {
        super(name);
        this.rw = rw;
    }

    public void run() {
        rw.startRead();
        try { Thread.sleep(1000); } catch (Exception e) {}
        rw.endRead();
    }
}

// Writer thread
class Writer extends Thread {
    ReadWrite rw;

    Writer(ReadWrite rw, String name) {
        super(name);
        this.rw = rw;
    }

    public void run() {
        rw.startWrite();
        try { Thread.sleep(1000); } catch (Exception e) {}
        rw.endWrite();
    }
}

// Main class
class ReadersWriters {
    public static void main(String args[]) {
        ReadWrite rw = new ReadWrite();

        Reader r1 = new Reader(rw, "Reader-1");
        Reader r2 = new Reader(rw, "Reader-2");
        Writer w1 = new Writer(rw, "Writer-1");
        Reader r3 = new Reader(rw, "Reader-3");

        r1.start();
        r2.start();
        w1.start();
        r3.start();
    }
}
