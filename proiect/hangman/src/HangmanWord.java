import java.util.HashSet;
import java.util.Set;

public class HangmanWord {
    private String cuvant;
    private Set<Character> litereIntroduse;
    public HangmanWord(String cuvant) {
        this.cuvant = cuvant.toUpperCase();
        this.litereIntroduse = new HashSet<>();
    }
    public Set<Character> getLitereIntroduse() {
        return litereIntroduse;
    }
    public boolean containsLetter(char letter) {
        char uppercaseLetter = Character.toUpperCase(letter);
        return cuvant.indexOf(uppercaseLetter) != -1;
    }
    public void updateDisplay(char letter) {
        litereIntroduse.add(Character.toUpperCase(letter));
    }
    public boolean isWordGuessed() {
        for (char c : cuvant.toCharArray()) {
            if (!litereIntroduse.contains(Character.toUpperCase(c))) {
                return false;
            }
        }
        return true;
    }
    public String getCuvant() {
        return cuvant;
    }
    public String getWordDisplay() {
        StringBuilder display = new StringBuilder();
        for (char c : cuvant.toCharArray()) {
            if (litereIntroduse.contains(Character.toUpperCase(c))) {
                display.append(c).append(' ');
            } else {
                display.append("_ ").append(' ');
            }
        }
        return display.toString();
    }
    public String getFullWord() {
        StringBuilder fullWord = new StringBuilder();
        for (char c : cuvant.toCharArray()) {
            fullWord.append(c);
        }
        return fullWord.toString();
    }
    public void revealLetter(char letter) {
        litereIntroduse.add(Character.toUpperCase(letter));
    }
}
