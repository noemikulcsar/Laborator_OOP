import java.util.*;
public class Main {

    public static void main(String[] args) {

        Sofer sof1 = new Sofer("Ion",45, 12345);
        Rezervor rez1=new Rezervor(100,50);
        Autovehicul aut1 = new Autovehicul("matiz","roz",75,3,269,6, sof1, rez1);
        System.out.println(sof1.toString());
        System.out.println(aut1.toString());
        /*int acc=10;
        System.out.println(aut1.getVitezaCurenta());
        aut1.accelerare(acc);
        System.out.println(aut1.getVitezaCurenta());*/
        System.out.println("TestDrive Tzanca Uraganu");
        TestDrive.testDrive();
    }
}