package fraction;

/**
 *
 * @author Lukas Fisar
 */
public class Fraction {

    private int citatel;
    private int jmenovatel;
    
    public Fraction(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }
    
    private int euklidean() {
        int u = this.citatel;
        int w = this.jmenovatel;
        int r = 0;
        while (w != 0){
        r = u % w;
        u = w;
        w = r;
        }
        return u;
    }
    
    public Fraction simplify() {
        Fraction helper = new Fraction(this.citatel, this.jmenovatel);
        
        return new Fraction(this.citatel / helper.euklidean(), this.jmenovatel/helper.euklidean());
    }
            
    public static void main(String[] args) {
        
    }
    
}
