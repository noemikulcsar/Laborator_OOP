import java.util.*;

public class Main
{
    public static void main(String[] args) {
        //împărțiti un întreg la zero
        int x=10;
        //x/=0; eroare la impartirea la zero
        System.out.println(x);
        //împărțiți un număr negativ în virgulă mobilă la zero; apoi unul pozitiv la zero
        double y=1.2345;
        y/=0;
        System.out.println(y);//infinity
        y=-1.2345;
        y/=0;
        System.out.println(y);//-infinity
        y=1.2345/0;
        double z=2.3456/0;
        System.out.println(y-z);//not a number => nan
        //înmulțiți în virgulă mobilă Infinit cu -Infinit
        z=-2.3456/0;
        System.out.println(y*z);//-infinity
        //asignați unei valori booleene un întreg
        boolean b=true;
        //b=x; tipuri incompatibile
        System.out.println(b);
        //asignați unei valori întregi un număr în virgulă mobilă
        //x=y; tipuri incompatibile
        System.out.println(x);
    }
}