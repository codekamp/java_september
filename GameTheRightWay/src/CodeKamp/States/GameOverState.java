package CodeKamp.States;

import CodeKamp.GamePanel;

import java.awt.*;

/**
 * Created by cerebro on 22/10/16.
 */
public class GameOverState extends State {


    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillRect(0,0, GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT);
        graphics.setColor(Color.green);
        graphics.drawString("Game Over. Press any key to restart", 0, 200);
    }

    @Override
    public void onKeyPressed(int keyCode) {
        GamePanel.currentState = new Stage1State();
    }
}
