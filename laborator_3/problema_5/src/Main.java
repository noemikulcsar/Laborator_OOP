import java.math.BigInteger;
import java.lang.Math;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //a) calculați şansele de câştig la loterie (ex. 6 din 49)
        //combinari de 49 luate cate 6
        BigInteger ans=factorial(49);
        BigInteger aux=factorial(6);
        aux=aux.multiply(factorial(43));
        ans=ans.divide(aux);
        System.out.println("Sansele de a castiga la loto 6/49 sunt: "+ans);
        //b) simulați extragerea numerelor la loterie (pentru generarea numerelor aleatoare folosiţi
        //Math.random)
        System.out.println("Numerele alese sunt:");
        int x;
        for(int i=0;i<5;i++)
        {
            x=(int)(Math.random()*49)+1;
            System.out.print(x+" ");
        }
        System.out.println();
        //c) afişaţi în ordine crescătoare/descrescătoare numerele extrase la loterie fără a face sortări
        //sau a folosi tablouri. (Sugestie: folosiţi împachetarea/despachetarea/extragerea de biţi stocaţi
        //într-un long)
        long numarLoto=0;
        for(int i=0;i<5;i++)
        {
            x=(int)(Math.random()*49)+1;
            numarLoto|=(1L<<x);
        }
        //afisare crescatoare
        System.out.println("Ordine crescatoare:");
        for(int bit=0;bit<Long.SIZE;bit++)
        {
            if((numarLoto & (1L<<bit))!=0)
                System.out.print(bit+" ");
        }
        System.out.println();
        //afisare descrescatoare
        System.out.println("Ordine descrescatoare:");
        for(int bit=Long.SIZE;bit>=0;bit--)
        {
            if((numarLoto & (1L<<bit))!=0)
                System.out.print(bit+" ");
        }
    }
    public static BigInteger factorial(int n)
    {
        BigInteger rezultat=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
        {
            BigInteger k=BigInteger.valueOf(i);
            rezultat=rezultat.multiply(k);
        }
        return rezultat;
    }
}