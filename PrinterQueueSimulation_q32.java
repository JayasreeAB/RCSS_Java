class Printer {
    // synchronized method
    synchronized void printDocument(String user, int pages) {
        System.out.println(user + " started printing");

        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing page " + i + " for " + user);
            try {
                Thread.sleep(200);   // delay to simulate printing
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(user + " finished printing\n");
    }
}

class PrintJob extends Thread {
    Printer printer;
    String user;
    int pages;

    PrintJob(Printer printer, String user, int pages) {
        this.printer = printer;
        this.user = user;
        this.pages = pages;
    }

    public void run() {
        printer.printDocument(user, pages);
    }
}

class PrinterQueueSimulation_q32 {
    public static void main(String args[]) {
        Printer printer = new Printer();

        PrintJob p1 = new PrintJob(printer, "User1", 3);
        PrintJob p2 = new PrintJob(printer, "User2", 3);
        PrintJob p3 = new PrintJob(printer, "User3", 3);

        p1.start();
        p2.start();
        p3.start();
    }
}
