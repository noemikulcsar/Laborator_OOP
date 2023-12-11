import java.util.Arrays;

public class TestPersoana
{
    public static void testPersoana()
    {
        int n=5;
        Persoana [] p=new Persoana[5];
        p[0]=new Persoana("Pop","Ion",56);
        p[1]=new Persoana("Buia","Alina",34);
        p[2]=new Persoana("Roman","Carla",19);
        p[3]=new Persoana("Liman","Ingrid",25);
        p[4]=new Persoana("Moldovan","Ionela",30);
        Arrays.sort(p);
        for(int i=0;i<n;i++)
            System.out.println(p[i].toString());
    }
}
