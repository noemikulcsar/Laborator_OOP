public class Zi
{
    private String nume;
    private boolean esteLucratoare;

    public Zi(String nume, boolean esteLucratoare) {
        this.nume = nume;
        this.esteLucratoare = esteLucratoare;
    }

    public String getNume() {
        return nume;
    }

    public boolean getEsteLucratoare() {
        return esteLucratoare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEsteLucratoare(boolean esteLucratoare) {
        this.esteLucratoare = esteLucratoare;
    }
}
