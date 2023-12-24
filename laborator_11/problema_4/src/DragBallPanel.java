import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {

    private static final int BALL_DIAMETER = 40;
    private int _ballX = 50;
    private int _ballY = 50;
    private int _dragFromX = 0;
    private int _dragFromY = 0;
    private boolean _canDrag = false;
    private boolean _wasOutside = false;
    private boolean _autoMove = false;
    private int _autoMoveDirectionX = 1;
    private int _autoMoveDirectionY = 1;

    public DragBallPanel() {
        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.blue);
        setForeground(Color.yellow);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        // Add a timer for automatic ball movement
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (_autoMove) {
                    moveBallAutomatically();
                    repaint();
                }
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
        g.drawString("x=" + _ballX + "  y=" + _ballY, 10, 20);
    }
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (e.getButton() == MouseEvent.BUTTON1) {
            if (Math.pow(x - (_ballX + BALL_DIAMETER / 2), 2) + Math.pow(y - (_ballY + BALL_DIAMETER / 2), 2) <= Math.pow(BALL_DIAMETER / 2, 2)) {
                _canDrag = true;
                _dragFromX = x - _ballX;
                _dragFromY = y - _ballY;
            } else {
                _canDrag = false;
            }
        }
        else if (e.getButton() == MouseEvent.BUTTON3) {
        // On right mouse click, generate a random color for the ball
        setColor(getRandomColor());
        repaint();
    }
    }
    private Color getRandomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    private void setColor(Color color) {
        this.setForeground(color);
    }
    public void mouseDragged(MouseEvent e) {
        if (_canDrag) {
            _ballX = e.getX() - _dragFromX;
            _ballY = e.getY() - _dragFromY;
            limitBallPosition();
            repaint();
        }
    }

    public void mouseExited(MouseEvent e) {
        _wasOutside = true;
    }

    public void mouseEntered(MouseEvent e) {
        if (_wasOutside) {
            int x = e.getX();
            int y = e.getY();
            _ballX = x;
            _ballY = y;
            _wasOutside = false;
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            // Toggle the state of automatic movement
            _autoMove = !_autoMove;
        }
    }

    public void mouseReleased(MouseEvent e) {
        _canDrag = false;
    }

    private void moveBallAutomatically() {
        _ballX += _autoMoveDirectionX;
        _ballY += _autoMoveDirectionY;
        limitBallPosition();

        // Change direction when the ball hits the panel boundaries
        if (_ballX <= 0 || _ballX >= getWidth() - BALL_DIAMETER) {
            _autoMoveDirectionX *= -1;
        }
        if (_ballY <= 0 || _ballY >= getHeight() - BALL_DIAMETER) {
            _autoMoveDirectionY *= -1;
        }
    }

    private void limitBallPosition() {
        _ballX = Math.max(_ballX, 0);
        _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
        _ballY = Math.max(_ballY, 0);
        _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);
    }
    public void mouseMoved(MouseEvent e) {
        // Ignore these events
    }
}
