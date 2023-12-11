public class Pion extends Figura
{

    public Pion(int x, int y) {
        super(x, y);
    }

    public boolean isValid(Figura f, int xNou, int yNou)
    {
        if(f instanceof Pion)
        {
            if(xNou<1 || xNou>8 || yNou<1 || yNou>8)
                return false;
            else if(f.getX()!=xNou)
                return false;
            else if((yNou-f.getY())==1)
                    return true;
            else return false;
        }
        return false;
    }
    @Override
    void mutaPiesa(int xNou, int yNou) {

    }
}
