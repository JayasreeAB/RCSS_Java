//Producer Consumer Problem

class Buffer {
    int data;
    boolean empty = true;

    synchronized void produce(int value) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        data = value;
        empty = false;
        System.out.println("Produced: " + data);
        notify();
    }
    synchronized void consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        empty = true;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.produce(i);
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.consume();
        }
    }
}

class ProducerConsumerDemo_q33 {
    public static void main(String args[]) {
        Buffer b = new Buffer();
        new Producer(b).start();
        new Consumer(b).start();
    }
}


//Readers–Writers Problem

class ReadWrite {
    int readers = 0;
    boolean writing = false;

    synchronized void read(String name) {
        while (writing) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        readers++;
        System.out.println(name + " is reading");
        readers--;
        notifyAll();
    }

    synchronized void write(String name) {
        while (readers > 0 || writing) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        writing = true;
        System.out.println(name + " is writing");
        writing = false;
        notifyAll();
    }
}

class Reader extends Thread {
    ReadWrite rw;
    String name;

    Reader(ReadWrite rw, String name) {
        this.rw = rw;
        this.name = name;
    }

    public void run() {
        rw.read(name);
    }
}

class Writer extends Thread {
    ReadWrite rw;
    String name;

    Writer(ReadWrite rw, String name) {
        this.rw = rw;
        this.name = name;
    }

    public void run() {
        rw.write(name);
    }
}

class ReadersWritersDemo_q33 {
    public static void main(String args[]) {
        ReadWrite rw = new ReadWrite();
        new Reader(rw, "Reader1").start();
        new Reader(rw, "Reader2").start();
        new Writer(rw, "Writer1").start();
    }
}
