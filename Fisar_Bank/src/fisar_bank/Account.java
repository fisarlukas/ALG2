package fisar_bank;

/**
 *
 * @author Lukas Fisar
 */
public class Account {
    //data
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static Account createNew (int accountNumber) {
        return new Account(accountNumber, 0);
    }
    public static Account createWith (int accountNumber, double balance) {
        return new Account(accountNumber, balance);
    }
    
    public void deposit (double deposit) {
        balance += deposit;
    }
    public void withdraw (double withdraw) {
        balance -= withdraw;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account {" + "owner: " + accountNumber + ", balance: " + balance + '}';
    }
    
    
}
