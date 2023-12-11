import java.util.*;
public class Autovehicul
{
    private String nume;
    private String culoare;
    private int vitezaCurenta;
    private int treaptaCurenta;
    private int vitezaMaxima;
    private int numarTrepte;

    private final int id=99;
    private Rezervor rezervor;
    private Sofer sofer;

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public int getTreaptaCurenta() {
        return treaptaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public int getNumarTrepte() {
        return numarTrepte;
    }

    public int getId() {
        return id;
    }

    public Rezervor getRezervor() {
        return rezervor;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public Autovehicul(String nume, String culoare, int viteza_curenta, int treapta_curenta, int viteza_maxima,
                       int numar_trepte, Sofer sofer, Rezervor rezervor) {
        this.nume = nume;
        this.culoare = culoare;
        this.vitezaCurenta = viteza_curenta;
        this.treaptaCurenta = treapta_curenta;
        this.vitezaMaxima = viteza_maxima;
        this.numarTrepte = numar_trepte;
        this.sofer=sofer;
        this.rezervor=rezervor;
    }
    public void accelerare(int kmh)
    {
        this.vitezaCurenta+=kmh;
    }
    public void decelerare(int kmh)
    {
        this.vitezaCurenta-=kmh;
    }
    public void schimbare_treapta_viteza(int treapta)
    {
        this.treaptaCurenta=treapta;
    }
    public void oprire()
    {
        this.vitezaCurenta=0;
        this.treaptaCurenta=0;
    }
    public String toString()
    {
        return "Masina este "+this.nume+" si este de culoare "+this.culoare;
    }
}
