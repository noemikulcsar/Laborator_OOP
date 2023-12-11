public class Cal extends Figura
{
    public Cal(int x, int y) {
        super(x, y);
    }
    public boolean isValid(Figura f, int xNou, int yNou)
    {
        if(f instanceof Cal)
        {
            if(xNou<1 || xNou>8 || yNou<1 || yNou>8)
                return false;
            else if((xNou-f.getX())==1 && (yNou-f.getY())==2)
                return true;
            else if((xNou-f.getX())==2 && (yNou-f.getY())==1)
                return true;
            else if((xNou-f.getX())==-1 && (yNou-f.getY())==2)
                return true;
            else if((xNou-f.getX())==2 && (yNou-f.getY())==-1)
                return true;
            else if((xNou-f.getX())==1 && (yNou-f.getY())==-2)
                return true;
            else if((xNou-f.getX())==-2 && (yNou-f.getY())==1)
                return true;
            else if((xNou-f.getX())==-1 && (yNou-f.getY())==-2)
                return true;
            else if((xNou-f.getX())==-2 && (yNou-f.getY())==-1)
                return true;
            return false;
        }
        return false;
    }
    @Override
    void mutaPiesa(int xNou, int yNou) {

    }
}
