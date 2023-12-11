import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 10;
        Random rand = new Random();
        int x = rand.nextInt(n);
        System.out.println(x);
    }
}