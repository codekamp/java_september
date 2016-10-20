package CodeKamp.States;

import CodeKamp.Entities.Block;
import CodeKamp.Entities.Entity;
import CodeKamp.Entities.Player;
import CodeKamp.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 19/10/16.
 */
public class Stage1State extends State {

    private List<Block> blocks = new ArrayList<>();
    private Player player;


    public Stage1State() {
        super();

        this.player = new Player(400, 315);

        this.blocks.add(new Block(700));
        this.blocks.add(new Block(900));
        this.blocks.add(new Block(1100));
        this.blocks.add(new Block(1300));
        this.blocks.add(new Block(1500));

        this.entities.addAll(this.blocks);
        this.entities.add(this.player);
    }

    @Override
    public void update() {
        super.update();

        for (Block block: this.blocks) {
            if(this.player.isCollidingWith(block)) {
                Resources.hit.play();
            }
        }


    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Resources.backgroundColor);
        graphics.fillRect(0,0,800,450);
        graphics.drawImage(Resources.grassImage, 0, 405, null);

        for(Entity entity: this.entities) {
            graphics.drawImage(entity.getImage(), entity.x, entity.y, null);
        }
    }

    @Override
    public void onKeyPressed(int keyCode) {

    }
}
