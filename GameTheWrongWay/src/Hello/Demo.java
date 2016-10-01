package Hello;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

/**
 * Created by cerebro on 17/09/16.
 */
public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        frame.add(panel);


        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocus();

        Demo demo1 = new Demo();
        panel.addKeyListener(demo1);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }

        Image grassImage = null;
        Image player1Image = null;
        Image player2Image = null;
        Image player3Image = null;
        Image player4Image = null;
        Image player5Image = null;
        Image playerJumpImage = null;
        Image blockImage = null;

        try {
            grassImage = ImageIO.read(Demo.class.getResource("Images/grass.png"));
            player1Image = ImageIO.read(Demo.class.getResource("Images/run_anim1.png"));
            player2Image = ImageIO.read(Demo.class.getResource("Images/run_anim2.png"));
            player3Image = ImageIO.read(Demo.class.getResource("Images/run_anim3.png"));
            player4Image = ImageIO.read(Demo.class.getResource("Images/run_anim4.png"));
            player5Image = ImageIO.read(Demo.class.getResource("Images/run_anim5.png"));
            playerJumpImage = ImageIO.read(Demo.class.getResource("Images/jump.png"));
            blockImage = ImageIO.read(Demo.class.getResource("Images/block.png"));
        } catch (IOException e) {
            System.out.println("unable to read image");
        }

        Image[] playerImages = {
                player1Image,
                player2Image,
                player3Image,
                player4Image,
                player5Image,
                player4Image,
                player3Image,
                player2Image
        };


        int imageIndex = 0;
        int playerXCord = 400;
        int blockXCord = 900;
        int blockYCord = 355;
        boolean blockVisible = true;
        Random random = new Random();

        Rectangle playerRect = new Rectangle();
        Rectangle blockRect = new Rectangle();

        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            imageIndex++;
            imageIndex = imageIndex % 8;

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord += Demo.playerYVel;

            blockXCord -= 5;
            if(blockXCord == -20) {
                blockXCord = 980;
                blockVisible = true;

                if(random.nextInt(2) == 0) {
                    blockYCord = 355;
                } else {
                    blockYCord = 295;
                }

            }

            if(Demo.playerYCord > 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }


            Image playerImage;
            if(Demo.playerYCord < 315) {
                playerImage = playerJumpImage;
            } else {
                playerImage = playerImages[imageIndex];
            }

            // check if player and block are colliding
            playerRect.setBounds(playerXCord, Demo.playerYCord, 72, 90);
            blockRect.setBounds(blockXCord, blockYCord, 20, 50);

            if(blockVisible && playerRect.intersects(blockRect)) {
                playerXCord -= 100;
                blockVisible = false;


            }



            Graphics g = panel.getGraphics();

            g.setColor(Color.blue);
            g.fillRect(0,0,800,450);

            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImage, playerXCord, Demo.playerYCord, null);

            if(blockVisible) {
                g.drawImage(blockImage, blockXCord, blockYCord, null);
            }

            g.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -18;
            Demo.playerYAcc = 1;
        } else {
            System.out.println("some other key pressed!");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
}
