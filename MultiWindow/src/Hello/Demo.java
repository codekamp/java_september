package Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 17/09/16.
 */
public class Demo implements ActionListener {

    private JLabel label;
    private JButton colorButton;
    private JButton duplicateButton;

    private Demo[] childWindows = new Demo[30];
    private int childCount = 0;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.colorButton) {
            if (this.label.getForeground() == Color.green) {
                this.label.setForeground(Color.red);
            } else {
                this.label.setForeground(Color.green);
            }
        } else if (e.getSource() == this.duplicateButton) {
            this.childWindows[childCount] = Demo.createWindow();
            this.childCount++;
        } else {
            System.out.println("some other button clicked");
        }


    }

    public static Demo createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo demo1 = new Demo();

        demo1.colorButton = new JButton();
        demo1.colorButton.setText("Change Color");

        demo1.colorButton.addActionListener(demo1);
        panel.add(demo1.colorButton);

        demo1.duplicateButton = new JButton();
        demo1.duplicateButton.setText("duplicate");
        demo1.duplicateButton.addActionListener(demo1);
        panel.add(demo1.duplicateButton);

        demo1.label = new JLabel();
        demo1.label.setText("Hello World!");
        demo1.label.setForeground(Color.green);
        panel.add(demo1.label);

        frame.setVisible(true);

        return demo1;
    }
}
