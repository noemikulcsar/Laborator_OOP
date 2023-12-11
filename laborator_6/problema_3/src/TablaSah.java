public class TablaSah
{
    Figura [][] tabla=new Figura[9][9];

    public TablaSah()
    {
        for(int i=1;i<=8;i++)
            for(int j=1;j<=8;j++)
                tabla[i][j]=null;
    }
    public void adaugaPiesa(Figura f, int x, int y)
    {
        if(x>=1 && x<=8 && y>=1 && y<=8 && tabla[x][y]==null)
        {
            tabla[x][y]=f;
            System.out.println("Mutare efectuata cu succes:)");
        }
        else
            System.out.println("Piesa nu poate fi adaugat la pozitia specificata");
    }
    public boolean esteLiber(Figura f, int x, int y)
    {
        //facem abstractie de capturarea pieselor
        if(f instanceof Pion)
        {
            if(tabla[x][y]==null)
                return true;
            return false;
        }
        else if(f instanceof Turn)
        {
            if(f.getX()<x)
            {
                for(int i=f.getX()+1;i<=x;i++)
                    if(tabla[i][y]!=null)
                        return false;
            }
            else if(f.getX()>x)
            {
                for(int i=f.getX()-1;i>=x;i--)
                    if(tabla[i][y]!=null)
                        return false;
            }
            else if(f.getY()<y)
            {
                for(int i=f.getY()+1;i<=y;i++)
                    if(tabla[x][i]!=null)
                        return false;
            }
            else if(f.getY()>y)
            {
                for(int i=f.getY()-1;i>=y;i++)
                    if(tabla[x][i]!=null)
                        return false;
            }
            return false;
        }
        else if(f instanceof Cal)
        {
            if(tabla[x][y]==null)
                return true;
            return false;
        }
        else if(f instanceof Nebun)
        {
            if ((x-f.getX())==(y-f.getY())) {
                for (int i = 1; i <=(x-f.getX()) ; i++)
                    if (tabla[f.getX()+i][f.getY()+i] != null)
                        return false;
                return true;
            } else if ((x-f.getX())==(f.getY()-y)) {
                for (int i = 1; i <=(x-f.getX()); i++)
                    if (tabla[f.getX()+i][f.getY()-i] != null)
                        return false;
                return true;
            } else if ((f.getX()-x)==(f.getY()-y)) {
                for (int i = 1; i <= (x-f.getX()); i++)
                    if (tabla[f.getX()-i][f.getY()-i] != null)
                        return false;
                return true;
            } else if((x-f.getX())==(y-f.getY())){
                for (int i = 1; i <=(x-f.getX()); i++)
                    if (tabla[f.getX()-i][f.getY()+i] != null)
                        return false;
                return true;
            }
            else
                return false;
        }
        return false;
    }
    public boolean mutareValida(Figura f, int x,int y)
    {
        if (f.isValid(f, x, y))
        {
            if (tabla[x][y] == null && esteLiber(f,x,y))
                return true;
            else if(tabla[x][y]!=null)
                System.out.println("Pozitia este deja ocupata");
            else if(!esteLiber(f,x,y))
                System.out.println("Nu exista cale libera pentru piesa");
        }
        else
            System.out.println("Reguli de mutare neindeplinite");
        return false;
    }
    public void mutaPiesa(Figura f, int x, int y)
    {
        if(f.isValid(f,x,y))
        {
            if(tabla[x][y]==null)
                tabla[x][y]=f;
            else
                System.out.println("Pozitia este deja ocupata");
        }
        else
            System.out.println("Reguli de mutare neindeplinite");
    }
}
