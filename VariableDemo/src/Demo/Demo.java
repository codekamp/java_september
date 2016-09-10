package Demo;


/**
 * Created by cerebro on 10/09/16.
 */
public class Demo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Donald";
        dog1.jump();
        dog1.talk();
        dog1.chaseTail();

        Cat cat1 = new Cat();
        cat1.name = "Hilary";
        cat1.jump();
        cat1.talk();


        // In a variable of XYZ class we can store objects of XYZ class and it's subclasses
        Animal animal1 = new Dog();

        Object var1 = new Animal();
    }
}
