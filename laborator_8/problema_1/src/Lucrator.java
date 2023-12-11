public class Lucrator
{
    private String nume;
    CalendarLucru calendar=new CalendarLucru();

    public Lucrator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setCalendar(CalendarLucru calendar) {
        this.calendar = calendar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        int dayIndex = getDayIndex(zi);
        if (dayIndex != -1) {
            if (!calendar.getZileI(dayIndex).getEsteLucratoare()) {
                throw new ExceptieZiNelucratoare("Ziua " + zi + " este nelucratoare pentru " + nume);
            } else {
                System.out.println(nume + " lucreaza in ziua " + zi);
            }
        } else {
            System.out.println("Ziua " + zi + " nu este o zi a saptamanii valida.");
        }
    }

    private int getDayIndex(String zi) {
        switch (zi) {
            case "Luni":
                return 1;
            case "Marti":
                return 2;
            case "Miercuri":
                return 3;
            case "Joi":
                return 4;
            case "Vineri":
                return 5;
            case "Sambata":
                return 6;
            case "Duminica":
                return 7;
            default:
                return -1;
        }
    }
}
