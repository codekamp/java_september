package Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 28/09/16.
 */
public class CodeKampFrame extends JFrame implements ActionListener {

    private JLabel label;
    private JButton colorButton;
    private JButton duplicateButton;

    public CodeKampFrame() {
        super();

        this.setSize(400, 500);

        JPanel panel = new JPanel();
        this.add(panel);

        this.colorButton = new JButton();
        this.colorButton.setText("Change Color");

        this.colorButton.addActionListener(this);
        panel.add(this.colorButton);

        this.duplicateButton = new JButton();
        this.duplicateButton.setText("duplicate");
        this.duplicateButton.addActionListener(this);
        panel.add(this.duplicateButton);

        this.label = new JLabel();
        this.label.setText("Hello World!");
        this.label.setForeground(Color.green);
        panel.add(this.label);
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
            CodeKampFrame frame = new CodeKampFrame();
            frame.setVisible(true);
        }
    }
}
