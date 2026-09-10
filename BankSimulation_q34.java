class BankAccount {
    int balance = 1000;   // initial balance

    void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance = balance + amount;
        System.out.println("Balance after deposit: " + balance);
    }

    void withdraw(int amount) {
        System.out.println("Withdrawing: " + amount);
        balance = balance - amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

class DepositThread extends Thread {
    BankAccount acc;

    DepositThread(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.deposit(500);
    }
}

class WithdrawThread extends Thread {
    BankAccount acc;

    WithdrawThread(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(300);
    }
}

class BankSimulation_q34 {
    public static void main(String args[]) {
        BankAccount acc = new BankAccount();

        DepositThread t1 = new DepositThread(acc);
        WithdrawThread t2 = new WithdrawThread(acc);

        t1.start();
        t2.start();
    }
}
