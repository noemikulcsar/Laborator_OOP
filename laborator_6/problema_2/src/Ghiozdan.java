public class Ghiozdan
{
    private int size;
    Rechizita [] r=new Rechizita[10];

    public Ghiozdan(int size) {
        this.size = size;
    }
    public void setRechizitaI(Rechizita r, int i)
    {
        this.r[i]=r;
    }
    public void add(Caiet c)
    {
        this.r[this.size]=c;
        this.size++;
    }
    public void add(Manual m)
    {
        this.r[this.size]=m;
        this.size++;
    }
    public void listItems()
    {
        for(int i=0;i<this.size;i++)
            System.out.println(this.r[i].getNume());
    }
    public void listManual()
    {
        for(int i=0;i<this.size;i++)
            if(r[i] instanceof Manual)
                System.out.println(this.r[i].getNume());
    }
    public void listCaiet()
    {
        for(int i=0;i<this.size;i++)
            if(r[i] instanceof Caiet)
                System.out.println(this.r[i].getNume());
    }
    public int getNrRechizite()
    {
        return this.size;
    }
    public int getNrManuale()
    {
        int ans=0;
        for(int i=0;i<this.size;i++)
            if(this.r[i] instanceof Manual)
                ans++;
        return ans;
    }
    public int getNrCaiete()
    {
        int ans=0;
        for(int i=0;i<this.size;i++)
            if(this.r[i] instanceof Caiet)
                ans++;
        return ans;
    }

}
