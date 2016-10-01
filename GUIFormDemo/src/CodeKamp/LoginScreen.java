package CodeKamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by cerebro on 01/10/16.
 */
public class LoginScreen implements ActionListener {
    public JPanel panel;
    private JTextField passwordTextfield;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameTextfield;

    public LoginScreen() {
        super();

        this.loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("username: " + this.usernameTextfield.getText());
        System.out.println("password: " + this.passwordTextfield.getText());
    }
}
