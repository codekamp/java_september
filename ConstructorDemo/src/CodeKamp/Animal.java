package CodeKamp;

/**
 * Created by cerebro on 18/09/16.
 */
public class Animal {

    public Animal() {
        super();
        System.out.println("Default animal constructor");
    }

    public Animal(int i) {
        super();
        System.out.println("Animal constructor which takes an integer in parameter");
    }

    public void talk() {
        System.out.println("talk function of animal class");
    }

    public void walk() {
        System.out.println("walk function of animal class");
    }
}
