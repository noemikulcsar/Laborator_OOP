import java.util.*;
public class Main {
    public static void main(String[] args) {
        //concatenare
        String hello="Hello ";
        String world="world!";
        String helloWorld=hello+world;
        System.out.println(hello+world);
        //egalitatea
        String s1="abcde";
        String s2="abcde";
        if(s1==s2)
            System.out.println("egale");
        else
            System.out.println("diferite");
        s2="fghijk";
        if(s1==s2)
            System.out.println("egale");
        else
            System.out.println("diferite");
        //metoda equals
        s2="abcde";
        if(s1.equals(s2))
            System.out.println("egale");
        else
            System.out.println("diferite");
    }
}