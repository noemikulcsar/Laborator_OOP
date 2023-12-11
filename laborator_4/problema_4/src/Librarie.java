public class Librarie
{
    private String nume;
    private String adresa;
    private int nrCarti;
    private Carte[] carte=new Carte[10];

    public Librarie(String nume, String adresa, int nrCarti) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrCarti = nrCarti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrCarti() {
        return nrCarti;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }
    public Carte getCarteI(int i)
    {
        return this.carte[i];
    }
    public void setCarteI(Carte c, int i)
    {
        this.carte[i]=c;
    }
    public int getPretMaxim()
    {
        int max=0;
        for(int i=1;i<=this.nrCarti;i++)
            if(this.carte[i].getPret()>max)
                max=this.carte[i].getPret();
        return max;
    }
    public String toString()
    {
        return "Libraria are numele "+this.nume+" si se afla la adresa "+this.adresa;
    }
}
