import java.util.*;
public class TestGhiozdan
{
    public static void testGhiozdan()
    {
        Ghiozdan g=new Ghiozdan(7);
        Caiet c1=new Caiet("caiet 1");
        Caiet c2=new Caiet("caiet 2");
        Caiet c3=new Caiet("caiet 3");
        Caiet c4=new Caiet("caiet 4");
        Manual m1=new Manual("manual 1");
        Manual m2=new Manual("manual 2");
        Manual m3=new Manual("manual 3");
        g.setRechizitaI(c1,0);
        g.setRechizitaI(c2,1);
        g.setRechizitaI(c3,2);
        g.setRechizitaI(c4,3);
        g.setRechizitaI(m1,4);
        g.setRechizitaI(m2,5);
        g.setRechizitaI(m3,6);
        System.out.println("Avem "+g.getNrRechizite()+" rechizite");
        System.out.println("Avem "+g.getNrCaiete()+" caiete");
        System.out.println("Avem "+g.getNrManuale()+" manuale");
        System.out.println("Toate rechizitele sunt");
        g.listItems();
        System.out.println("Toate caietele sunt");
        g.listCaiet();
        System.out.println("Toate manuale sunt");
        g.listManual();
    }
}
