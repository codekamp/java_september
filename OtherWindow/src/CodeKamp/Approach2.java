package CodeKamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 18/09/16.
 */
public class Approach2 implements ActionListener {
    private JButton button;
    private JLabel label;
    private Approach2 sibling;

    public static void main(String[] args) {

        Approach2 first = new Approach2();
        Approach2 second = new Approach2();
        first.sibling = second;
        second.sibling = first;

        JFrame frame1 = new JFrame();
        frame1.setSize(400, 500);
        JPanel panel1 = new JPanel();
        frame1.add(panel1);

        first.button = new JButton();
        first.button.setText("chagne color");
        first.button.addActionListener(first);
        panel1.add(first.button);

        first.label = new JLabel();
        first.label.setText("Hello world!");
        panel1.add(first.label);

        frame1.setVisible(true);





        JFrame frame2 = new JFrame();
        frame2.setSize(400, 500);
        JPanel panel2 = new JPanel();
        frame2.add(panel2);

        second.button = new JButton();
        second.button.setText("chagne color");
        second.button.addActionListener(second);
        panel2.add(second.button);

        second.label = new JLabel();
        second.label.setText("Hello world!");
        panel2.add(second.label);

        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.sibling.label.setForeground(Color.red);
    }
}
