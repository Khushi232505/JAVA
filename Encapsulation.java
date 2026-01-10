public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc= new BankAccount(653075, 5000, "Savings" );
        System.out.println("Balance: " + acc.getBalance());
        acc.setBalance(8000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

class BankAccount{
    private int accNo;
    private int balance;
    String accType;

    BankAccount(int accNo, int balance, String accType){
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType;
        
    }
    public int getBalance(){
        return balance;

    }

public void setBalance(int balance) {
    this.balance = balance;
    
}
}
