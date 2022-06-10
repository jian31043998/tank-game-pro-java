package tankgamefiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Charles Zeng
 * @version 1.0
 */
public class GamePanel extends JPanel implements KeyListener {

    MyTank myTank = new MyTank(80, 60, 8);
//    EnemyTank enemyTank01 = new EnemyTank(200, 60, 8);

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        g.setColor(Color.black);
        g.fillRect(0, 0, 1920, 1080);
        drawTank(g, myTank);


    }

    /**
     * @param g paint
     * @param t tank obj
     */
    public void drawTank(Graphics g, Tanks t) {

        switch (t.getCampProfile()) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
            default:
                break;

        }

        switch (t.getDirection()) {
            // straight 8
            case 8:
                //The first rect of tank foot
                g.fill3DRect(t.getAxisX(), t.getAxisY(), 10, 60, false);

                //Second rect of tank foot
                g.fill3DRect(t.getAxisX() + 30, t.getAxisY(), 10, 60, false);

                // tank body
                g.fill3DRect(t.getAxisX() + 10, t.getAxisY() + 10, 20, 40, false);

                //tank head
                g.fillOval(t.getAxisX() + 10, t.getAxisY() + 20, 20, 20);

                //tank barrel
                g.drawLine(t.getAxisX() + 20,t.getAxisY(),t.getAxisX()+20,t.getAxisY()+30);
                break;
            // right: 6
            case 6:
                //The first rect of tank foot
                g.fill3DRect(t.getAxisX() - 10, t.getAxisY() + 10, 60, 10, false);

                //Second rect of tank foot
                g.fill3DRect(t.getAxisX() - 10, t.getAxisY() + 40, 60, 10, false);

                // tank body
                g.fill3DRect(t.getAxisX(), t.getAxisY() + 20, 40, 20, false);

                //tank head
                g.fillOval(t.getAxisX() + 10, t.getAxisY() + 20, 20, 20);

                //tank barrel
                g.drawLine(t.getAxisX() + 20 +30,t.getAxisY()+30,t.getAxisX()+20,t.getAxisY()+30);
                break;

            //4: left
            case 4:
                //The first rect of tank foot
                g.fill3DRect(t.getAxisX() - 10, t.getAxisY() + 10, 60, 10, false);

                //Second rect of tank foot
                g.fill3DRect(t.getAxisX() - 10, t.getAxisY() + 40, 60, 10, false);

                // tank body
                g.fill3DRect(t.getAxisX(), t.getAxisY() + 20, 40, 20, false);

                //tank head
                g.fillOval(t.getAxisX() + 10, t.getAxisY() + 20, 20, 20);

                //tank barrel
                g.drawLine(t.getAxisX()-10,t.getAxisY()+30,t.getAxisX()+20,t.getAxisY()+30);
                break;

            case 2:
                //The first rect of tank foot
                g.fill3DRect(t.getAxisX(), t.getAxisY(), 10, 60, false);

                //Second rect of tank foot
                g.fill3DRect(t.getAxisX() + 30, t.getAxisY(), 10, 60, false);

                // tank body
                g.fill3DRect(t.getAxisX() + 10, t.getAxisY() + 10, 20, 40, false);

                //tank head
                g.fillOval(t.getAxisX() + 10, t.getAxisY() + 20, 20, 20);

                //tank barrel
                g.drawLine(t.getAxisX() + 20,t.getAxisY()+60,t.getAxisX()+20,t.getAxisY()+30);
                break;


            default:
                System.out.println(" ");
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirection(8);
            myTank.moveUp();

        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirection(2);
            myTank.moveDown();

        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirection(4);
            myTank.moveLeft();

        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirection(6);
            myTank.moveRight();

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


