public class Matrice
{
    private int n;//numar linii
    private int m;//numar coloane
    public Numeric [][]mat=new Numeric[5][5];

    public Matrice(int n, int m, Numeric def) {
        this.n = n;
        this.m = m;
        for(int i=0;i<this.n;i++)
            for(int j=0;j<this.m;j++)
                if(def instanceof Fractie)
                    this.mat[i][j]=new Fractie(1,1);
                else if(def instanceof Complex)
                    this.mat[i][j]=new Complex(0,0);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    public void adunare(Matrice a)
    {
        if(this.n==a.n && this.m==a.m)
        {
            for(int i=0;i<this.n;i++)
                for(int j=0;j<this.m;j++)
                    this.mat[i][j].adunare(a.mat[i][j]);
        }
    }
    public void scadere(Matrice a)
    {
        if(this.n==a.getN() && this.m==a.getM())
        {
            for(int i=0;i<this.n;i++)
                for(int j=0;j<this.m;j++)
                    this.mat[i][j].scadere(a.mat[i][j]);
        }
    }
    public void inmultire(Matrice a,Matrice b)
    {
        if(a.getM()==b.getN())
        {
            Matrice aux=null;
            if(a.mat[0][0] instanceof Fractie)
            {
                aux=new Matrice(a.getN(),a.getM(),new Fractie(0,0));
            }
            else
            {
                aux=new Matrice(a.getN(),a.getM(),new Complex(0,0));
            }
            for(int i=0;i<a.getN();i++)
                for(int j=0;j<a.getM();j++)
                    if(a.mat[0][0] instanceof Fractie)
                    {
                        Fractie f=new Fractie(1,1);
                        aux.mat[i][j]=f;
                    }
                    else if(a.mat[0][0] instanceof Matrice)
                    {
                        Complex c=new Complex(0, 0);
                        aux.mat[i][j]=c;
                    }
            if(a.mat[0][0] instanceof Fractie) {
                for(int i=0;i<a.getN();i++)
                {
                    for(int j=0;j<a.getM();j++)
                    {
                        for(int k=0;k<b.getN();k++)
                        {
                            Fractie f=new Fractie(1,1);
                            f.inmultire(a.mat[i][k]);
                            aux.mat[i][j]=f;
                            aux.mat[i][j].adunare(aux.mat[i][j].inmultire(b.mat[k][j]));
                        }
                    }
                }
            }
            if(a.mat[0][0] instanceof Complex) {
                for(int i=0;i<a.getN();i++)
                {
                    for(int j=0;j<a.getM();j++)
                    {
                        for(int k=0;k<b.getN();k++)
                        {
                            Complex f=new Complex(0,0);
                            f.inmultire(a.mat[i][k]);
                            aux.mat[i][j]=f;
                            aux.mat[i][j].adunare(aux.mat[i][j].inmultire(b.mat[k][j]));
                        }
                    }
                }
            }
        }
    }
    public void afisare()
    {
        for(int i=0;i<this.getN();i++)
        {
            for(int j=0;j<this.getM();j++)
                System.out.print(this.mat[i][j].toString()+" ");
            System.out.println();
        }
    }
}
