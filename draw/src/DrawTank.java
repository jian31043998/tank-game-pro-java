import javax.swing.*;
import java.awt.*;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class DrawTank extends JFrame{
    public static void main(String[] args) {
        new DrawTank();

    }

    public DrawTank() throws HeadlessException {
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class GamePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);



        //The first rect of tank foot
        g.setColor(Color.black);
        g.drawRect(80,60,10,60);
        g.setColor(Color.cyan);
        g.fillRect(80,60,10,60);




        //Second rect of tank foot
        g.setColor(Color.black);
        g.drawRect(110,60,10,60);
        g.setColor(Color.cyan);
        g.fillRect(110,60,10,60);

        // tank body
        g.setColor(Color.black);
        g.draw3DRect(90,70,20,40,true);
        g.setColor(Color.cyan);
        g.fill3DRect(90,70,20,40,true);

        //tank head
        g.setColor(Color.RED);
        g.drawOval(90,80,20,20);
        g.setColor(Color.cyan);
        g.fillOval(90,80,20,20);

        g.setColor(Color.black);
        g.drawRect(99,60,2,30);
        g.setColor(Color.cyan);
        g.fillRect(99,60,2,30);


    }
}