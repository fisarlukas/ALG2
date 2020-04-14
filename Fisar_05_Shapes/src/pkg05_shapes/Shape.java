package pkg05_shapes;

/**
 *
 * @author Lukas Fisar
 */

public abstract class Shape{
    //data
    protected String name = "Geometric object"; //protected means it is available at potomky
    
    public abstract double computeArea(); // metoda která musí být překrytá v potomcích
    
    public String getShapeName() { //jen pouzita v potomcich
        return this.getClass().getSimpleName(); 
    }
    
    public String toString() { //překrývá toString třídy Object, defaultní implementace, která může být překrytá
        return name + ": " + getShapeName();
    }
}
//public class Shape {
//    
//    public double computeArea(){
//        return 0;
//    }
//}
