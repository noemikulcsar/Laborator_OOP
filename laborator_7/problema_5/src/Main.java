import java.util.*;
public class Main {
    public static void main(String[] args) {
        Masina m1=new Masina("Audi", "alb");
        Masina m2=new Masina("BMW", "negru");
        Student s1=new Student("Pop","Raluca",m1);
        Student s2=new Student("Rizoiu","Lucia",m2);
        try
        {
            Student studentShallowCopy=(Student)s1.clone();
            Student studentDeepCopy=(Student)s2.deepClone();
            studentShallowCopy.getMasina().revopsire("roz");
            studentDeepCopy.getMasina().revopsire("roz");
            System.out.println(s1.getMasina().toString());
            System.out.println(s2.getMasina().toString());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}