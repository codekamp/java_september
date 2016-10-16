package CodeKamp;

import java.util.*;

/**
 * Created by cerebro on 04/10/16.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> studentNames = Students.getNames();
        System.out.println(studentNames);

        Collections.shuffle(studentNames);
        System.out.println(studentNames);
    }
}
