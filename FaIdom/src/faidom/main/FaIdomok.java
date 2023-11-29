package faidom.main;

import faidom.FaIdom;
import faidom.Gomb;
import faidom.Hasab;
import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List idomok;

    public static void main(String[] args) {
        new FaIdomok().run();
    }

    public void run() {
        Gomb gomb1 = new Gomb(5);
        Gomb gomb2 = new Gomb(12);
        Hasab hasab1 = new Hasab(15, 8, 9);
        Hasab hasab2 = new Hasab(3, 8, 10);
        List<FaIdom> ii = new ArrayList<FaIdom>();
        ii.add(0, gomb1);
        ii.add(1,gomb2);
        ii.add(2,hasab1);
        ii.add(3,hasab2);
        idomok = ii;
        
    
        System.out.println(idomok);
        System.out.println(gomb1.suly());
        
        System.out.println("Össz gömbök súly: "+osszGombSuly());
        System.out.println("Össz faidomok súly: "+osszSuly());
        System.out.println("Legkisebb térfogat: "+minV());
 }

    public FaIdomok() {

    }

    public double osszSuly() {
        double osszSuly = 0;
        for (Object h : idomok) {
            osszSuly += ((FaIdom)h).suly();
        }
        return osszSuly;
    }

    public double osszGombSuly() {
        double osszSuly = 0;
        for (Object h : idomok) {
            if (h instanceof Gomb) {
                osszSuly += ((Gomb) h).suly();
            }
        }
        return osszSuly;
    }

    public FaIdom minV() {
        FaIdom minObj = (FaIdom) idomok.get(0);
        double minErt = idomok.get(0).terfogat();
        
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat) {
                
            }
        }
        return (FaIdom) minObj;
    }

    public FaIdom maxV() {
        return null;
    }
}
