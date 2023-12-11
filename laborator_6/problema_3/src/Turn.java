public class Turn extends Figura
{
    public Turn(int x, int y) {
        super(x, y);
    }
    public boolean isValid(Figura f, int xNou, int yNou)
    {
        if(f instanceof Turn)
        {
            if(xNou<1 || xNou>8 || yNou<1 || yNou>8)
                return false;
            //consideram tabla de sah goala
            if(xNou==f.getX() && yNou!=f.getY())
                return true;
            else if(xNou!=f.getX() && yNou==f.getY())
                return true;
            return false;
        }
        return false;
    }
    @Override
    void mutaPiesa(int xNou, int yNou) {

    }
}
