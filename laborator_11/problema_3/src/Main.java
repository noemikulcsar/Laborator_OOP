import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TimerEx extends JPanel implements ActionListener{
    JLabel l;
    Timer t;
    int x = 10;
    int y = 300;

    TimerEx(){
        ImageIcon img = new ImageIcon("Mario.gif");
        l = new JLabel(img);
        l.setLocation(x, y);
        this.add(l);
        setBackground(Color.white);
        t = new Timer(100, this);
        t.start();
    }
    public void actionPerformed(ActionEvent e){
        x+=20;
        if (x>800) x = 50;
        l.setLocation(x,y);
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        TimerEx pane= new TimerEx();
        frame.setContentPane(pane);
        frame.setVisible(true);
    }
}