package Hello;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 17/09/16.
 */
public class Demo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        frame.add(panel);


        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }

        Image grassImage = null;
        Image playerImage = null;

        try {
            grassImage = ImageIO.read(Demo.class.getResource("Images/grass.png"));
            playerImage = ImageIO.read(Demo.class.getResource("Images/run_anim1.png"));
        } catch (IOException e) {
            System.out.println("unable to read image");
        }



        while (true) {
            Graphics g = panel.getGraphics();
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImage, 400, 315, null);
            g.dispose();
        }
    }
}
