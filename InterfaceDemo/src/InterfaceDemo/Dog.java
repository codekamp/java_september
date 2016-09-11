package InterfaceDemo;

/**
 * Created by cerebro on 11/09/16.
 */
public class Dog implements Educated {

    public void jump() {
        System.out.println("Jumping");
    }

    public void read(String text) {
        System.out.println("I am reading: " + text);
    }

    public void write(String text) {
        System.out.println("I am writing: " + text);
    }
}
