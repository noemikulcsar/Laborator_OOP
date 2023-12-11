public class Persoana implements Comparable<Persoana>
{
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public String toString()
    {
        return "Nume: "+this.nume+", Prenume: "+this.prenume+", Varsta:"+this.varsta;
    }

    @Override
    public int compareTo(Persoana persoana) {
        return this.varsta-persoana.varsta;
    }
}
