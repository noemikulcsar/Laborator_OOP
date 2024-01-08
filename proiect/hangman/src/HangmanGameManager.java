import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class HangmanGameManager {
    private static final int MaxIncercariUsor = 4;
    private static final int MaxIncercariMediu = 6;
    private static final int MaxIncercariGreu = 9;
    private String level;
    private final HangmanWordGenerator wordGenerator = new HangmanWordGenerator();
    private HangmanWord currentWord = new HangmanWord("example");
    private final Set<Character> litereIntroduse = new HashSet<>();
    private final Set<Character> litereGresite = new HashSet<>();
    private final Set<Character> litereNerevelate= new HashSet<>();
    private int incercariRamase;

    public HangmanGameManager() {
    }
    public void startNewGame(String level) {
        this.level = level;
        wordGenerator.setCuvantDeGhicit(level);
        currentWord = new HangmanWord(wordGenerator.getCuvantDeGhicit());
        litereIntroduse.clear();
        litereGresite.clear();
        incercariRamase = getMaxIncercari(level);
        litereNerevelate.clear();
        for (char c : currentWord.getFullWord().toCharArray()) {
            if (!Character.isLetter(c)) {
                continue;
            }
            char uppercaseLetter = Character.toUpperCase(c);
            litereNerevelate.add(uppercaseLetter);
        }
    }
    public int getMaxIncercari(String level) {
        if (level.equals("Usor"))
            return MaxIncercariUsor;
        else if (level.equals("Mediu"))
            return MaxIncercariMediu;
        else
            return MaxIncercariGreu;
    }
    public int getIncercariRamase() {
        return incercariRamase;
    }
    public void ghicesteLitera(char litera) {
        litereIntroduse.add(litera);
        if (currentWord.containsLetter(litera)) {
            currentWord.updateDisplay(litera);
        } else {
            incercariRamase--;
            litereGresite.add(litera);
        }
        litereNerevelate.remove(litera);
    }
    public String getLitereIntroduse() {
        return litereIntroduse.toString();
    }
    public String getLitereGresite() {
        return litereGresite.toString();
    }
    public HangmanWord getCurrentWord() {
        return currentWord;
    }
    public void updateGame(String userInput) {
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char guessedLetter = Character.toUpperCase(userInput.charAt(0));
            ghicesteLitera(guessedLetter);
            if (currentWord.isWordGuessed()) {
                System.out.println("Felicitari! Ai castigat!");
            } else if (incercariRamase == 0) {
                System.out.println("Ai pierdut! Cuvantul era: " + currentWord.getCuvant());
            }
        }
    }
    public char getHint() {
        char hintLetter = litereNerevelate.iterator().next();
        litereNerevelate.remove(hintLetter);
        return hintLetter;
    }
}
