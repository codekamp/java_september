package CodeKamp;

import CodeKamp.States.MenuState;
import CodeKamp.States.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        thread.setName("infinite loop thread");
        thread.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            GamePanel.currentState.update();

            Graphics panelGraphics = this.getGraphics();
            GamePanel.currentState.render(panelGraphics);
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
