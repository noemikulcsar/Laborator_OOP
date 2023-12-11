public class TestTablaSah
{
    public static void testTablaSah()
    {
        TablaSah tabla=new TablaSah();
        Pion p1=new Pion(1,2);
        Pion p2=new Pion(2,2);
        Pion p3=new Pion(3,2);
        Pion p4=new Pion(4,2);
        Pion p5=new Pion(5,2);
        Pion p6=new Pion(6,2);
        Pion p7=new Pion(7,2);
        Pion p8=new Pion(8,2);
        Turn t1=new Turn(1,1);
        Turn t2=new Turn(8,1);
        Cal c1=new Cal(2,1);
        Cal c2=new Cal(7,1);
        Nebun n1=new Nebun(3,1 );
        Nebun n2=new Nebun(6,1);
        tabla.adaugaPiesa(p1,1,2);
        tabla.adaugaPiesa(p2,2,2);
        tabla.adaugaPiesa(p3,3,2);
        tabla.adaugaPiesa(p4,4,2);
        tabla.adaugaPiesa(p5,5,2);
        tabla.adaugaPiesa(p6,6,2);
        tabla.adaugaPiesa(p7,7,2);
        tabla.adaugaPiesa(p8,8,2);
        tabla.adaugaPiesa(t1,1,1);
        tabla.adaugaPiesa(t2,8,1);
        tabla.adaugaPiesa(c1,2,1);
        tabla.adaugaPiesa(c2,7,1);
        tabla.adaugaPiesa(n1,3,1);
        tabla.adaugaPiesa(n2,6,1);
        tabla.mutareValida(t1,1,2);
        //tabla.mutaPiesa(t1,1,2);//ne asteptam sa fie ocupata pozitia
        tabla.mutareValida(p1,8,8);
        //tabla.mutaPiesa(p1,8,8);//ne asteptam sa dea reguli de joc neindeplinite
        tabla.mutareValida(n1,8,6);
        //tabla.mutaPiesa(n1,8,6);//ne asteptam sa nu se poata muta piesa
    }
}
