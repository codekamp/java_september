package Hello;

import java.awt.event.ActionListener;

/**
 * Created by cerebro on 16/10/16.
 */
abstract public class Animal {

    public void walk() {
        System.out.println("tak tak tak tak");
    }

    abstract public void talk();

    //only abstract classes or interfaces can have abstract functions (methods)
}
