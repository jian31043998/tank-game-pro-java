import javax.swing.*;
import java.awt.*;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class DrawCircle extends JFrame {

    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(0, 0, 100, 100);
    }
}