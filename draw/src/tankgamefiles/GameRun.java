package tankgamefiles;

import javax.swing.*;
import java.awt.*;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class GameRun extends JFrame {

    public static void main(String[] args) {
        new GameRun();
    }
    public GameRun() throws HeadlessException {
        this.setSize(1920,1080);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);
        this.addKeyListener(gamePanel);


    }
}
