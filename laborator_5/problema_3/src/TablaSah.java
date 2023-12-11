public class TablaSah
{
    private Pion [][] tabla=new Pion[9][9];

    public TablaSah() {
        for(int i=1;i<=8;i++)
            for(int j=1;j<=8;j++)
                this.tabla[i][j]=null;
    }
    public void adaugaPion(Pion p)
    {
        int x = p.getX();
        int y = p.getY();
        if (x >= 1 && x <= 8 && y >= 1 && y <= 8)
            tabla[x][y] = p;
        else
            System.out.println("Pionul nu poate fi adaugat la pozitia specificata");
    }
    public boolean mutareValida(Pion p, int xNou, int yNou)
    {
        if (p.isValid(xNou, yNou))
        {
            if (tabla[xNou][yNou] == null)
                return true;
            else
                System.out.println("Pozitia este deja ocupata");
        }
        else
            System.out.println("Reguli de mutare neindeplinite");
        return false;
    }
}
