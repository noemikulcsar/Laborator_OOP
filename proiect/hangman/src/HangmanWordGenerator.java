import java.util.*;

public class HangmanWordGenerator {
    private String level;
    private String cuvantDeGhicit;
    private List<String> usor;
    private List<String> mediu;
    private List<String> greu;

    public HangmanWordGenerator() {
        this.usor = new ArrayList<>(List.of("carte", "frate", "soare", "lumea", "inima", "munte", "frunte", "dulap", "ochii", "cinema", "scrie", "verde", "picior", "noroc", "cinci"));
        this.mediu = new ArrayList<>(List.of("alergare", "coloana", "frumusete", "intalnire", "sarutare", "iluminator", "dansator", "bucurie", "mangaiere", "curiozitate", "intrebare", "autobus", "aventura", "calator", "scrisoare"));
        this.greu = new ArrayList<>(List.of("neintelegator", "recunoastere", "comunicativ", "extraordinar", "neinsemnata", "impresionant", "arhitectura", "responsabilitate", "satisfacator", "experimentat", "inconfundabil", "dezorientare", "instrumentist", "impresionism"));
    }

    public String getCuvantDeGhicit() {
        return cuvantDeGhicit;
    }

    public void setCuvantDeGhicit(String level) {
        Random random = new Random();
        int index = random.nextInt(15);
        if (level.equals("Usor"))
            this.cuvantDeGhicit = usor.get(index);
        else if (level.equals("Mediu"))
            this.cuvantDeGhicit = mediu.get(index);
        else if (level.equals("Greu"))
            this.cuvantDeGhicit = greu.get(index);
    }
}
