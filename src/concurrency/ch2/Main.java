package concurrency.ch2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount("Account 1", 500);
        BankAccount account2 = new BankAccount("Account 2", 1000);

        TransactionThread t1 = new TransactionThread("Transaction Thread 1", account1, account2, 300);
        TransactionThread t2 = new TransactionThread("Transaction Thread 2", account2, account1, 200);
        t1.start();
        t2.start();
    }
}
