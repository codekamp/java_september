package CodeKamp.States;

import java.awt.*;

/**
 * Created by cerebro on 19/10/16.
 */
abstract public class State {

    abstract public void update();
    abstract public void render(Graphics graphics);

    abstract public void onKeyPressed(int keyCode);
}
