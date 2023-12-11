public class Turn
{
    private int x;
    private int y;
    private String culoare;//alb sau negru pentru a sti directia mutarii

    public Turn(int x, int y, String culoare) {
        this.x = x;
        this.y = y;
        this.culoare = culoare;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isValid(int xNou,int yNou)
    {
        if(xNou<1 || xNou>8 || yNou<1 || yNou>8)
            return false;
        //consideram tabla de sah goala
        if(xNou==x && yNou!=y)
            return true;
        else if(xNou!=x && yNou==y)
            return true;
        return false;
    }
}
