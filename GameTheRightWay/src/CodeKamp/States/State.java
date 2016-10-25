package CodeKamp.States;

import CodeKamp.Entities.Entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 19/10/16.
 */
abstract public class State {

    public static int blockPassedCount = 0;

    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity entity : this.entities) {
            entity.update();
        }
    }

    public void render(Graphics graphics) {
        for (Entity entity : this.entities) {
            if (!entity.isHidden) {
                graphics.drawImage(entity.getImage(), entity.x, entity.y, null);
            }
        }
    }

    abstract public void onKeyPressed(int keyCode);
}
