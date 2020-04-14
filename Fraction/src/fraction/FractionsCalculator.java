package fraction;

import java.util.Scanner;

/**
 *
 * @author Lukas Fisar
 */
public class FractionsCalculator {
    
    public static Fraction sum(Fraction a, Fraction b) {
        return new Fraction((a.getCitatel()) * (b.getJmenovatel()) + (b.getCitatel()) * (a.getJmenovatel()), (a.getJmenovatel()) * (b.getJmenovatel())).simplify();
    }
    public static Fraction deduct(Fraction a, Fraction b) {
        return new Fraction((a.getCitatel()) * (b.getJmenovatel()) - (b.getCitatel()) * (a.getJmenovatel()), (a.getJmenovatel()) * (b.getJmenovatel())).simplify();
    }
    public static Fraction multiply(Fraction a, Fraction b) {
        return new Fraction(a.getCitatel() * b.getCitatel(), a.getJmenovatel() * b.getJmenovatel()).simplify();
    }
    public static Fraction divide(Fraction a, Fraction b) {
        return new Fraction(a.getCitatel() * b.getJmenovatel(), a.getJmenovatel() * b.getCitatel()).simplify();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej citatele a jmenovatele prvního zlomku");
        Fraction a = new Fraction(sc.nextInt(), sc.nextInt());
        System.out.println("Zadej citatele a jmenovatele druhého zlomku");
        Fraction b = new Fraction(sc.nextInt(), sc.nextInt());
        System.out.println("Zadejte symbol operace (+, -, *, /) pro tyto dva zlomky");
        String operation = sc.next();
        if(operation.equals("+")){
            System.out.println(FractionsCalculator.sum(a, b).toString());
        } else if(operation.equals("-")){
            System.out.println(FractionsCalculator.deduct(a, b).toString());
        } else if(operation.equals("*")){
            System.out.println(FractionsCalculator.multiply(a, b).toString());
        } else if(operation.equals("/")){
            System.out.println(FractionsCalculator.divide(a, b).toString());
        } else {
            System.out.println("Neplatná operace");
        }
    }
    
}
