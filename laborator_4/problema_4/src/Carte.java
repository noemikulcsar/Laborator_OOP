public class Carte
{
    private String nume;
    private String autor;
    private int nrPagini;
    private String gen;
    private int pret;

    public Carte(String nume, String autor, int nrPagini, String gen, int pret) {
        this.nume = nume;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.gen = gen;
        this.pret=pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getPret() {
        return pret;
    }
    public String toString()
    {
        return "Numele cartii este "+this.nume+", avand autorul "+this.autor+" si are "+this.nrPagini+" pagini.";
    }
    public void setPret(int pret) {
        this.pret = pret;
    }
    public void scumpire(int lei)
    {
        this.pret+=lei;
    }
    public void reducere(int lei)
    {
        this.pret-=lei;
    }
    public boolean esteGen(String gen)
    {
        if(this.gen.equals(gen))
            return true;
        return false;
    }
}
