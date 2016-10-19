package CodeKamp;

import javax.swing.*;

/**
 * Created by cerebro on 19/10/16.
 */
public class Demo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();

        frame.add(panel);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
