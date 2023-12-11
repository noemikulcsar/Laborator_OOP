public class Main {
    public static void main(String[] args) {
        Pion mat[][]=new Pion[9][9];
        TablaSah tablaSah=new TablaSah();
        Pion p1=new Pion(1,2,"alb");
        Pion p2=new Pion(2,2,"alb");
        Pion p3=new Pion(3,2,"alb");
        Pion p4=new Pion(4,2,"alb");
        Pion p5=new Pion(5,2,"alb");
        Pion p6=new Pion(5,3,"alb");
        tablaSah.adaugaPion(p1);
        tablaSah.adaugaPion(p2);
        tablaSah.adaugaPion(p3);
        tablaSah.adaugaPion(p4);
        tablaSah.adaugaPion(p5);
        tablaSah.adaugaPion(p6);
        tablaSah.mutareValida(p5,5,3);
    }
}