import javax.swing.*;
import java.awt.*;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class DrawTankTest extends JFrame{
    public static void main(String[] args) {
        new DrawTankTest();

    }

    public DrawTankTest() throws HeadlessException {
        GamePanelTest gamePanel = new GamePanelTest();
        this.add(gamePanel);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class GamePanelTest extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);



        //The first rect of tank foot
//        g.setColor(Color.black);
//        g.drawRect(80,60,10,60);
        g.setColor(Color.cyan);
        g.fill3DRect(80,60,10,60,false);




        //Second rect of tank foot
//        g.setColor(Color.black);
//        g.draw3DRect(110,60,10,60);
//        g.setColor(Color.cyan);
        g.fill3DRect(110,60,10,60,false);

        // tank body
//        g.setColor(Color.black);
//        g.draw3DRect(90,70,20,40,true);
//        g.setColor(Color.cyan);
        g.fill3DRect(90,70,20,40,false);

        //tank head
//        g.setColor(Color.RED);
//        g.drawOval(90,80,20,20);
        g.setColor(Color.cyan);
        g.fillOval(90,80,20,20);
//
//        g.setColor(Color.black);
//        g.drawRect(99,60,2,30);
//        g.setColor(Color.cyan);
        g.fill3DRect(99,60,2,30,false);


    }
}