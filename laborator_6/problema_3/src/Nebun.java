public class Nebun extends Figura
{
    public Nebun(int x, int y) {
        super(x, y);
    }
    public boolean isValid(Figura f, int xNou,int yNou)
    {
        if(f instanceof Figura)
        {
            if(xNou<1 || xNou>8 || yNou<1 || yNou>8)
                return false;
            else if((xNou-f.getX())==(yNou-f.getY()))
                return true;
            else if((xNou-f.getX())==(f.getY()-yNou))
                return true;
            else if((f.getX()-xNou)==(f.getY()-yNou))
                return true;
            else if((xNou-f.getX())==(yNou-f.getY()))
                return true;
            return false;
        }
        return false;
    }
    @Override
    void mutaPiesa(int xNou, int yNou) {

    }
}
