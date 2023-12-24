package mousedemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class MousePanel extends JPanel implements MouseListener, MouseMotionListener {

    private int m_lastClickedX = 0;
    private int m_lastClickedY = 0;
    private int m_lastMovedX = 0;
    private int m_lastMovedY = 0;
    private boolean isInPanel = false; // Noua variabilă pentru a verifica dacă cursorul este în panou sau nu

    public MousePanel() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(200, 200));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Last click: x=" + m_lastClickedX + ", y=" + m_lastClickedY, 10, 30);
        // Afiseaza doar daca cursorul este in interiorul panoului
        if (isInPanel) {
            g.drawString("x=" + m_lastMovedX + ", y=" + m_lastMovedY, m_lastMovedX, m_lastMovedY);
        }
    }

    public void mouseClicked(MouseEvent e) {
        m_lastClickedX = e.getX();
        m_lastClickedY = e.getY();
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {
        m_lastMovedX = e.getX();
        m_lastMovedY = e.getY();
        this.repaint();
    }

    public void mouseEntered(MouseEvent e) {
        isInPanel = true; // Cursorul a intrat in panou
    }

    public void mouseExited(MouseEvent e) {
        isInPanel = false; // Cursorul a iesit din panou
        this.repaint(); // Pentru a sterge textul cand cursorul iese din panou
    }

    // Restul metodelor mouseListener si mouseMotionListener raman neschimbate
    public void mouseDragged(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
