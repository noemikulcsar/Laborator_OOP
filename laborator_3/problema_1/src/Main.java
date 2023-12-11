import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(m>n)
        {
            int aux=n;
            m=n;
            n=aux;
        }
        int x,y=0;
        for(int i=m;i<=n;i++)
        {
            //verificare prim x
            for(x=2;x<=i/2;x++) {
                int ok = 1;
                for (int d = 2; d * d <= x; d++)
                    if (x % d == 0)
                        ok = 0;
                if (ok == 1) {
                    //verificare prim i-x
                    y = i - x;
                    for (int d = 2; d * d <= y; d++)
                        if (y % d == 0)
                            ok = 0;
                }
                if (ok == 1)
                    System.out.println(x + " " + y);
            }
        }
    }
}