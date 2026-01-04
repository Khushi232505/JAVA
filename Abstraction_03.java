
abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account");
        displayBalance(balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient Balance in Savings Account");
        }
        displayBalance(balance);
    }
}


class CurrentAccount extends BankAccount {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account");
        displayBalance(balance);
    }

    void withdraw(double amount) {
        balance -= amount; 
        System.out.println("Withdrawn " + amount + " from Current Account");
        displayBalance(balance);
    }
}


public class AbstractionExample {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount();
        acc1.deposit(5000);
        acc1.withdraw(2000);

        System.out.println("---------------");

        BankAccount acc2 = new CurrentAccount();
        acc2.deposit(10000);
        acc2.withdraw(15000);
    }
}

