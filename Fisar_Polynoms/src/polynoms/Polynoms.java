package polynoms;
/**
 *
 * @author Lukas Fisar
 */
public class Polynoms {

    private Polynoms() { //object can not be created
        
    }
    
    public static Polynom sum (Polynom a, Polynom b) {
        boolean isABigger = a.getDegree() > b.getDegree();
        Polynom max = isABigger? a : b; //Math.max(a.getDegree(), b.getDegree());
        Polynom min = !isABigger? a : b;
        
        double[] sumCoef = new double[max.getDegree() + 1];
        //6 0 3 5
        //1 3 6
        //7 3 9 5
        for (int i = 0; i < max.getDegree(); i++) {
            sumCoef[i] = max.getCoefAt(i);
        }
        for (int i = 0; i < min.getDegree(); i++) {
            sumCoef[i] += min.getCoefAt(i);
        }
        return Polynom.getInstanceReverted(sumCoef);
    }
    
    public static void main(String[] args) {
        Polynom p1 = Polynom.getInstance(5, 3, 0, 6);
        Polynom p2 = Polynom.getInstance(6, 3, 1);
        System.out.println(Polynoms.sum(p1, p2));
        System.out.println(Polynoms.multiply(p1, p2));
    }
    //T0D0
    //6  0  3  5
    //1  3  6
    
    //6  0  3  5
    //0 18  0  9 15
    //0  0 36  0 18 30
    
    //6 18 39 14 33 30
    public static Polynom multiply (Polynom a, Polynom b) {
        double[] multiplyCoef = new double[a.getDegree() + b.getDegree() + 1];
        for (int i = 0; i < a.getDegree()+1; i++) {
            for (int j = 0; j < b.getDegree()+1; j++) {
                multiplyCoef[i+j] += a.getCoefAt(i) * b.getCoefAt(j);
            }
        }
        return Polynom.getInstanceReverted(multiplyCoef);
    }
}
