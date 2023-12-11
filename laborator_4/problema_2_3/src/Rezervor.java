public class Rezervor
{
    private int capacitate;
    private int nivelUmplere;

    public Rezervor(int capacitate, int nivelUmplere) {
        this.capacitate = capacitate;
        this.nivelUmplere = nivelUmplere;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public int getNivelUmplere() {
        return nivelUmplere;
    }

    public void setNivelUmplere(int nivelUmplere) {
        this.nivelUmplere = nivelUmplere;
    }
    public String toString()
    {
        return "Capacitatea rezervorului este "+this.capacitate+", iar nivelul curent de umplere este "+this.nivelUmplere;
    }
    public void umplereCombustibil(int litri)
    {
        if((this.nivelUmplere+litri)>this.capacitate)
            this.nivelUmplere=this.capacitate;
        else
            this.nivelUmplere+=litri;
    }
    public void golireCombustibil(int litri)
    {
        if((this.nivelUmplere-litri)<0)
            this.nivelUmplere=0;
        else
            this.nivelUmplere-=litri;
    }
    public int afisare(int litri)//metoda supraincarcata
    {
        return litri;
    }
    public String afisare(String mesaj)
    {
        return mesaj;
    }
}
