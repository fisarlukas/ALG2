package polynoms;

import java.util.Arrays;
/**
 *
 * @author Lukas Fisar
 */
public class Polynom {
    //data
    //5x3 + 3x2 + 6
    
    private double[] coef;
    
    //constructors
    
    private Polynom (double[] coef){
        double[] coefTemp = new double[coef.length]; //defensive copy (to make private values of this array)
        System.arraycopy(coef, 0, coefTemp, 0, coef.length);
        this.coef = coefTemp;
    }
            
    public static Polynom getInstanceReverted(double[] coef) { //[6 0 3 5]
        return new Polynom(coef);
    }
    
    public static Polynom getInstance(double...coef) { //5, 3, 0, 6 (zadame hodnoty, uvnitř se pracuje jako s polem
        double[] coefTemp = new double[coef.length];
        for (int i = 0; i < coef.length; i++) {
            coefTemp[coefTemp.length - 1 - i] = coef[i];
        }
        return new Polynom(coefTemp);
    }
    
    //metody
    
    //T0D0
    //5x3 + 3x2 + 6 pro x = 1, y = 5 + 3 + 6 = 14
    //use Horner scheme
    //6 0x 3x^2 5x^3
    //
    
    public double computeValue(double x){
        double value = 0;
        for (int i = 0; i < coef.length; i++) {
            value += coef[i] * Math.pow(x, i);
            
        }
        return value;
    }
    
    //gettery
    public double getCoefAt (int exponent) {
        return coef[exponent];
    }
    public double[] getAllCoef () {
        return Arrays.copyOf(coef, coef.length);
    }
    public int getDegree() {
        return coef.length - 1;
    }
    
    
    //T0D0 vypsat matematicky správně (5x^3 +...
    @Override
    public String toString() {
        return "Polynom{" + "coef=" + Arrays.toString(coef) + "}";
    }
    public String toWrite() {
        String polynome = "";
        for (int i = coef.length - 1; i > 0; i--) {
            if(coef[i] != 0){
                if(i == 1){
                    polynome = polynome + Math.abs(coef[i]) + "x";
                } else {
                    polynome = polynome + Math.abs(coef[i]) + "x^" + i;
                }
                if(coef[i - 1] >= 0) {
                    polynome += " + ";
                } else {
                    polynome += " - ";
                }
            }
        }
        polynome += coef[0];
        return polynome;
    }
    
    public Polynom derivate() {
        double[] coefD = new double[coef.length - 1];
        for (int i = 0; i < coefD.length; i++) {
            coefD[i] = coef[i + 1] * (i + 1);
        }
        return new Polynom(coefD);
    }
    
    //T0D0 bonus integral
    //6 0 3 5
    //C 6 0 1 5/4
    public Polynom integrate() {
        double[] coefI = new double[coef.length + 1];
        coefI[0] = 0;
        for (int i = 1; i < coef.length + 1; i++) {
            coefI[i] = coef[i - 1] / i;
        }
        return new Polynom(coefI);
    }
    
    public static void main(String[] args) {
        double[] a = {6, 0, 3, 5};
        Polynom p1 = Polynom.getInstanceReverted(a);
        System.out.println(p1);
        System.out.println(p1.getCoefAt(3));
        System.out.println(p1.derivate());
        System.out.println();
        System.out.println(p1.toWrite());
        System.out.println(p1.computeValue(2));
        System.out.println(p1.integrate());
    }
}
