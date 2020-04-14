package pkg05_shapes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lukas Fisar
 */
public class ShapesApp {
public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Shape> shapes = new ArrayList<>();
    
    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = readChoice();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    clearObjects();
                    break;
                case 2:
                    addSquare();
                    break;
                case 3:
                    addRectangle();
                    break;
                case 4:
                    addCircle();
                    break;
                case 5:
                    getAllObjectsInfo();
                    break;
                case 6:
                    computeArea();
                    break;
                case 7:
                    findWithMaxArea();
                    break;
                case 8:
                    getObjectInfo();
                    break;
                case 9: 
                    sortByArea();
                default:
                    System.out.println("Chybna volba");
            }
        } while (choice != 0);

    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("1. Nova sada");
        System.out.println("2. Pridej ctverec");
        System.out.println("3. Pridej obdelnik");
        System.out.println("4. Pridej kruh");
        System.out.println("5. Vypis geometricke utvary");
        System.out.println("6. Vypocti celkovou plochu");
        System.out.println("7. Vypis utvar s najvetsi plochou");
        System.out.println("8. Vypis plochu vybraneho utvaru");
        System.out.println("0. Konec programu");
    }
    
    private static int readChoice() {
        System.out.println("Zadej volbu:");
        return sc.nextInt();
    }
    
    private static void clearObjects() {
        shapes.clear();
    }
    
    private static void addSquare() {
        System.out.println("Zadej délku strany");
        double a = sc.nextDouble();
        Square s = new Square(a);
        shapes.add(s);
    }
    
    private static void addRectangle() {
        System.out.println("Zadej délky stran a, b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(a, b);
        shapes.add(r);
    }

    private static void addCircle() {
        System.out.println("Zadej poloměr");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        shapes.add(c);
    }
    
    private static void getAllObjectsInfo() {
        double area;
        System.out.println("Všechny načtené objekty:");
        for (int i = 0; i < shapes.size(); i++ ) {
            area = shapes.get(i).computeArea();
            System.out.print(shapes.get(i) + ", S = " + area);
            System.out.println("");
        }
    }
    
    private static void computeArea() {
        double area = 0;
        for (Shape shape : shapes){
            area += shape.computeArea();
        }
        System.out.println("Celkový obsah objektů S = " + area);

    }
    
    private static void findWithMaxArea() {
        double area = 0;
        double maxArea = 0;
        int maxAreaIndex = 0;
        for (int i = 0; i < shapes.size(); i++ ){
            area = shapes.get(i).computeArea();
            if(area > maxArea){
                maxArea = area;
                maxAreaIndex = i;
            }
        }
        System.out.println(shapes.get(maxAreaIndex) + ", S = " + maxArea );
    }
    
    
    private static void getObjectInfo() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i+1) + " - " + shapes.get(i));
        }
        System.out.println("Vyber objekt:");
        int a = sc.nextInt();
        System.out.println(shapes.get(a - 1) + ", S = " + shapes.get(a - 1).computeArea());
    }
    
    private static void sortByArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
