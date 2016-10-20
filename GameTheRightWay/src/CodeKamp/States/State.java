package CodeKamp.States;

import CodeKamp.Entities.Entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 19/10/16.
 */
abstract public class State {

    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for(Entity entity: this.entities) {
            entity.update();
        }
    }

    abstract public void render(Graphics graphics);

    abstract public void onKeyPressed(int keyCode);
}
