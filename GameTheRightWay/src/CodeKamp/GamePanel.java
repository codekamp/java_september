package CodeKamp;

import CodeKamp.States.MenuState;
import CodeKamp.States.State;
import com.sun.javafx.iio.ImageStorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created by cerebro on 19/10/16.
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {

    public static State currentState;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 450));
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(this);

        Resources.load();

        GamePanel.currentState = new MenuState();

        Thread thread = new Thread(this);
        thread.setName("game");
        thread.start();
    }

    public void run() {

        BufferedImage bigImage = new BufferedImage(800, 450, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            GamePanel.currentState.update();

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGraphics = bigImage.getGraphics();
            imageGraphics.clearRect(0,0,800,450);
            GamePanel.currentState.render(imageGraphics);
            imageGraphics.dispose();
            panelGraphics.drawImage(bigImage, 0,0,null);
            panelGraphics.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {

        GamePanel.currentState.onKeyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
}
