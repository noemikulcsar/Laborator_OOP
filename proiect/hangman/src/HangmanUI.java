import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.Set;
import java.util.HashSet;

public class HangmanUI {
    private HangmanGameManager gameManager = new HangmanGameManager();
    private int modJoc;
    private boolean win = false;
    private boolean lose = false;
    private String level;
    private HangmanWord currentWord;
    private Set<Character> litereIntroduse = new HashSet<>();

    private JLabel guessedLettersLabel;
    private JLabel wrongLettersLabel;
    private JLabel attemptsRemainingLabel;
    private JLabel lastChanceLabel;
    private JLabel wordProgressLabel;
    private JLabel resultLabel;
    private JButton restartButton;
    private JButton hintButton;
    JTextField userInputField = new JTextField();
    private ImageIcon img0 = new ImageIcon("img0.jpg");
    private ImageIcon img1 = new ImageIcon("img1.jpg");
    private ImageIcon img2 = new ImageIcon("img2.jpg");
    private ImageIcon img3 = new ImageIcon("img3.jpg");
    private ImageIcon img4 = new ImageIcon("img4.jpg");
    private ImageIcon img5 = new ImageIcon("img5.jpg");
    private ImageIcon img6 = new ImageIcon("img6.jpg");
    private ImageIcon img7 = new ImageIcon("img7.jpg");
    private ImageIcon img8 = new ImageIcon("img8.jpg");
    private ImageIcon img9 = new ImageIcon("img9.jpg");

    private JLabel imagine = new JLabel(img0);

    public void setGameManager(HangmanGameManager gameManager) {
        this.gameManager = gameManager;
    }

    public Set<Character> getLitereIntroduse() {
        return currentWord.getLitereIntroduse();
    }
    private int numarHinturi;

    public HangmanUI() {
        modJoc = 1;
        numarHinturi = 2;
        int x, y;
        Color fontColor = new Color(139, 69, 19);
        Color backgroundColor = new Color(255, 240, 219);
        Color buttonColor = new Color(250, 240, 230);

        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.getContentPane().setBackground(backgroundColor);
        frame.setLayout(null);
        Dimension frameSize = frame.getSize();

        imagine.setBounds(400,100,img0.getIconWidth(),img0.getIconHeight());
        frame.add(imagine);
        imagine.setVisible(false);

        JLabel titlu = createLabel("Hangman", "Arial", Font.ITALIC, 30, fontColor);
        x = (frameSize.width - titlu.getPreferredSize().width) / 2;
        y = 20;
        titlu.setBounds(x, y, titlu.getPreferredSize().width, titlu.getPreferredSize().height);

        JLabel mesajStart = new JLabel("Alegeti nivelul de dificultate:");
        mesajStart.setFont(new Font("Arial", Font.ITALIC, 25));
        mesajStart.setForeground(fontColor);
        x = (frameSize.width - mesajStart.getPreferredSize().width) / 2;
        y = 100;
        mesajStart.setBounds(x, y, mesajStart.getPreferredSize().width, mesajStart.getPreferredSize().height);

        JButton usor = createButton("Usor", "Arial", Font.PLAIN, 15, fontColor, buttonColor);
        JButton mediu = createButton("Mediu", "Arial", Font.PLAIN, 15, fontColor, buttonColor);
        JButton greu = createButton("Greu", "Arial", Font.PLAIN, 15, fontColor, buttonColor);

        int buttonWidth = 100;
        int buttonHeight = 30;
        int gap = 20;
        usor.setBounds((frame.getWidth() - 3 * buttonWidth - 2 * gap) / 2, 300, buttonWidth, buttonHeight);
        mediu.setBounds(usor.getX() + buttonWidth + gap, 300, buttonWidth, buttonHeight);
        greu.setBounds(mediu.getX() + buttonWidth + gap, 300, buttonWidth, buttonHeight);

        frame.add(titlu);
        frame.add(mesajStart);
        frame.add(usor);
        frame.add(mediu);
        frame.add(greu);
        frame.add(imagine);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        class ButtonListener implements ActionListener {
            private String difficulty;
            public ButtonListener(String difficulty) {
                this.difficulty = difficulty;
            }
            public void actionPerformed(ActionEvent e) {
                mesajStart.setVisible(false);
                usor.setVisible(false);
                mediu.setVisible(false);
                greu.setVisible(false);
                level = difficulty;
                modJoc = 2;
                gameManager.startNewGame(level);
                updateUI(frame);
            }
        }
        usor.addActionListener(new ButtonListener("Usor"));
        mediu.addActionListener(new ButtonListener("Mediu"));
        greu.addActionListener(new ButtonListener("Greu"));
    }

    private void updateUI(JFrame frame) {
        if (modJoc == 2) {
            int x,y;
            Color fontColor = new Color(139, 69, 19);
            Color backgroundColor = new Color(255, 240, 219);
            Color buttonColor = new Color(250, 240, 230);

            imagine.setVisible(true);
            userInputField.setVisible(true);
            userInputField.requestFocus();

            hintButton = createButton("Hint", "Arial", Font.PLAIN, 15, fontColor, backgroundColor);
            int hintX = (frame.getWidth() - 100) / 2 - 150;
            int hintY = 620;
            hintButton.setBounds(hintX, hintY, 100, 30);

            attemptsRemainingLabel = new JLabel("Incercari ramase: " + gameManager.getMaxIncercari(level));
            attemptsRemainingLabel.setFont(new Font("Arial", Font.PLAIN, 25));
            attemptsRemainingLabel.setForeground(fontColor);
            Dimension frameSize = frame.getSize();
            x = (frameSize.width - attemptsRemainingLabel.getPreferredSize().width) / 2;
            y = 60;
            attemptsRemainingLabel.setBounds(x, y, attemptsRemainingLabel.getPreferredSize().width, attemptsRemainingLabel.getPreferredSize().height);

            guessedLettersLabel = new JLabel("Litere introduse: " + gameManager.getLitereIntroduse());
            guessedLettersLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            guessedLettersLabel.setForeground(fontColor);
            int guessedLettersWidth = guessedLettersLabel.getPreferredSize().width;
            int guessedLettersHeight = guessedLettersLabel.getPreferredSize().height;
            x = (frame.getWidth() - guessedLettersWidth) / 4;
            y = 500;
            guessedLettersLabel.setBounds(x, y, guessedLettersWidth, guessedLettersHeight);

            wrongLettersLabel = new JLabel("Litere gresite: " + gameManager.getLitereGresite());
            wrongLettersLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            wrongLettersLabel.setForeground(fontColor);
            int wrongLettersWidth = wrongLettersLabel.getPreferredSize().width;
            int wrongLettersHeight = wrongLettersLabel.getPreferredSize().height;
            x = 3 * (frame.getWidth() - wrongLettersWidth) / 4;
            y = 500;
            wrongLettersLabel.setBounds(x, y, wrongLettersWidth, wrongLettersHeight);

            x = (frame.getWidth() - 100) / 2 + 30;
            y = 550;
            userInputField.setFont(new Font("Arial", Font.PLAIN, 20));
            userInputField.setBounds(x, y, 30, 30);

            lastChanceLabel = new JLabel("Ultima sansa!");
            lastChanceLabel.setFont(new Font("Arial", Font.BOLD, 20));
            lastChanceLabel.setForeground(Color.RED);
            int lastChanceWidth = lastChanceLabel.getPreferredSize().width;
            int lastChanceHeight = lastChanceLabel.getPreferredSize().height;
            x = (frame.getWidth() - lastChanceWidth) / 2;
            y = 580;
            lastChanceLabel.setBounds(x, y, lastChanceWidth, lastChanceHeight);
            lastChanceLabel.setVisible(false);

            currentWord = gameManager.getCurrentWord(); // Add this line to set currentWord
            String wordProgress = getWordProgress();
            wordProgressLabel = new JLabel(currentWord.getWordDisplay());
            wordProgressLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            wordProgressLabel.setForeground(fontColor);
            int progressWidth = wordProgressLabel.getPreferredSize().width;
            int progressHeight = wordProgressLabel.getPreferredSize().height;
            x = (frame.getWidth() - progressWidth) / 2;
            y = 450;  // Adjust the vertical position as needed
            wordProgressLabel.setBounds(x, y, progressWidth, progressHeight);

            userInputField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userInput = userInputField.getText();
                    userInputField.setText("");
                    gameManager.updateGame(userInput);
                    if(level.equals("Usor"))
                    {
                        if(gameManager.getIncercariRamase() == 3)
                            imagine.setIcon(img2);
                        else if(gameManager.getIncercariRamase() == 2)
                            imagine.setIcon(img4);
                        else if(gameManager.getIncercariRamase() == 1)
                            imagine.setIcon(img7);
                        else if(gameManager.getIncercariRamase() == 0)
                            imagine.setIcon(img9);
                    }
                    else if(level.equals("Mediu"))
                    {
                        if(gameManager.getIncercariRamase() == 5)
                            imagine.setIcon(img2);
                        else if(gameManager.getIncercariRamase() == 4)
                            imagine.setIcon(img4);
                        else if(gameManager.getIncercariRamase() == 3)
                            imagine.setIcon(img5);
                        else if(gameManager.getIncercariRamase() == 2)
                            imagine.setIcon(img6);
                        else if(gameManager.getIncercariRamase() == 1)
                            imagine.setIcon(img7);
                        else if(gameManager.getIncercariRamase() == 0)
                            imagine.setIcon(img9);
                    }
                    else if(level.equals("Greu"))
                    {
                        if(gameManager.getIncercariRamase() == 8)
                            imagine.setIcon(img1);
                        else if(gameManager.getIncercariRamase() == 7)
                            imagine.setIcon(img2);
                        else if(gameManager.getIncercariRamase() == 6)
                            imagine.setIcon(img3);
                        else if(gameManager.getIncercariRamase() == 5)
                            imagine.setIcon(img4);
                        else if(gameManager.getIncercariRamase() == 4)
                            imagine.setIcon(img5);
                        else if(gameManager.getIncercariRamase() == 3)
                            imagine.setIcon(img6);
                        else if(gameManager.getIncercariRamase() == 2)
                            imagine.setIcon(img7);
                        else if(gameManager.getIncercariRamase() == 1)
                            imagine.setIcon(img8);
                        else if(gameManager.getIncercariRamase() == 0)
                            imagine.setIcon(img9);
                    }
                    userInputField.requestFocus();
                    updateLabels(frame);
                }
            });
            hintButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(numarHinturi > 0)
                    {
                        giveHint(frame);
                        userInputField.requestFocus();
                        updateLabels(frame);
                        numarHinturi --;
                    }
                    else hintButton.setVisible(false);
                }
            });

            restartButton = new JButton("Restart");
            restartButton.setFont(new Font("Arial", Font.PLAIN, 15));
            restartButton.setForeground(fontColor);
            restartButton.setBackground(backgroundColor);
            restartButton.setBorder(new LineBorder(fontColor, 3));
            int restartX = (frame.getWidth() - 100) / 2;
            int restartY = 620;
            restartButton.setBounds(restartX, restartY, 100, 30);
            restartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modJoc = 1;
                    restartButton.setVisible(false);
                    attemptsRemainingLabel.setVisible(false);
                    initializeUI(frame);
                }
            });

            frame.add(attemptsRemainingLabel);
            frame.add(guessedLettersLabel);
            frame.add(wrongLettersLabel);
            frame.add(lastChanceLabel);
            frame.add(wordProgressLabel);
            frame.add(userInputField);
            userInputField.requestFocus();
            frame.add(restartButton);
            frame.add(hintButton);
            frame.repaint();
        }
        if(modJoc == 3)
        {
            attemptsRemainingLabel.setVisible(false);
            Color fontColor = new Color(139, 69, 19);
            Color backgroundColor = new Color(255, 240, 219);

            resultLabel = new JLabel();
            resultLabel.setFont(new Font("Arial", Font.BOLD, 25));
            resultLabel.setForeground(fontColor);
            int resultWidth = resultLabel.getPreferredSize().width;
            int resultHeight = resultLabel.getPreferredSize().height;
            int resultX = (frame.getWidth() - resultWidth) / 2;
            int resultY = 150;
            resultLabel.setBounds(resultX, resultY, resultWidth, resultHeight);

            restartButton = new JButton("Restart");
            restartButton.setFont(new Font("Arial", Font.PLAIN, 15));
            restartButton.setForeground(fontColor);
            restartButton.setBackground(backgroundColor);
            restartButton.setBorder(new LineBorder(fontColor, 3));
            int restartX = (frame.getWidth() - 100) / 2;
            int restartY = 200;
            restartButton.setBounds(restartX, restartY, 100, 30);
            restartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modJoc = 1;
                    resultLabel.setVisible(false);
                    restartButton.setVisible(false);
                    updateUI(frame);
                }
            });

            if (win) {
                hintButton.setVisible(false);
                attemptsRemainingLabel.setVisible(false);
                resultLabel.setText("Ai castigat! Cuvantul era:" + currentWord.getCuvant());
                resultLabel.setForeground(Color.GREEN);
            } else if (lose) {
                hintButton.setVisible(false);
                attemptsRemainingLabel.setVisible(false);
                resultLabel.setText("Ai pierdut! Cuvantul era: " + currentWord.getCuvant());
                resultLabel.setForeground(Color.RED);
            }

            frame.add(resultLabel);
            frame.add(restartButton);

            resultLabel.setVisible(true);
            restartButton.setVisible(true);

            frame.repaint();
        }
    }
    private String getWordProgress() {
        StringBuilder progress = new StringBuilder();
        char[] wordDisplayChars = currentWord.getWordDisplay().toCharArray();
        for (char letter : wordDisplayChars) {
            progress.append(letter).append(" ");
        }
        return progress.toString().trim();
    }
    private void updateLabels(JFrame frame) {
        if (gameManager.getIncercariRamase() == 1)
            lastChanceLabel.setVisible(true);
        else
            lastChanceLabel.setVisible(false);
        if(currentWord.isWordGuessed())
        {
            attemptsRemainingLabel.setVisible(false);
            modJoc = 3;
            win = true;
            lose = false;
            lastChanceLabel.setVisible(false);
            userInputField.setVisible(false);
            showEndGameLabels(frame, "Ai castigat!:)");
        }
        if(gameManager.getIncercariRamase()==0)
        {
            attemptsRemainingLabel.setVisible(false);
            modJoc = 3;
            lose = true;
            win = false;
            lastChanceLabel.setVisible(false);
            userInputField.setVisible(false);
            showEndGameLabels(frame, "Ai pierdut!:( Cuvantul era: " + currentWord.getCuvant());
        }
        guessedLettersLabel.setText("Litere introduse: " + gameManager.getLitereIntroduse());
        wrongLettersLabel.setText("Litere gresite: " + gameManager.getLitereGresite());
        attemptsRemainingLabel.setText("Incercari ramase: " + gameManager.getIncercariRamase());
        int x, y;
        String wordDisplay = gameManager.getCurrentWord().getWordDisplay();
        wordProgressLabel.setText(wordDisplay); // Update the wordProgressLabel
        int guessedLettersWidth = guessedLettersLabel.getPreferredSize().width;
        int guessedLettersHeight = guessedLettersLabel.getPreferredSize().height;
        x = (frame.getWidth() - guessedLettersWidth) / 4;
        y = 500;
        guessedLettersLabel.setBounds(x, y, guessedLettersWidth, guessedLettersHeight);

        int wrongLettersWidth = wrongLettersLabel.getPreferredSize().width;
        int wrongLettersHeight = wrongLettersLabel.getPreferredSize().height;
        x = 3 * (frame.getWidth() - wrongLettersWidth) / 4;
        y = 500;
        wrongLettersLabel.setBounds(x, y, wrongLettersWidth, wrongLettersHeight);

        int attemptsRemainingWidth = attemptsRemainingLabel.getPreferredSize().width;
        int attemptsRemainingHeight = attemptsRemainingLabel.getPreferredSize().height;
        x = (frame.getWidth() - attemptsRemainingWidth) / 2;
        y = 60;
        attemptsRemainingLabel.setBounds(x, y, attemptsRemainingWidth, attemptsRemainingHeight);

        frame.repaint();
    }
    private void showEndGameLabels(JFrame frame, String resultMessage) {
        SwingUtilities.invokeLater(() -> {
            frame.repaint();

            modJoc = 1;
            Color fontColor = new Color(139, 69, 19);
            Color backgroundColor = new Color(255, 240, 219);
            Color buttonColor = new Color(250, 240, 230);

            int r = 0, g = 0, b = 0;
            if (win) {
                g = 255;
            } else {
                r = 255;
            }
            Color color = new Color(r, g, b);

            hintButton.setVisible(false);
            JLabel resultLabel = new JLabel(resultMessage);
            resultLabel.setFont(new Font("Arial", Font.BOLD, 25));
            resultLabel.setForeground(color);
            int resultWidth = resultLabel.getPreferredSize().width;
            int resultHeight = resultLabel.getPreferredSize().height;
            int x = (frame.getWidth() - resultWidth) / 2;
            int y = 70;
            resultLabel.setBounds(x, y, resultWidth, resultHeight);

            JButton restartButton = new JButton("Restart");
            restartButton.setFont(new Font("Arial", Font.PLAIN, 15));
            restartButton.setForeground(fontColor);
            restartButton.setBackground(buttonColor);
            restartButton.setBorder(new LineBorder(fontColor, 3));
            x = (frame.getWidth() - 100) / 2;
            y = 360;
            restartButton.setBounds(x, y, 100, 30);
            restartButton.addActionListener(e -> {
                modJoc = 1;
                win = false;
                lose = false;
                frame.getContentPane().removeAll();  // Remove all components from the frame
                initializeUI(frame);  // Re-initialize the UI
            });

            frame.add(resultLabel);
            frame.add(restartButton);
            frame.repaint();
        });
    }

    private void initializeUI(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            modJoc = 1;
            numarHinturi = 2;
            frame.getContentPane().removeAll();
            frame.repaint();

            int x, y;
            Color fontColor = new Color(139, 69, 19);
            Color backgroundColor = new Color(255, 240, 219);
            Color buttonColor = new Color(250, 240, 230);
            frame.setSize(1000, 700);
            frame.getContentPane().setBackground(backgroundColor);
            frame.setLayout(null);
            Dimension frameSize = frame.getSize();

            imagine.setIcon(img0);
            imagine.setVisible(false);
            frame.add(imagine);

            JLabel titlu = createLabel("Hangman", "Arial", Font.ITALIC, 30, fontColor);
            x = (frameSize.width - titlu.getPreferredSize().width) / 2;
            y = 20;
            titlu.setBounds(x, y, titlu.getPreferredSize().width, titlu.getPreferredSize().height);

            JLabel mesajStart = createLabel("Alegeti nivelul de dificultate:", "Arial", Font.ITALIC, 25, fontColor);
            x = (frameSize.width - mesajStart.getPreferredSize().width) / 2;
            y = 100;
            mesajStart.setBounds(x, y, mesajStart.getPreferredSize().width, mesajStart.getPreferredSize().height);

            JButton usor = createButton("Usor", "Arial", Font.PLAIN, 15, fontColor, buttonColor);
            JButton mediu = createButton("Mediu", "Arial", Font.PLAIN, 15, fontColor, buttonColor);
            JButton greu = createButton("Greu", "Arial", Font.PLAIN, 15, fontColor, buttonColor);

            int buttonWidth = 100;
            int buttonHeight = 30;
            int gap = 20;
            usor.setBounds((frame.getWidth() - 3 * buttonWidth - 2 * gap) / 2, 300, buttonWidth, buttonHeight);
            mediu.setBounds(usor.getX() + buttonWidth + gap, 300, buttonWidth, buttonHeight);
            greu.setBounds(mediu.getX() + buttonWidth + gap, 300, buttonWidth, buttonHeight);

            frame.add(titlu);
            frame.add(attemptsRemainingLabel);
            frame.add(mesajStart);
            frame.add(usor);
            frame.add(mediu);
            frame.add(greu);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            ActionListener buttonListener = e -> {
                mesajStart.setVisible(false);
                usor.setVisible(false);
                mediu.setVisible(false);
                greu.setVisible(false);
                level = ((JButton) e.getSource()).getText();
                modJoc = 2;
                gameManager.startNewGame(level);
                updateUI(frame);
            };

            usor.addActionListener(buttonListener);
            mediu.addActionListener(buttonListener);
            greu.addActionListener(buttonListener);
        });
    }
    private void giveHint(JFrame frame) {
        char hintLetter = gameManager.getHint();
        currentWord.revealLetter(hintLetter);
        updateLabels(frame);
    }
    private JLabel createLabel(String text, String fontName, int fontStyle, int fontSize, Color fontColor) {
        JLabel label = new JLabel(text);
        label.setFont(new Font(fontName, fontStyle, fontSize));
        label.setForeground(fontColor);
        return label;
    }

    private JButton createButton(String text, String fontName, int fontStyle, int fontSize, Color fontColor, Color backgroundColor) {
        JButton button = new JButton(text);
        button.setFont(new Font(fontName, fontStyle, fontSize));
        button.setForeground(fontColor);
        button.setBackground(backgroundColor);
        button.setBorder(new LineBorder(fontColor, 3));
        return button;
    }
}
