package fisar_bank;

/**
 *
 * @author Lukas Fisar
 */
public abstract class Client {
    
    public abstract void addAccount(int accountNumber, double balance);
    
    public abstract double totalBalance();
    
    public abstract String getName();
}
