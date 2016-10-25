package CodeKamp.States;

import CodeKamp.Entities.Block;
import CodeKamp.Entities.Player;
import CodeKamp.GamePanel;
import CodeKamp.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by cerebro on 19/10/16.
 */
public class Stage1State extends State {

    private java.util.List<Block> blocks = new ArrayList<>();
    private Player player;

    private static final int PLAYER_GROUND_LEVEL = 315;


    public Stage1State() {
        super();

        this.player = new Player(400, PLAYER_GROUND_LEVEL);

        this.blocks.add(new Block(700));
        this.blocks.add(new Block(900));
        this.blocks.add(new Block(1100));
        this.blocks.add(new Block(1300));
        this.blocks.add(new Block(1500));

        this.entities.addAll(this.blocks);
        this.entities.add(this.player);
        State.blockPassedCount = 0;
    }

    @Override
    public void update() {
        super.update();

        for (Block block: this.blocks) {
            if(this.player.isCollidingWith(block)) {
                Resources.hit.play();
                block.isHidden = true;
                this.player.x -= 100;
            }
        }

        if(this.player.y >= PLAYER_GROUND_LEVEL) {
            this.player.land(PLAYER_GROUND_LEVEL);
        }

        if(this.player.x <= 0) {
            GamePanel.currentState = new GameOverState();
        } else if (State.blockPassedCount >= 5) {
            GamePanel.currentState = new Stage2State();
        }

    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Resources.backgroundColor);
        graphics.fillRect(0,0, GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT);
        graphics.drawImage(Resources.grassImage, 0, 405, null);

        super.render(graphics);
    }

    @Override
    public void onKeyPressed(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE && this.player.y == PLAYER_GROUND_LEVEL) {
            this.player.jump();
        } else if(keyCode == KeyEvent.VK_DOWN && this.player.y == PLAYER_GROUND_LEVEL) {
            this.player.duck();
        }
    }
}
