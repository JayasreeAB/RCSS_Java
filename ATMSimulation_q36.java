import java.util.Scanner;

class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    // Synchronized deposit
    public synchronized void deposit(int amount, String user) {
        System.out.println(user + " is depositing: " + amount);
        balance += amount;
        System.out.println(user + " completed deposit. Balance: " + balance);
    }

    // Synchronized withdrawal
    public synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println(user + " completed withdrawal. Balance: " + balance);
        } else {
            System.out.println(user + " attempted withdrawal: " + amount + " - Insufficient balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class ATMUser extends Thread {
    BankAccount account;
    String user;
    int amount;
    String type; // "deposit" or "withdraw"

    ATMUser(BankAccount account, String user, int amount, String type) {
        this.account = account;
        this.user = user;
        this.amount = amount;
        this.type = type;
    }

    public void run() {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount, user);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount, user);
        }
    }
}

class ATMSimulation_q36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankAccount account = new BankAccount(balance);

        // Create multiple ATM users
        ATMUser u1 = new ATMUser(account, "User1", 500, "deposit");
        ATMUser u2 = new ATMUser(account, "User2", 300, "withdraw");
        ATMUser u3 = new ATMUser(account, "User3", 400, "withdraw");
        ATMUser u4 = new ATMUser(account, "User4", 200, "deposit");

        // Start threads (simulate multiple users at same time)
        u1.start();
        u2.start();
        u3.start();
        u4.start();

        // Wait for all threads to finish
        try {
            u1.join();
            u2.join();
            u3.join();
            u4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.getBalance());

        sc.close();
    }
}
