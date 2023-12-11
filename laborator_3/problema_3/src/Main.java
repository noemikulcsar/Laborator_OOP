import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        System.out.println(s);
        int numar_consoane=0,numar_vocale=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
            || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
                numar_vocale++;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
                numar_consoane++;
        }
        System.out.println(numar_vocale+" "+numar_consoane);
        char voc=in.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==voc)
                System.out.print(i+" ");
        }
    }
}