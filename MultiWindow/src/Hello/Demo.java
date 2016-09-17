package Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 17/09/16.
 */
public class Demo implements ActionListener {

    private static JLabel label;
    private static JButton colorButton;
    private static JButton duplicateButton;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Demo.colorButton) {
            if (Demo.label.getForeground() == Color.green) {
                Demo.label.setForeground(Color.red);
            } else {
                Demo.label.setForeground(Color.green);
            }
        } else if (e.getSource() == Demo.duplicateButton) {
            Demo.createWindow();
        } else {
            System.out.println("some other button clicked");
        }


    }

    public static void createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo.colorButton = new JButton();
        Demo.colorButton.setText("Change Color");
        Demo demo1 = new Demo();
        Demo.colorButton.addActionListener(demo1);
        panel.add(Demo.colorButton);

        Demo.duplicateButton = new JButton();
        Demo.duplicateButton.setText("duplicate");
        Demo demo2 = new Demo();
        Demo.duplicateButton.addActionListener(demo2);
        panel.add(Demo.duplicateButton);

        Demo.label = new JLabel();
        Demo.label.setText("Hello World!");
        Demo.label.setForeground(Color.green);
        panel.add(Demo.label);

        frame.setVisible(true);
    }
}
