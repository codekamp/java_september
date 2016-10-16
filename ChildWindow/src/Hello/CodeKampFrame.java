package Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 16/10/16.
 */
public class CodeKampFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private JButton duplicateButton;
    private JLabel label;
    private List<CodeKampFrame> childWindows = new ArrayList<>();

    public CodeKampFrame() {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        this.add(panel);
        panel.setPreferredSize(new Dimension(500, 500));

        this.changeColorButton = new JButton("Change color");
        this.changeColorButton.addActionListener(this);
        panel.add(this.changeColorButton);

        this.duplicateButton = new JButton("Duplicate");
        this.duplicateButton.addActionListener(this);

        panel.add(this.duplicateButton);

        this.label = new JLabel("Hello world!");
        panel.add(this.label);

        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.duplicateButton) {
            CodeKampFrame frame = new CodeKampFrame();
            frame.setVisible(true);
            this.walk();

            this.childWindows.add(frame);
        } else if(e.getSource() == this.changeColorButton) {
            this.changeLabelColor();
        }
    }

    public void changeLabelColor() {
        this.label.setForeground(Color.green);

        for (CodeKampFrame childWindow : this.childWindows) {
            childWindow.changeLabelColor();
        }
    }
}
