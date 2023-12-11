public class Main
{
    /*
    3.2. Definiţi o clasă Complex pentru lucrul cu numere complexe. Apoi definiți clasa Matrice de numere
complexe care să implementeze operaţiile de adunare, scădere, înmulţire de matrice, precum şi
înmulțirea cu un scalar. Construiți diagrama UML de clase a aplicației.
    */
    public static void main(String[] args)
    {
        Complex a=new Complex(3.4,2.5);
        Complex b=new Complex(2.7,9.0);
        System.out.println(a.getReal()+" "+a.getImaginar()+" "+b.getReal()+" "+b.getImaginar());
        a.getSuma(a,b);
        System.out.println(a.getReal()+" "+a.getImaginar());
        System.out.println(a.getModul());
        a.getProdus(a,b);
        System.out.println(a.getReal()+" "+a.getImaginar()+" "+b.getReal()+" "+b.getImaginar());
        Matrice m1=new Matrice(3,3);
        for(int i=0;i<m1.getLinii();i++)
            for(int j=0;j<m1.getColoane();j++)
            {
                m1.mat[i][j].setNumar((double)(i+j),0);
            }
        Matrice m2=new Matrice(3,3);
        for(int i=0;i<m2.getLinii();i++)
            for(int j=0;j<m2.getColoane();j++)
            {
                m2.mat[i][j].setNumar((double)(i+j),0);
            }
        m1.Inmultire(m1,m2);
        for(int i=0;i< m1.getLinii();i++)
        {
            for(int j=0;j<m1.getColoane();j++)
                System.out.print(m1.mat[i][j].getReal()+"+"+m1.mat[i][j].getImaginar()+"*j"+" ");
            System.out.println();
        }
    }
}