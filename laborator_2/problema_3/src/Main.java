import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //adunaţi o cantitate întreagă la cel mai mare întreg primitiv din fiecare categorie de întregi
        int x=Integer.MAX_VALUE;
        x++;
        System.out.println(x);
        //scădeţi o cantitate întreagă din cel mai mic întreg primitiv din fiecare categorie de întregi
        x=Integer.MIN_VALUE;
        x--;
        System.out.println(x);
        //înmulțiți cel mai mare număr real reprezentat în simplă și dublă precizie cu o valoare
        //supraunitară
        double y=Double.MAX_VALUE;
        y*=0.1;
        System.out.println(y);
        //reprezentaţi în virgulă mobilă numere cu un număr de cifre zecimale mai mare decât numărul
        //de cifre reprezentabile exact
        float z=(float)0.1234567891011;//rotunjeste
        System.out.println(z);
        //adunaţi sau scădeţi cantităţi din numere care au mai multe cifre zecimale în reprezentarea în
        //baza 10 decât permite reprezentarea în virgulă mobilă
        z+=(float)0.1234567891011;
        System.out.println(z);
    }
}