package CodeKamp;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


/**
 * Created by cerebro on 24/09/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Dimension panelDimen = new Dimension(400, 500);
        panel.setPreferredSize(panelDimen);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Graphics g = panel.getGraphics();

        g.setColor(Color.red);

//        g.fillArc(300,0,100,100,-90,270);
//        g.fillArc(0,400,100,100,90,270);
//        g.fillArc(300,400,100,100,180,270);


// /Users/cerebro/IdeaProjects/java_september/GraphicsDemo/src/CodeKamp/images/run_anim1.png
        // images/run_anim1.png
        Image player1Image = null;
        Image player2Image = null;
        Image player3Image = null;
        Image player4Image = null;
        Image player5Image = null;
        Image grassImage = null;
        try {
            player1Image = ImageIO.read(Demo.class.getResource("images/run_anim1.png"));
            player2Image = ImageIO.read(Demo.class.getResource("images/run_anim2.png"));
            player3Image = ImageIO.read(Demo.class.getResource("images/run_anim3.png"));
            player4Image = ImageIO.read(Demo.class.getResource("images/run_anim4.png"));
            player5Image = ImageIO.read(Demo.class.getResource("images/run_anim5.png"));
            grassImage = ImageIO.read(Demo.class.getResource("images/grass.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

         // 1 2 3 4 5 4 3 2   1 2 3 4 5 4 3 2    1 2 3 4 5 4 3 2   1 2 3 4 5 4 3 2

        Image[] playerImages = {player1Image, player2Image, player3Image, player4Image, player5Image, player4Image, player3Image, player2Image};

        int x = 0;
        int y = 0;
        int xVel = 4;
        int yVel = 4;
        int imageIndex = 0;
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += xVel;
            y += yVel;

            imageIndex++;
            imageIndex = imageIndex % 8;

            if(x >= 300) {
                x = 300;
                xVel = -4;
            }

            if(y >= 400) {
                y = 400;
                yVel = -4;
            }

            if(y <= 0) {
                y = 0;
                yVel = 4;
            }

            if(x <= 0) {
                x = 0;
                xVel = 4;
            }

            g.clearRect(0,0,400,500);
            g.fillOval(x, y, 100, 100);
            g.drawImage(playerImages[imageIndex] ,200, 200, null);
            g.drawImage(grassImage,0,290,null);

        }

    }
}
