import javax.swing.*;
import java.awt.*;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class DrawCircleTest extends JFrame {

    public static void main(String[] args) {
        new DrawCircleTest();
    }

    //Create the frame constructor
    public DrawCircleTest() {
        //Initial the panel
        MyPanelTest mp = new MyPanelTest();
        //add the panel in the frame
        this.add(mp);
        this.setSize(800, 600);
        //close this the click x
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

class MyPanelTest extends JPanel {
    //First open the panel or min or max the screen or repaint or change size
    @Override
    public void paint(Graphics g) {
        // initial the father class
        super.paint(g);
        // draw a circle
        g.setColor(Color.GREEN);


    }
}