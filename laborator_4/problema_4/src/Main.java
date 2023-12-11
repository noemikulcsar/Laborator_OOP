import java.util.*;
public class Main {
    public static void main(String[] args) {
        Carte c1=new Carte("Ion", "Liviu Rebreanu",345,"drama",25);
        Carte c2=new Carte("Enigma Otiliei","George Calinescu", 450, "realist",30);
        Carte c3=new Carte("Baltagul","Mihail Sadoveanu",300,"drama", 20);
        Librarie librarie=new Librarie("Alexandria","Strada Garii 54",3);
        librarie.setCarteI(c1,1);
        librarie.setCarteI(c2,2);
        librarie.setCarteI(c3,3);
        int pretMaxim= librarie.getPretMaxim();
        System.out.println(pretMaxim);
        librarie.getCarteI(2).reducere(5);
        pretMaxim= librarie.getPretMaxim();
        System.out.println(pretMaxim);
        librarie.getCarteI(2).scumpire(10);
        pretMaxim= librarie.getPretMaxim();
        System.out.println(pretMaxim);
    }
}