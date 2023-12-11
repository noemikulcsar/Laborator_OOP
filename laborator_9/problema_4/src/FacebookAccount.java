import java.util.*;

public class FacebookAccount
{
    private String nume;
    private int varsta;
    private String locatie;
    private ArrayList<String> prieteni;

    public FacebookAccount(String nume, int varsta, String locatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.locatie = locatie;
        this.prieteni=new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getLocatie() {
        return locatie;
    }

    public ArrayList<String> getPrieteni() {
        return prieteni;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setPrieteni(ArrayList<String> prieteni) {
        this.prieteni = prieteni;
    }
    public void adaugaPrieten(String nou)
    {
        this.prieteni.add(nou);
    }
    public void stergePrieten(String nou)
    {
        this.prieteni.remove(nou);
    }
    public void afisarePrieteni()
    {
        Iterator<String> it = prieteni.iterator();
        while(it.hasNext())
        {
            String prieten = it.next();
            System.out.println(prieten);
        }
    }
    public boolean cautaPrieten(String cautare)
    {
        Iterator<String> it = prieteni.iterator();
        while(it.hasNext())
        {
            String prieten = it.next();
            if(prieten.equals(cautare))
                return true;
        }
        return false;
    }
}
