package Demo;

/**
 * Created by cerebro on 10/09/16.
 */
public class Dog extends Animal {

    public void jump() {
        System.out.println("JUMPINGGGG!");
    }

    public void talk() {
        System.out.println("Wuff " + this.name);
    }

    public void chaseTail() {
        System.out.println("chasing the tail");
    }
}
