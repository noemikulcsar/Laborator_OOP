import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger rezultat=BigInteger.valueOf(1);
        BigInteger k=BigInteger.valueOf(1);
        BigInteger doi=BigInteger.valueOf(2);
        for (int i = 2; i <= n; i++)
        {
            //k *= 2;
            k=k.multiply(doi);
            //rezultat += k;
            rezultat=rezultat.add(k);
        }
        System.out.println(rezultat);
    }
}