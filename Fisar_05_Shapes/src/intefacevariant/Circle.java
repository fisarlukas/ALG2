package intefacevariant;


/**
 *
 * @author Lukas Fisar
 */
public class Circle implements ShapeInterface{ //Circle je typově kompatibilní s ShapeInteface

    //data
    private double r;

    //public void Circle(double r) {
    private Circle(double r) {
        this.r = r;
    }

//    public void Circle(double d) {   --- tohle nejde, protože stejnej název
//        this.r d/2.0;
//    }
    
    //tovarni metoda, factory method
    public static Circle getInstanceD(double d) {
        return new Circle(d / 2);

    }
    public static Circle getInstanceR(double r) {
        return new Circle(r);

    }
    
    

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        //return "Circle{" + "r=" + r + '}';
        return super.toString() + String.format(" r = %.2f", r);
    }
    
    @Override
    public double computeArea(){
        return Math.PI*r*r;
    }
    
    
    public static void main(String[] args) {
        Circle c1 = Circle.getInstanceR(4);
        System.out.println(c1);
        System.out.println(c1.computeArea());
        
    }

}
