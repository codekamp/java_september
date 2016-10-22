package CodeKamp.Entities;

import java.awt.*;

/**
 * Created by cerebro on 20/10/16.
 */
abstract public class Entity {

    public int x;
    public int y;
    public int xVel;
    public int yVel;
    public int xAcc;
    public int yAcc;
    public boolean isHidden;

    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        this.xAcc = 0;
        this.yAcc = 0;
        this.xVel = 0;
        this.yVel = 0;
        this.isHidden = false;
    }

    public void update() {
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        this.x += this.xVel;
        this.y += this.yVel;
    }

    abstract public Image getImage();

    public boolean isCollidingWith(Entity otherEntity) {
        if(this.isHidden || otherEntity.isHidden) {
            return false;
        }

        return this.getRect().intersects(otherEntity.getRect());
    }

    abstract protected int getWidth();
    abstract protected int getHeight();

    protected Rectangle getRect() {
        return new Rectangle(this.x, this.y, this.getWidth(), this.getHeight());
    }
}
