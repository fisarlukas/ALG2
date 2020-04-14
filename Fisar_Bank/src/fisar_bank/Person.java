package fisar_bank;

import java.util.ArrayList;

/**
 *
 * @author Lukas Fisar
 */
public class Person extends Client {
    
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        int length = name.length();
        if(name.charAt(length - 1) == 'a' && name.charAt(length - 2) == 'v' && name.charAt(length - 3) == 'o' ){
            return "pani " + name;
        }
        return "pan " + name;
    }

    @Override
    public void addAccount(int accountNumber, double balance) {
        Account a = Account.createWith(accountNumber, balance);
        accounts.add(a);
    }

    @Override
    public double totalBalance() {
        double totalBalance = 0;
        for(int i = 0; i < accounts.size(); i++){
            totalBalance += accounts.get(i).getBalance();
        }
        return totalBalance;
    }

    @Override
    public String getName() {
        return name;
    }
    
    
    
}
