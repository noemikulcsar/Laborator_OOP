abstract class Figura//PiesaSah
{
    private int x;
    private int y;

    abstract void mutaPiesa(int xNou, int yNou);

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
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

    public abstract boolean isValid(Figura f, int x, int y);
}
