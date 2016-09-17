package InterfaceDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 11/09/16.
 */
public class Demo implements ActionListener {

    private static JTextField usernameField;
    private static JTextField passwordField;

    public static void main(String[] args) {


//in a variable of ActionListner interface we can store objects of classes implmenting ActionListner interface


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
        loginButton.setText("Rajnikant");
        loginButton.setForeground(Color.red);

        Abcd abcd1 = new Abcd();
        Demo demo1 = new Demo();
        loginButton.addActionListener(demo1);

        // button always calls actionPerformed when it is clicked. This is not customizable.
        // and while calling actionPerformed it passess an object of ActionEvent to it.
        // But function kiske upar call karna hai, this is customizable.

        panel.add(loginButton);

        frame.setVisible(true);
    }

    public void login() {
        String username = Demo.usernameField.getText();
        String password = Demo.passwordField.getText();

        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public void actionPerformed(Abcd a) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("");
    }
}
