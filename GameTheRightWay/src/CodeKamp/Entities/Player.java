package CodeKamp.Entities;

import CodeKamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 20/10/16.
 */
public class Player extends Entity {

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public Image getImage() {
        return Resources.player1Image;
    }

    @Override
    protected int getWidth() {
        return 50;
    }

    @Override
    protected int getHeight() {
        return 90;
    }
}
