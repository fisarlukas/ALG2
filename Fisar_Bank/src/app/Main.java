package app;

import fisar_bank.Client;
import fisar_bank.Company;
import fisar_bank.Person;
import java.util.ArrayList;

/**
 *
 * @author Lukas Fisar
 */
public class Main {

    private static ArrayList<Client> clients = new ArrayList<>();
    
    public static void main(String[] args) {
        clients.add(new Person("Pekar"));
        clients.add(new Person("Svecova"));
        clients.add(new Company("Skoda"));
        clients.get(0).addAccount(1, 1000);
        clients.get(0).addAccount(2, 500);
        clients.get(1).addAccount(3, 1200);
        clients.get(2).addAccount(4, 120);

        clients.forEach((client) -> {
            System.out.println(client.getName()+ " - " + client.totalBalance()+ " Kč");
        });
    }
}
