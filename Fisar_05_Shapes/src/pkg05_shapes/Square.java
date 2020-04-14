package pkg05_shapes;

/**
 *
 * @author Lukas Fisar
 */
public class Square extends Rectangle {

    public static void main(String[] args) {
        
    }

    public Square(double a) {
        super(a, a);
        this.a = a;
    }

    public double getA() {
        return a;
    }
    
    @Override
    public String toString() {
        return "Square, a = " + a;
    }
}
