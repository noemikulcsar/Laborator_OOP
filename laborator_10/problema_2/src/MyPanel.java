import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyPanel extends JPanel {
    public static void main() {
        JFrame frame = new JFrame ("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel l = new JLabel ("Label1 ");
        JTextField tf = new JTextField("TextField1");
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);
        final int[] count = {0};
        class ButtonListener1 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                //fa ceva cand se apasa butonul, de exemplu
                ++count[0];
                tf.setText(count[0] + "");
            }
        }
        ButtonListener1 obiectAscultator1=new ButtonListener1();
        b1.addActionListener(obiectAscultator1);
        class ButtonListener2 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                //fa ceva cand se apasa butonul, de exemplu
                String s=tf.getText();
                b2.setText(s);
            }
        }
        ButtonListener2 obiectAscultator2=new ButtonListener2();
        b2.addActionListener(obiectAscultator2);
        class ButtonListener3 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                //fa ceva cand se apasa butonul, de exemplu
                Color c=new Color(255, 102, 255);
                Color d=new Color(153,0,204);
                panel1.setBackground(c);
                panel2.setBackground(d);
            }
        }
        ButtonListener3 obiectAscultator3=new ButtonListener3();
        b3.addActionListener(obiectAscultator3);
    }
}
