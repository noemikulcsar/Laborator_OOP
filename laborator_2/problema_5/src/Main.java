import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Scrieți un program în care citiţi de la consolă valori întregi şi numere reale şi le afişaţi apoi pe ecran
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int x = in.nextInt();
            System.out.println(x + " ");
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            double y = in.nextDouble();
            System.out.println(y + " ");
        }
        System.out.println();
    }
}