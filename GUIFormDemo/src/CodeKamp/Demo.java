package CodeKamp;

import javax.swing.*;

/**
 * Created by cerebro on 01/10/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // code to create Jpanel and add stuff to it.

        LoginScreen screen = new LoginScreen();
        frame.add(screen.panel);


        frame.pack();
        frame.setVisible(true);
    }
}
