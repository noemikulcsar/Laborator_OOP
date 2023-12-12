import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel {
    public static void main() {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        // Top panel with "titlu" at the top center
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titlu = new JLabel("1 EURO = 4.97543");
        topPanel.add(titlu);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Center panel with two JList components in JScrollPane
        JPanel centerPanel = new JPanel(new FlowLayout());

        String[] currencyOptions = {"RON - Leul Romanesc", "EUR - Euro", "USD - Dolarul USA", "XAU - Gramul de aur", "AUD - Dolarul australian",
                "CAD - Dolarul canadian"};

        JList<String> list1 = new JList<>(currencyOptions);
        JList<String> list2 = new JList<>(currencyOptions);

        JScrollPane scrollPane1 = new JScrollPane(list1);
        JScrollPane scrollPane2 = new JScrollPane(list2);

        centerPanel.add(scrollPane1);
        centerPanel.add(scrollPane2);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Bottom panel with rows of components
        JPanel bottomPanel = new JPanel(new GridLayout(3, 3));
        JTextField tf1=new JTextField("0");
        JTextField tf2=new JTextField("0");
        bottomPanel.add(new JLabel("Suma:"));
        bottomPanel.add(tf1);
        JLabel l1=new JLabel("Moneda1");
        bottomPanel.add(l1);

        bottomPanel.add(new JLabel("Rezultat:"));
        bottomPanel.add(tf2);
        JLabel l2=new JLabel("Moneda2");
        bottomPanel.add(l2);

        JButton button = new JButton("Calculare");
        bottomPanel.add(new JPanel()); // Empty cell
        bottomPanel.add(button);
        bottomPanel.add(new JPanel()); // Empty cell

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                //fa ceva cand se apasa butonul, de exemplu
                String alege1=list1.getSelectedValue();
                String alege2=list2.getSelectedValue();
                l1.setText(alege1);
                l2.setText(alege2);
                double val=1;
                double rez=1;
                //convertim prima alegere la euro, dupa care la a doua
                if(alege1.equals("RON - Leul Romanesc"))
                {
                    val=0.2;
                }
                else if(alege1.equals("EUR - Euro"))
                {
                    val=1;
                }
                else if(alege1.equals("USD - Dolarul USA"))
                {
                    val=0.93;
                }
                else if(alege1.equals("XAU - Gramul de aur"))
                {
                    val=58.95;
                }
                else if(alege1.equals("AUD - Dolarul australian"))
                {
                    val=0.61;
                }
                else if(alege1.equals("CAD - Dolarul canadian"))
                {
                    val=0.68;
                }

                if(alege2.equals("RON - Leul Romanesc"))
                {
                    rez=val*4.97;
                }
                else if(alege2.equals("EUR - Euro"))
                {
                    rez=val;
                }
                else if(alege2.equals("USD - Dolarul USA"))
                {
                    rez=val*1.08;
                }
                else if(alege2.equals("XAU - Gramul de aur"))
                {
                    rez=val*0.016;
                }
                else if(alege2.equals("AUD - Dolarul australian"))
                {
                    rez=val*1.65;
                }
                else if(alege2.equals("CAD - Dolarul canadian"))
                {
                    rez=val*1.47;
                }
                double bani= Double.parseDouble(tf1.getText());
                bani*=rez;
                tf2.setText(String.valueOf(bani));
            }
        }
        ButtonListener obiectAscultator=new ButtonListener();
        button.addActionListener(obiectAscultator);

    }
}