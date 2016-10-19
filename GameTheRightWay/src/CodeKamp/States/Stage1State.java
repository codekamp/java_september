package CodeKamp.States;

import CodeKamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 19/10/16.
 */
public class Stage1State extends State {
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.fillRect(0,0,800,450);
        graphics.drawImage(Resources.grassImage, 0, 405, null);
    }

    @Override
    public void onKeyPressed(int keyCode) {

    }
}
