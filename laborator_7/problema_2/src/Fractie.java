public class Fractie implements Numeric
{
    private int a;
    private int b;

    public Fractie(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public Numeric adunare(Numeric q) {
        if(q instanceof Fractie)
        {
            int numarator=this.a*((Fractie)q).b+this.b*((Fractie)q).a;
            int numitor=this.b*((Fractie)q).b;
            this.a=numarator;
            this.b=numitor;
            return new Fractie(numarator,numitor);
        }
        return null;
    }

    @Override
    public Numeric scadere(Numeric q) {
        if(q instanceof Fractie)
        {
            int numarator=this.a*((Fractie)q).b-this.b*((Fractie)q).a;
            int numitor=this.b*((Fractie)q).b;
            this.a=numarator;
            this.b=numitor;
            return new Fractie(numarator,numitor);
        }
        return null;
    }

    @Override
    public Numeric inmultire(Numeric q) {
        if(q instanceof Fractie)
        {
            int numarator=this.a*((Fractie)q).a;
            int numitor=this.b*((Fractie)q).b;
            this.a=numarator;
            this.b=numitor;
            return new Fractie(numarator,numitor);
        }
        return null;
    }

    @Override
    public Numeric inmultire_scalar(Numeric q,int x) {
        if(q instanceof Fractie)
        {
            int numarator=this.a*x;
            int numitor=this.b;
            this.a=numarator;
            this.a=numarator;
            this.b=numitor;
            return new Fractie(numarator,numitor);
        }
        return null;
    }
    public String toString()
    {
        return this.a+"/"+this.b;
    }
}
