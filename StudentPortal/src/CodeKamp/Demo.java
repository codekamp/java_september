package CodeKamp;

import CodeKamp.Abcd.Dog;

public class Demo {

    public static int averageAge = 999;

    // alt + Enter for fixing errors
    // alt + control + L for code formatting

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.age = 19;
        student1.name = "Suresh";

        student1.email = "suresh@gmail.com";

        student2.name = "Mahesh";
        student2.age = 21;
        student2.email = "mahesh@gmail.com";

        student1.saveInDatabase();
        student2.saveInDatabase();
    }

    public static void saveInDatabase(Student student) {
        System.out.println("name: " + student.name);
    }
}