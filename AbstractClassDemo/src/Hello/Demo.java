package Hello;

import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by cerebro on 16/10/16.
 */
public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(3);

        Animal animal1;

        switch (randomInt) {
            case 0:
                animal1 = new Dog();
                break;
            case 1:
                animal1 = new Kangaroo();
                break;
            default:
                animal1 = new Cat();
                break;
        }

        animal1.walk();
        animal1.talk();
        animal1.add(10, 20);
    }
}
