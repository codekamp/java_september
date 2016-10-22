package CodeKamp.States;

import CodeKamp.Entities.Block;
import CodeKamp.GamePanel;

import java.awt.*;

/**
 * Created by cerebro on 22/10/16.
 */
public class Stage2State extends State {

    public Stage2State() {
        Block block1 = new Block(10);
        block1.xVel = -30;
        this.entities.add(block1);
        State.blockPassedCount = 0;
    }

    @Override
    public void update() {
        super.update();

        if(State.blockPassedCount >= 5) {
            GamePanel.currentState = new GameOverState();
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0,0, GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT);
        super.render(graphics);
    }

    @Override
    public void onKeyPressed(int keyCode) {

    }
}
