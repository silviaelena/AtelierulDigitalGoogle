package concurrency.ch2;

public class BankAccount {
    private String name;
    private int debit;
    public BankAccount (String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount) {
        longDatabaseCal1();
        if (amount > debit) {
            System.out.println("Fonduri insuficiente");
        } else {
            debit -= amount;
            System.out.println("Ati retras: " + amount + " Noul sold: " + debit);
        }
    }

    public void deposit (double amount) {
        longDatabaseCal1();
        debit += amount;
        System.out.println("Ati depus " + amount + " Noul sold: " + debit);
    }

    private void longDatabaseCal1 () {
        try {
            Thread. sleep (100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
