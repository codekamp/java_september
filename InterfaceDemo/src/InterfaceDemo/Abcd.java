package InterfaceDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 17/09/16.
 */
public class Abcd implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed of Abcd class");
    }
}
