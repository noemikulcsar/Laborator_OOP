public class Main {
    public static void main(String[] args) {
        Zi [] zile=new Zi[8];
        zile[1]=new Zi("Luni", true);
        zile[2]=new Zi("Marti", true);
        zile[3]=new Zi("Miercuri", false);
        zile[4]=new Zi("Joi", true);
        zile[5]=new Zi("Vineri", true);
        zile[6]=new Zi("Sambata", false);
        zile[7]=new Zi("Duminica", false);
        CalendarLucru calendar=new CalendarLucru();
        calendar.setZile(zile);
        Lucrator lucrator=new Lucrator("Gigel");
        lucrator.setCalendar(calendar);
        try {
            lucrator.lucreaza("Marte");
        } catch (ExceptieZiNelucratoare e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        try {
            lucrator.lucreaza("Luni");
        } catch (ExceptieZiNelucratoare e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        try {
            lucrator.lucreaza("Sambata");
        } catch (ExceptieZiNelucratoare e) {
            throw new RuntimeException(e);
        }
        System.out.println();

    }
}