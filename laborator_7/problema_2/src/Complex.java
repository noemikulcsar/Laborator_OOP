public class Complex implements Numeric
{
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }
    @Override
    public Numeric adunare(Numeric q) {
        if(q instanceof Complex)
        {
            this.real+=((Complex) q).real;
            this.imag+=((Complex) q).imag;
            return new Complex(this.real,this.imag);
        }
        return null;
    }

    @Override
    public Numeric scadere(Numeric q) {
        if(q instanceof Complex)
        {
            this.real-=((Complex) q).real;
            this.imag-=((Complex) q).imag;
            return new Complex(this.real,this.imag);
        }
        return null;
    }

    @Override
    public Numeric inmultire(Numeric q) {
        if(q instanceof Complex)
        {
            int real=this.real*((Complex) q).real-this.imag*((Complex) q).imag;
            int imag=this.real*((Complex) q).imag+this.imag*((Complex) q).real;
            this.real=real;
            this.imag=imag;
            return new Complex(this.real,this.imag);
        }
        return null;
    }

    @Override
    public Numeric inmultire_scalar(Numeric q, int x) {
        if(q instanceof Complex)
        {
            this.real*=x;
            this.imag*=x;
            return new Complex(this.real,this.imag);
        }
        return null;
    }
    public String toString()
    {
        return this.real+"+"+this.imag+"*j";
    }
}
