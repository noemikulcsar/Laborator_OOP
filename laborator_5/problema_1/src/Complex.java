import java.lang.Math;
import java.awt.*;
public class Complex
{
    private double x;//partea reala
    private double y;//partea imaginara
    public double getReal()
    {
        return this.x;
    }
    public double getImaginar()
    {
        return this.y;
    }
    public Complex setNumar(double x,double y)
    {
        this.x=x;
        this.y=y;
        return this;
    }
    public Complex(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getModul()
    {
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public Complex getSuma(Complex a,Complex b)
    {
        a.x+=b.x;
        a.y+=b.y;
        return a;
    }
    public Complex getDiferenta(Complex a,Complex b)
    {
        a.x-=b.x;
        a.y-=b.y;
        return a;
    }
    public Complex getProdus(Complex a,Complex b)
    {
        Complex c=new Complex(0,0);
        c.x=a.x*b.x-a.y*b.y;
        c.y=a.x*b.y+a.y*b.x;
        return c;
    }
    public Complex getInmultireCuScalar(double k,Complex a)
    {
        a.x*=k;
        a.y*=k;
        return a;
    }
}
