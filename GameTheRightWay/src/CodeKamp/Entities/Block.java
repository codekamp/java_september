package CodeKamp.Entities;

import CodeKamp.GamePanel;
import CodeKamp.Resources;
import CodeKamp.States.Stage1State;
import CodeKamp.States.State;

import java.awt.*;
import java.util.Random;

/**
 * Created by cerebro on 20/10/16.
 */
public class Block extends Entity {

    public Block(int x) {
        super(x, 0);
        this.y = this.getRandomYCord();
        this.xVel = -5;
    }

    @Override
    public Image getImage() {
        return Resources.blockImage;
    }

    @Override
    protected int getWidth() {
        return 20;
    }

    @Override
    protected int getHeight() {
        return 50;
    }

    @Override
    public void update() {
        super.update();

        if(this.x <= -20) {
            this.x = 980;
            this.y = this.getRandomYCord();

            if(!this.isHidden) {
                State.blockPassedCount++;
            }

            this.isHidden = false;
        }
    }

    private int getRandomYCord() {

        Random random = new Random();
        int randomInt = random.nextInt(2);

        if(randomInt == 0) {
            return 355;
        }

        return 275;
    }
}
