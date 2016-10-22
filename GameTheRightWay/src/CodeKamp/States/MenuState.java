package CodeKamp.States;

import CodeKamp.GamePanel;
import CodeKamp.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 19/10/16.
 */
public class MenuState extends State {

    private int selection = 0;

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Resources.welcomeImage, 0, 0, null);

        int selectorYCord;
        if(selection == 0) {
            selectorYCord = 241;
        } else {
            selectorYCord = 291;
        }

        graphics.drawImage(Resources.selectorImage, 335, selectorYCord, null);
    }

    @Override
    public void onKeyPressed(int keyCode) {

        if(keyCode == KeyEvent.VK_SPACE) {
            if(this.selection == 0) {
                GamePanel.currentState = new Stage1State();
            } else {
                System.exit(0);
            }
        } else if (keyCode == KeyEvent.VK_UP) {
            this.selection = 0;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            this.selection = 1;
        }
    }
}
