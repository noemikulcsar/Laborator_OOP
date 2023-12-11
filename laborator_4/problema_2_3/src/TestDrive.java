import java.util.*;
import java.awt.*;
public class TestDrive {

    public static void testDrive()
    {
        Sofer sof2 = new Sofer("George", 18, 45678);
        Rezervor rez2=new Rezervor(200, 75);
        Autovehicul aut2 = new Autovehicul("audi", "alb", 100, 5, 500, 8, sof2, rez2);
        System.out.println("Viteza curenta este de "+aut2.getVitezaCurenta()+" kmh");
        aut2.accelerare(10);
        System.out.println("Noua viteza este de "+aut2.getVitezaCurenta()+" kmh");
        System.out.println("Masina are informatiile");
        System.out.println(aut2.toString());
    }
}
