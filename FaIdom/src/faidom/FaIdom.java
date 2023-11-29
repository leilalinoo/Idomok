package faidom;

abstract public class FaIdom {
    
    static double  fajsuly = 0.8;
    
    public double suly(){
        return terfogat() * fajsuly;
    }
    public abstract double terfogat();

    @Override
    public String toString() {
        return "FaIdom{" + '}';
    }
    
    
    
}
