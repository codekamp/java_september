package CodeKamp;

/**
 * Created by cerebro on 13/09/16.
 */
public class Student {

    public String name;
    public int age;
    public String email;


    public static String profession;

    // this  = object on which the function was called
    public void saveInDatabase() {
        System.out.println("name: " + this.name);
    }
}
