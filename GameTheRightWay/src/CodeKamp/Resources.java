package CodeKamp;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 19/10/16.
 */
public class Resources {

    private Resources() {}

    public static Image grassImage;
    public static Image blockImage;
    public static List<Image> playerImages;
    public static Image playerJumpImage;
    public static Image playerDuckImage;
    public static Image welcomeImage;
    public static Image selectorImage;
    public static Color backgroundColor;
    public static AudioClip jump;
    public static AudioClip hit;

    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getResource("images/grass.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getResource("images/block.png"));
            Image player1Image = ImageIO.read(Resources.class.getResource("images/run_anim1.png"));
            Image player2Image = ImageIO.read(Resources.class.getResource("images/run_anim2.png"));
            Image player3Image = ImageIO.read(Resources.class.getResource("images/run_anim3.png"));
            Image player4Image = ImageIO.read(Resources.class.getResource("images/run_anim4.png"));
            Image player5Image = ImageIO.read(Resources.class.getResource("images/run_anim5.png"));
            Resources.playerDuckImage = ImageIO.read(Resources.class.getResource("images/duck.png"));
            Resources.playerImages = new ArrayList<>();
            Resources.playerImages.add(player1Image);
            Resources.playerImages.add(player2Image);
            Resources.playerImages.add(player3Image);
            Resources.playerImages.add(player4Image);
            Resources.playerImages.add(player5Image);
            Resources.playerImages.add(player4Image);
            Resources.playerImages.add(player3Image);
            Resources.playerImages.add(player2Image);
            Resources.playerJumpImage = ImageIO.read(Resources.class.getResource("images/jump.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getResource("images/welcome.png"));
            Resources.selectorImage = ImageIO.read(Resources.class.getResource("images/selector.png"));
            Resources.backgroundColor = new Color(82, 167, 255);

            Resources.jump = Applet.newAudioClip(Resources.class.getResource("images/onjump.wav"));
            Resources.hit = Applet.newAudioClip(Resources.class.getResource("images/hit.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void unload() {
        Resources.grassImage = null;
        Resources.blockImage = null;
        Resources.welcomeImage = null;
        Resources.playerDuckImage = null;

        System.gc();
    }
}
