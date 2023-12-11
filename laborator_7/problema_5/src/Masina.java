public class Masina implements Cloneable
{
    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public void revopsire(String nouaCuloare)
    {
        this.culoare=nouaCuloare;
    }
    public String toString()
    {
        return "Masina este de marca "+this.marca+" si are culoarea "+this.culoare;
    }
    public void shallowCopy(Masina masina)
    {
        this.culoare=masina.culoare;
        this.marca=masina.marca;
    }
    //shallow copy
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //deep copy
    public Object deepClone() throws CloneNotSupportedException {
        Masina masinaClone = (Masina)(super.clone());
        return masinaClone;
    }
}
