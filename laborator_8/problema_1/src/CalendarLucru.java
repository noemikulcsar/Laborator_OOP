public class CalendarLucru
{
    private Zi [] zile=new Zi[8];

    public CalendarLucru() {
    }

    public void setZile(Zi[] zile) {
        this.zile = zile;
    }

    public Zi getZileI(int i) {
        return this.zile[i];
    }
    public void setZile(Zi z, int i) {
        this.zile[i]=z;
    }
}
