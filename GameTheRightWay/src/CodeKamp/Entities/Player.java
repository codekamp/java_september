package CodeKamp.Entities;

import CodeKamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 20/10/16.
 */
public class Player extends Entity {

    private boolean isOnGround;
    private boolean isDucked;
    private int duckTime;

    private int imageIndex;

    public Player(int x, int y) {
        super(x, y);
        this.imageIndex = 0;
        this.isOnGround = true;
    }

    @Override
    public Image getImage() {

        if(this.isDucked) {
            return Resources.playerDuckImage;
        }

        if(!this.isOnGround) {
            return Resources.playerJumpImage;
        }
        return Resources.playerImages.get(imageIndex);
    }

    @Override
    protected int getWidth() {
        return 50;
    }

    @Override
    protected int getHeight() {
        if(this.isDucked) {
            return 65;
        }
        return 90;
    }

    @Override
    public void update() {
        super.update();

        this.imageIndex++;
        this.imageIndex %= Resources.playerImages.size();

        if(this.isDucked) {
            this.duckTime++;

            if(this.duckTime >= 30) {
                this.isDucked = false;
            }
        }
    }

    public void jump(int jumpVel, int jumpAcc) {
        this.yVel = jumpVel;
        this.yAcc = jumpAcc;
        Resources.jump.play();
        this.isOnGround = false;
        this.isDucked = false;
    }

    public void jump() {
        this.jump(-25, 2);
    }

    public void land(int yCord) {
        this.yAcc = 0;
        this.yVel = 0;
        this.y = yCord;
        this.isOnGround = true;
    }

    public void duck() {
        if(!this.isDucked && this.isOnGround) {
            this.isDucked = true;
            this.duckTime = 0;
        }
    }

    @Override
    protected Rectangle getRect() {

        Rectangle rectangle = super.getRect();
        if (this.isDucked) {
            rectangle.y += 25;
        }

        return rectangle;
    }
}
