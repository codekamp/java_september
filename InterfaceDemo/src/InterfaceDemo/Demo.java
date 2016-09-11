package InterfaceDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 11/09/16.
 */
public class Demo implements Educated {

    private static JTextField usernameField;
    private static JTextField passwordField;

    public static void main(String[] args) {

//in a variable of ABCD interface we can store objects of classes implmenting ABCD interface


        JFrame frame = new JFrame();
        frame.setSize(400, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo.usernameField = new JTextField();
        Demo.usernameField.setText("username");
        panel.add(Demo.usernameField);

        Demo.passwordField = new JTextField();
        Demo.passwordField.setText("Password");
        panel.add(Demo.passwordField);

        JButton loginButton = new JButton();
        loginButton.setText("Login!!");

        Demo demo1 = new Demo();
        loginButton.addActionListener(demo1);


        // demo1.actionPerformed
        panel.add(loginButton);

        frame.setVisible(true);

        Educated var1 = new Demo();


    }

    public void login() {
        String username = Demo.usernameField.getText();
        String password = Demo.passwordField.getText();

        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
    @Override
    public void read(String text) {

    }

    @Override
    public void write(String text) {

    }

    // codecademy.com
    // programmingByDoing.com
}
