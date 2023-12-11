import java.util.*;

public class Main {
    public static void main(String[] args) {
        FacebookAccount facebookAccount=new FacebookAccount("Kulcsar Noemi", 19, "Beclean");
        facebookAccount.adaugaPrieten("Pantea Tania");
        facebookAccount.adaugaPrieten("Repede Oana");
        facebookAccount.adaugaPrieten("Ureche Simona");
        facebookAccount.adaugaPrieten("Ricu Alexandru");
        facebookAccount.adaugaPrieten("Moga Eduard");
        facebookAccount.adaugaPrieten("Yusuf Hisil");
        facebookAccount.adaugaPrieten("Moisan Catalin");
        facebookAccount.adaugaPrieten("Tetean Paul");
        facebookAccount.adaugaPrieten("Roescu Rares");
        facebookAccount.adaugaPrieten("Tinca Andrei");
        facebookAccount.adaugaPrieten("Hulea Andrei");
        facebookAccount.afisarePrieteni();
        facebookAccount.stergePrieten("Hulea Andrei");//Oana m a pus:)))
        facebookAccount.stergePrieten("Tetean Paul");
        System.out.println();
        facebookAccount.afisarePrieteni();
        boolean existaOana= facebookAccount.cautaPrieten("Repede Oana");
        boolean existaVasile=facebookAccount.cautaPrieten("Pop Vasile");
        if(existaOana==true)
            System.out.println("da");
        else
            System.out.println("nu");
        if(existaVasile==true)
            System.out.println("da");
        else
            System.out.println("nu");
    }
}