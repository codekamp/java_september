package CodeKamp;

/**
 * Created by cerebro on 18/09/16.
 */
public class Dog extends Animal {

    //constructor
    // 1. non static
    // 2. no return type
    // 3. same name as class name


    // 4. Only default (paramterless) constructors are inhertied and that too
    // in a very specific situation.
       // a. child class has no constructor
       // b. parent class has default (i.e. paramterless) constructor


    // 5. First line in any constructor should be a call to some parent constructor
    // directly or indirectly.


    public Dog() {
        this("Hello");


        System.out.println("Default Dog Constructor");
    }

    public Dog(String a) {
        super(1);
        System.out.println("Dog Constructor that takes string");
    }

    public void talk() {
        System.out.println("talk function of dog class");
        this.walk();
    }

    public void walk() {
        System.out.println("walk function of dog class");
    }


}
