import java.awt.*;
public class ComplexMatrice
    //l am facut pentru diagrama UML, ca nu puteam selecta doar Complex si Matrice, fiindca Main era
    //intre cele doua clase alfabetic
{
    private int n;
    private int m;
    public Complex [][] mat;
    public int getLinii()
    {
        return this.n;
    }
    public int getColoane()
    {
        return this.m;
    }
    public ComplexMatrice(int n,int m)
    {
        this.n=n;
        this.m=m;
        this.mat=new Complex[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                this.mat[i][j]=new Complex(0,0);
            }
    }
    public Matrice Adunare(Matrice a,Matrice b)
    {
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a.mat[i][j].getSuma(a.mat[i][j],b.mat[i][j]);
        return a;
    }
    public Matrice Scadere(Matrice a,Matrice b) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a.mat[i][j].getDiferenta(a.mat[i][j], b.mat[i][j]);
        return a;
    }
    public Matrice Inmultire(Matrice a,Matrice b)
    {
        Matrice c=new Matrice(a.getLinii(),a.getColoane());
        for(int i=0;i<a.getLinii();i++)
            for(int j=0;j<a.getColoane();j++)
                c.mat[i][j].setNumar(0, 0);
        for(int i=0;i<a.getLinii();i++)
        {
            for(int j=0;j<a.getColoane();j++)
            {
                for(int k=0;k<b.getLinii();k++)
                {
                    c.mat[i][j].getSuma(c.mat[i][j],c.mat[i][j].getProdus(a.mat[i][k],b.mat[k][j]));
                }
            }
        }
        for(int i=0;i<a.getLinii();i++)
            for(int j=0;j<a.getColoane();j++)
                a.mat[i][j]=c.mat[i][j];
        return a;
    }
}
