package CodeKamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 18/09/16.
 */
public class Demo implements ActionListener {

    private static JButton window1Button;
    private static JButton window2Button;
    private static JLabel window1Label;
    private static JLabel window2Label;

    public static void main(String[] args) {

        Demo demo = new Demo();

        JFrame frame1 = new JFrame();
        frame1.setSize(400, 500);
        JPanel panel1 = new JPanel();
        frame1.add(panel1);

        Demo.window1Button = new JButton();
        Demo.window1Button.setText("chagne color");
        Demo.window1Button.addActionListener(demo);
        panel1.add(Demo.window1Button);

        Demo.window1Label = new JLabel();
        Demo.window1Label.setText("Hello world!");
        panel1.add(Demo.window1Label);

        frame1.setVisible(true);





        JFrame frame2 = new JFrame();
        frame2.setSize(400, 500);
        JPanel panel2 = new JPanel();
        frame2.add(panel2);

        Demo.window2Button = new JButton();
        Demo.window2Button.setText("chagne color");
        Demo.window2Button.addActionListener(demo);
        panel2.add(Demo.window2Button);

        Demo.window2Label = new JLabel();
        Demo.window2Label.setText("Hello world!");
        panel2.add(Demo.window2Label);

        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.window1Button) {
            Demo.window2Label.setForeground(Color.red);
        } else {
            Demo.window1Label.setForeground(Color.red);
        }
    }
}
