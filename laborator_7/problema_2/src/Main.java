import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Fractie f=new Fractie(3,4);
        Fractie g=new Fractie(1,2);
        System.out.println("Pentru Fractie:");
        System.out.println("Adunarea "+f.adunare(g).toString());
        System.out.println("Scaderea "+f.scadere(g).toString());
        System.out.println("Inmultirea "+f.inmultire(g).toString());
        System.out.println("Inmultirea cu scalar "+f.inmultire_scalar(f, 2).toString());
        System.out.println();
        Complex c=new Complex(4,5);
        Complex d=new Complex(1,2);
        System.out.println("Pentru Complex:");
        c.adunare(d);
        System.out.println("Adunarea "+c.getReal()+"+"+c.getImag()+"j");
        c.scadere(d);
        System.out.println("Scaderea "+c.getReal()+"+"+c.getImag()+"j");
        c.inmultire(d);
        System.out.println("Inmultirea "+c.getReal()+"+"+c.getImag()+"j");
        c.inmultire_scalar(c, 2);
        System.out.println("Inmultire cu scalar "+c.getReal()+"+"+c.getImag()+"j");
        Matrice m1=new Matrice(2,2, f);
        Matrice m2=new Matrice(2,2, f);
        System.out.println("Afisare matrice fractii:");
        for(int i=0;i<m1.getN();i++)
            for(int j=0;j<m1.getM();j++)
                m1.mat[i][j]=new Fractie(i+1,j+1);
        m1.adunare(m2);
        m1.afisare();
        Matrice m3=new Matrice(2,2, c);
        Matrice m4=new Matrice(2,2, c);
        System.out.println("Afisare matrice complex:");
        for(int i=0;i<m3.getN();i++)
            for(int j=0;j<m3.getM();j++)
                m3.mat[i][j]=new Complex(i+1,j+1);
        m3.adunare(m4);
        m3.afisare();
    }
}