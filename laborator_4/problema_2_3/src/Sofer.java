import java.awt.*;
public class Sofer
{
    private String nume;
    private int varsta;

    private int id_permis;

    public Sofer(String nume, int varsta, int id_permis) {
        this.nume = nume;
        this.varsta = varsta;
        this.id_permis = id_permis;
    }

    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public int getId_permis() {
        return this.id_permis;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setId_permis(int id_permis) {
        this.id_permis = id_permis;
    }

    public String toString()
    {
        return "Numele soferului este "+this.nume+", si are "+this.varsta+" ani ";
    }
}
